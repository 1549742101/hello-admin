function editStatus(val,url){
    let tr = $(val).parents("tr");
    let id = $(tr).find("input[type='checkbox']").val();
    let tdStatus = $(tr).find(".td-status");
    let statusBtn = $(tdStatus).find("button");
    let status = statusBtn.text()!=="已禁用";
    let statusText = statusBtn.text()==="已禁用"?"启用":"禁用";
    const defaultEnableText = "<button class=\"btn btn-info\">已启用</button>"
    const defaultDisableText = "<button class=\"btn btn-default\" disabled>已禁用</button>"
    alertProp("变更用户","<span class='text-danger'>确认"+statusText+"编号为"+id+"用户吗？</span>","确定"+statusText,"取消",
        function (){
            if (status){
                $(tdStatus).prepend(defaultDisableText);
                statusBtn.remove()
            }else {
                $(tdStatus).prepend(defaultEnableText);
                statusBtn.remove()
            }
        },function (){

        }
    )
    $(this).on("click",function (){
        return false;
    })
    return false;
}
function editOpen(val,url){
    alertProp(null,null,null,null);
    $(this).on("click",function (){
        return false;
    })
    return false;
}
function editDelete(val,url,e){
    let tr = $(val).parents("tr");
    let id = $(tr).find("input[type='checkbox']").val();
    alertProp("删除用户","<span class='text-danger'>确认删除编号为"+id+"的数据吗</span>","确认删除","取消删除",
        function (){
            let res = true;
            if (res){
                $(tr).remove();
                alertSuccess("信息提示！","你删除了编号为"+id+"的数据！")
            }else {
                alertWarning("信息提示！","删除编号为"+id+"的数据时发生了错误！")
            }
        },function (){
            alertWarning("信息提示！","你取消了删除！")
        });
    $(this).on("click",function (){
        return false;
    })
    return false;
}
function editPassWord(){
    alertProp(null,null,null,null);
    $(this).on("click",function (){
        return false;
    })
    return false;
}
function allDelete(){
    let checks = $("table>tbody").find("input[type='checkbox']");
    if (checks.length===0){
        alertWarning("删除失败!","你未选择任何数据")
    }else{
        let arr = [];
        for (let i = 0; i < checks.length; i++) {
            if ($(checks[i]).is(":checked")){
                arr.push($(checks[i]).val())
            }
        }
        if (arr.length===0){
            alertWarning("删除失败!","你未选择任何数据")
        }else {
            alertProp("删除用户","确认删除选中的用户吗？","确认删除","取消",
                function (){
                    for (let i = 0; i < checks.length; i++) {
                        if ($(checks[i]).is(":checked")){
                            let tr = $(checks[i]).parents("tr");
                            $(tr).remove();
                        }
                    }
                    $(".all-check").prop("checked",false);
                },function (){
                    console.log(checks)
                })
        }
    }
}
function add(){
    alertProp();
}
$(function (){
    let allCheck = $(".all-check");
    //console.log(allCheck)
    allCheck.click(function (){
        let checked = $(this).prop("checked");
        let allCheckBox = $("table").find("input[type='checkbox']");
        allCheckBox.prop("checked",checked)
    })
})

// function centerModals(model) {
//     $(model).each(
//         function(i) {
//             let $clone = $(this).clone().css('display','block').appendTo('body');
//             let top = Math.round(($clone.height() - $clone.find('.modal-content').height()) / 2);
//             top = top > 0 ? top : 0;
//             $clone.remove();
//             $(this).find('.modal-content').css("margin-top", top);
//         });
// }
// function alertProp(title,msg,btn1Text,btn2Text,fun1,fun2){
//     let id = "model"+Number.parseInt(Math.random()*10+"");
//     if (!btn1Text){
//         btn1Text = "确认"
//     }
//     if (!btn2Text){
//         btn2Text ="取消"
//     }
//     if (!title){
//         title = "弹框提示"
//     }
//     if (!msg){
//         msg = "确认执行这个操作吗？"
//     }
//     if (!fun1){
//         fun1 = function (){
//             console.log("你执行了‘"+btn1Text+"’操作")
//         }
//     }
//     if (!fun2){
//         fun2 = function (){
//             console.log("你执行了‘"+btn2Text+"’操作")
//         }
//     }
//     this.fun1 = fun1;
//     this.fun2 = fun2;
//     let body = $("body");
//     const html =
//         "<div class=\"modal fade show\" id=\""+id+"\" tabindex=\"-1\" role=\"dialog\"\n" +
//         "     aria-labelledby=\"myModalLabel\" aria-hidden=\"true\"\n" +
//         "     data-backdrop=\"static\" data-keyboard=\"false\"\n" +
//         "     aria-modal=\"true\"\n" +
//         ">\n" +
//         "    <div class=\"modal-dialog\">\n" +
//         "        <div class=\"modal-content\">\n" +
//         "            <div class=\"modal-header\">\n" +
//         "                <button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-hidden=\"true\">×\n" +
//         "                </button>\n" +
//         "                <h4 class=\"modal-title\" id=\"myModalLabel\">\n" +
//         "                    "+title+"\n" +
//         "                </h4>\n" +
//         "            </div>\n" +
//         "            <div class=\"modal-body text-danger\">\n" +
//         "                "+msg+"\n" +
//         "            </div>\n" +
//         "            <div class=\"modal-footer\">\n" +
//         "                <div class=\"row\">\n" +
//         "                    <div class=\"col-sm-5 text-right\">\n" +
//         "                        <button type=\"button\" class=\"btn btn-warning\" onclick=\"fun1();\" data-dismiss=\"modal\">\n" +
//         "                            "+btn1Text+"\n" +
//         "                        </button>\n" +
//         "                    </div>\n" +
//         "                    <div class=\"col-sm-offset-1 col-sm-6 text-left\">\n" +
//         "                        <button type=\"button\" class=\"btn btn-primary\" onclick=\"fun2();\" data-dismiss=\"modal\">\n" +
//         "                            "+btn2Text+"\n" +
//         "                        </button>\n" +
//         "                    </div>\n" +
//         "                </div>\n" +
//         "            </div>\n" +
//         "        </div><!-- /.modal-content -->\n" +
//         "    </div><!-- /.modal-dialog -->\n" +
//         "</div><!-- /.modal -->"
//     $(body).append(html);
//     let model = $("#"+id);
//     model.on('show.bs.modal', centerModals(model));
//     model.modal('show')
//     $(window).on('resize', centerModals(model));
//     model.on("hide.bs.modal",function (){
//         $(model).remove();
//     })
// }