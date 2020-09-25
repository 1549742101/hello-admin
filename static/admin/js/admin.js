$(function(){
    /*************************- index.html -*************************/
    let menuParent = $(".menu");
    let menu = $(".menu-tree");
    let json;
    $.ajax(
        {
            url:"../../static/admin/menu.json",
            type:"post",
            dataType:"text",
            success:function (result){
                json = result;
                createTreeMenu($(menu),json)
                //console.log(result)
            },
            error:function (e){
                console.log("error:")
                console.log(e)
            }
        }
    )
    let frame = document.querySelector("#show");
    let closeAndOpenMenu = $(".menu-control");
    closeAndOpenMenu.click(function (){
        menuParent.toggleClass("hidden");
    })
    let barEdit = $(".menu-bar");
    //ClickAToBar(clickMenu,frame,barEdit);
    BarEdit(barEdit,frame)
    /***********************- index.html -**************************/
})
/***********************- index.html -**************************/
function ClickAToBar(arr,obj,barEdit){
    for (let i = 0; i < arr.length; i++) {
        $(arr[i]).on("click",function (e){
            let src = $(arr[i]).attr("href");
            console.log(src)
            if (src&&src!==""){
                obj.src = src;
                $(barEdit).find("li").removeClass("active")
                $(barEdit).append(testHtml(src,$(arr[i]).children("text").html()));
                BarEdit(barEdit,obj)
            }
            console.log(i)
            for (let j = 0; j < arr.length; j++) {
                $(arr[j]).removeClass("active")
                if (i!==j){
                    $(arr[j]).removeClass("open");
                }
            }
            $(arr[i]).toggleClass("open");
            $(arr[i]).addClass("active");
            if ($(arr[i]).parent("ul").hasClass("menu-item")){
                $(arr[i]).parent("ul").parent("li").addClass("active open")
            }
            return false;
        })
        $(arr[i]).on("hover",function (e){
            $(arr[i]).attr("background","blue")
        })
    }
}
function testHtml(url,menuName){
    const html = "<li role=\"presentation\" class=\"active\">"+
        "<a href=\""+url+"\">"+
        " <text>"+menuName+"</text>"+
        "<span class=\"iconfont icon-close\"></span>"+
        "</a>"+
        "</li>";
    return html;
}
function BarEdit(parent,frame){
    let AChildes = $(parent).find("a");
    let closes = $(parent).find("span");
    let defaultBar = $(AChildes[0]);
    closes.click(function (){
        if ($(this).parent("a").parent("li").hasClass("active")){
            frame.src = $(defaultBar).attr("href");
            $(defaultBar).parent("li").addClass("active")
        }
        $(this).parent("a").parent("li").remove();
        return false;
    })
    AChildes.click(function (){
        $(AChildes).parent("li").removeClass("active")
        let href = $(this).prop("href");
        frame.src = href;
        $(this).parent("li").addClass("active")
        return false;
    })
}
let objMenu = [];
function createTreeMenu(parent,json){
    console.log(json)
    objMenu = JSON.parse(json);
    let html = "";
    for (let i = 0; i < objMenu.length; i++) {
        html+=createParent(objMenu[i].icon,objMenu[i].name,objMenu[i].child)
    }
    $(parent).append(html)
    openMenu();
    openTarget();
}
function createChildMenu(url,icon,name){
    const html =
        "<li href=\""+url+"\">\n" +
        "        <span class=\"iconfont "+icon+"\"></span>\n" +
        "        <text>"+name+"</text>\n" +
        "    </li>"
    return html;
}
function createParent(icon,name,child){
    let children="";

    for (let i = 0; i < child.length; i++) {
        if(child[i].child){
            children+=createParent(icon,name,child[i].child)
        }else {
            children+=createChildMenu(child[i].url,child[i].icon,child[i].name);
        }
    }
    const html =
        "<li class=\"parent\">\n" +
        "        <span class=\"iconfont "+icon+"\"></span>\n" +
        "        <text>"+name+"</text>\n" +
        "        <span class=\"iconfont icon-arrow-left-bold\"></span>"+
        "        <ul class=\"menu-item\">"+
        children+
        "        </ul>"+
        "</li>"
    return html;
}
function openMenu(){
    let menuParent = $(".menu-tree").find(".parent");
    for (let i = 0; i < menuParent.length; i++) {
        $(menuParent[i]).click(function (){
            if ($(this).hasClass("open")){
                console.log($(this))
                $(this).removeClass("open")
                return false;
            }
            $(menuParent).removeClass("open");
            let testParent = $(this).parents(".parent");
            for (let j = 0; j < testParent.length; j++) {
                $(testParent[j]).addClass("open");
            }
            $(this).addClass("open")
            return false;
        })
    }
}
let barMenu = [];
function openTarget(){
    let barEdit = $(".menu-bar");
    let frame = document.querySelector("#show");
    let child = $(".menu-tree").find("li:not(.parent)");
    $(child).click(function (){
        console.log($(this).attr("href"))
        $(child).removeClass("active");
        $(this).addClass("active");
        let src = $(this).attr("href");
        if (src&&src!==""){
            frame.src = src;
            $(barEdit).find("li").removeClass("active")
            let childTab = testHtml(src,$(this).children("text").html())
            if (!findVal(barMenu,childTab)){
                barMenu.push(childTab);
                $(barEdit).append(childTab);
            }else {
                let arr = $(barEdit).find("li");
                for (let i = 0; i < arr.length; i++) {
                    if ($(arr[i]).find("text").html()===$(this).children("text").html()){
                        $(arr[i]).addClass("active")
                    }
                }
            }
            BarEdit(barEdit,frame)
        }
        return false;
    })
}

function findVal(arr,str){
    for (let i = 0; i < arr.length; i++) {
        if (arr[i] === str){
            return true;
        }
    }
    return false;
}
/*************************- index.html -*************************/