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
})

function ClickAToBar(arr,obj,barEdit){
    for (let i = 0; i < arr.length; i++) {
        $(arr[i]).on("click",function (e){
            let src = $(arr[i]).attr("href");
            console.log(src)
            if (src&&src!==""){
                obj.src = src;
                $(barEdit).append(testHtml(src,$(arr[i]).children("text").html()));
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
function BarEdit(parent){

}