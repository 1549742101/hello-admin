$(function(){
    let menuParent = $(".menu");
    let menu = $(".menu-tree");
    let clickMenu = $(menu).find("li");
    let frame = document.querySelector("#show");
    let closeAndOpenMenu = $(".menu-control");
    closeAndOpenMenu.click(function (){
        menuParent.toggleClass("hidden");
    })
    let barEdit = $(".menu-bar");
    ClickAToBar(clickMenu,frame,barEdit);
    BarEdit(barEdit,frame)
})

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
        "<span class=\"glyphicon glyphicon-remove\"></span>"+
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