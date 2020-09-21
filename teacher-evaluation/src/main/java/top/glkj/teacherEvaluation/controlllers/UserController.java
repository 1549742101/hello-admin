
package top.glkj.teacherEvaluation.controlllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import top.glkj.teacherEvaluation.bean.User;
import top.glkj.teacherEvaluation.services.UserService;

/**
 * @author ：高铭
 * @date ：Created in 2020/9/14 10:12
 * @version 0.0.2
 */
@Controller
@SessionAttributes(names = {"user"},value = {"user"})
public class UserController {
    @Autowired
    UserService userService;

    /**
     * 登陆页面控制器，默认为欢迎页面
     * @return login
     */
    @GetMapping({"/","/index","/index.html","/login","/login.html"})
    public String login(Model model,@SessionAttribute(name = "user",value = "user",required = false) User user){
        if (user==null){
            return "login";
        }else {
            return "index";
        }
    }
    @GetMapping({"/admin","/admin/index","/admin/login","/admin/index.html","/admin/login.html"})
    public String adminIndex(@SessionAttribute(name = "user",value = "user",required = false) User user,Model model){
        if (user!=null){
            return "/admin/index";
        }else {
            return "/admin/login";
        }
    }

    /**
     * 根据type权限确定评教类型，并跳转到相应的评教页面
     * @return Student_appraisal
     */
    @GetMapping("/user/appraisal")
    public String appraisal(@SessionAttribute("user") User user){
//        if(user.getUserType)
        System.out.println(user.getLoginName());
        System.out.println(user.getLoginName());
        return "Student_appraisal"; // return "Teacher_appraisal";
    }

    /**
     * 登录控制器，跳转到主页面
     * @param user user
     * @param model model
     * @return index
     */
    @PostMapping("/user/login")
    public String getUer(
            @RequestParam(name = "loginName") String userName,
            @RequestParam(name = "loginPass") String passWord,
            @SessionAttribute(name = "user",value = "user",required = false) User user,Model model){
        User user1 = userService.getUerByName(userName);
        if (user1!=null && userService.login(user1,passWord)){
            model.addAttribute("user",user1);
        }else {
            user = null;
            model.addAttribute("msg","用户名或密码错误");
        }
        return login(model,user);
    }

    /**
     * 新增一个用户（注册）
     * @param user user
     * @param model model
     * @return login
     */
    @ResponseBody
    @PostMapping("/admin/addUser")
    public boolean insertUer(User user, Model model){
        return userService.addUser(user);
    }

    /**
     * 改变信息
     * @param user user
     * @param model model
     * @return index
     */
    @PostMapping("/user/update")
    public String updateUer(User user, Model model){
        boolean rs = userService.updateUser(user);
        return "index";
    }

    /**
     * 删除一个用户
     * @param id id
     * @param model model
     * @return index
     */
    @PostMapping("/user/del")
    public String delUer(int id, Model model){
        boolean rs = userService.deleteUser(id);
        return "index";
    }
    @GetMapping("/admin/list")
    public String getAllUser(Model model){
        return "admin/admin-list";
    }

    @PostMapping("/admin/login")
    public String adminLogin(
            @RequestParam(name = "loginName") String userName,
            @RequestParam(name = "loginPass") String passWord,
            @SessionAttribute(name = "user",value = "user",required = false) User user,Model model){
        User user1 = userService.getUerByName(userName);
        if (user1!=null && userService.login(user1,passWord)){
            model.addAttribute("user",user1);
        }else {
            user = null;
            model.addAttribute("msg","用户名或密码错误");
        }
        return adminIndex(user,model);
    }
}
