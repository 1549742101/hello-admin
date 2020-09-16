/**
 * @author ：高铭
 * @date ：Created in 2020/9/14 10:12
 * @description：
 * @modified By：
 * @version: $
 */
package top.glkj.teacherEvaluation.controlllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import top.glkj.teacherEvaluation.bean.User;
import top.glkj.teacherEvaluation.services.UserService;

@Controller
public class UserController {
    @Autowired
    UserService userService;

    /**
     * 登陆页面控制器，默认为欢迎页面
     * @return
     */
    @GetMapping({"/","/index","/index.html"})
    public String index(){
        return "login";
    }

    @GetMapping("/user/ping")
    public String pingJiao(){
        
        int[] a;
        int b[];
        return "Student_appraisal";
    }

    /**
     * 登录控制器，跳转到主页面
     * @param user
     * @param model
     * @return
     */
    @RequestMapping("/user/login")
    public String getUer(User user,Model model){
        User user1 = userService.getUerByName(user.getLoginName());
        System.out.println(user1.getUserName());
        model.addAttribute("u",user1);
        return "index";
    }

    /**
     * 新增一个用户（注册）
     * @param user
     * @param model
     * @return
     */
    @RequestMapping("/user/reg")
    public String insertUer(User user, Model model){
        int rs = userService.insertUserByName(user);
        return "login";
    }

    /**
     * 改变信息
     * @param user
     * @param model
     * @return
     */
    @RequestMapping("/user/update")
    public String updateUer(User user, Model model){
        int rs = userService.updateUserByName(user);
        return "index";
    }

    /**
     * 删除一个用户
     * @param id
     * @param model
     * @return
     */
    @RequestMapping("/user/del")
    public String delUer(int id, Model model){
        int rs = userService.deleteUser(id);
        return "index";
    }



}
