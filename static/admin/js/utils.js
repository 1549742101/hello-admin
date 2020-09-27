function alertProp(title,msg,btn1Text,btn2Text,fun1,fun2){
    let id = "model"+Number.parseInt(Math.random()*10+"");
    if (!btn1Text){
        btn1Text = "确认"
    }
    if (!btn2Text){
        btn2Text ="取消"
    }
    if (!title){
        title = "弹框提示"
    }
    if (!msg){
        msg = "确认执行这个操作吗？"
    }
    console.log(typeof(fun1))
    //fun1();
    if (!fun1||typeof (fun1)!='function'){
        fun1 = function (){
            console.log("你执行了‘"+btn1Text+"’操作")
        }
    }
    if (!fun2||typeof (fun2)!='function'){
        fun2 = function (){
            console.log("你执行了‘"+btn2Text+"’操作")
        }
    }
    this.fun1 = fun1;
    this.fun2 = fun2;
    let body = $("body");
    const html =
        "<div class=\"modal fade show\" id=\""+id+"\" tabindex=\"-1\" role=\"dialog\"\n" +
        "     aria-labelledby=\"myModalLabel\" aria-hidden=\"true\"\n" +
        "     data-backdrop=\"static\" data-keyboard=\"false\"\n" +
        "     aria-modal=\"true\"\n" +
        ">\n" +
        "    <div class=\"modal-dialog\">\n" +
        "        <div class=\"modal-content\">\n" +
        "            <div class=\"modal-header\">\n" +
        "                <button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-hidden=\"true\">×\n" +
        "                </button>\n" +
        "                <h4 class=\"modal-title\" id=\"myModalLabel\">\n" +
        "                    "+title+"\n" +
        "                </h4>\n" +
        "            </div>\n" +
        "            <div class=\"modal-body text-danger\">\n" +
        "                "+msg+"\n" +
        "            </div>\n" +
        "            <div class=\"modal-footer\">\n" +
        "                <div class=\"row\">\n" +
        "                    <div class=\"col-sm-5 text-right\">\n" +
        "                        <button type=\"button\" class=\"btn btn-warning\" onclick=\"fun1();\" data-dismiss=\"modal\">\n" +
        "                            "+btn1Text+"\n" +
        "                        </button>\n" +
        "                    </div>\n" +
        "                    <div class=\"col-sm-offset-1 col-sm-6 text-left\">\n" +
        "                        <button type=\"button\" class=\"btn btn-primary\" onclick=\"fun2();\" data-dismiss=\"modal\">\n" +
        "                            "+btn2Text+"\n" +
        "                        </button>\n" +
        "                    </div>\n" +
        "                </div>\n" +
        "            </div>\n" +
        "        </div><!-- /.modal-content -->\n" +
        "    </div><!-- /.modal-dialog -->\n" +
        "</div><!-- /.modal -->"
    $(body).append(html);
    let model = $("#"+id);
    //model.on('show.bs.modal', centerModals(model));
    model.modal('show')
    //$(window).on('resize', centerModals(model));
    model.on("hide.bs.modal",function (){
        $(model).remove();
    })
}
function alertWarning(title,msg,ms){
    if (!title){
        title = "警告！"
    }
    if (!msg){
        msg = "你执行了危险操作"
    }
    if (!ms){
        ms = 3000;
    }
    let html =
        "<div class=\"alert alert-warning myAlertWarning\">\n" +
        "    <a href=\"#\" class=\"close\" data-dismiss=\"alert\">\n" +
        "        &times;\n" +
        "    </a>\n" +
        "    <strong>"+title+"</strong>"+msg+"\n" +
        "</div>"
    let body = $("body");
    $(body).prepend(html);
    setTimeout(function (){
        //console.log(1111)
        $(".myAlertWarning").remove();
    },ms);
}
function alertSuccess(title,msg,ms){
    if (!title){
        title = "信息！"
    }
    if (!msg){
        msg = "你成功执行了操作"
    }
    if (!ms){
        ms = 3000;
    }
    let html =
        "<div class=\"alert alert-success myAlertSuccess\">\n" +
        "    <a href=\"#\" class=\"close\" data-dismiss=\"alert\">\n" +
        "        &times;\n" +
        "    </a>\n" +
        "    <strong>"+title+"</strong>"+msg+"\n" +
        "</div>"
    let body = $("body");
    $(body).prepend(html);
    setTimeout(function (){
        $(".myAlertSuccess").remove();
    },ms);
}
