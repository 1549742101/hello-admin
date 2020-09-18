
package top.glkj.teacherEvaluation.controlllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.bind.annotation.SessionAttributes;
import top.glkj.teacherEvaluation.bean.User;
import top.glkj.teacherEvaluation.services.UserService;

/**
 * @author ：高铭
 * @date ：Created in 2020/9/14 10:12
 * @version 0.0.2
 */
@Controller
@SessionAttributes(names = {"user"})
public class UserController {
    @Autowired
    UserService userService;

    /**
     * 登陆页面控制器，默认为欢迎页面
     * @return login
     */
    @GetMapping({"/","/index","/index.html"})
    public String index(){
        return "login";
    }

    /**
     *
     * @return Student_appraisal
     */
    @GetMapping("/user/ping")
    public String pingJiao(){
        return "Student_appraisal";
    }

    /**
     * 登录控制器，跳转到主页面
     * @param user user
     * @param model model
     * @return index
     */
    @RequestMapping("/user/login")
    public String getUer(User user,Model model){
        User user1 = userService.getUerByName(user.getLoginName());
        if (user1!=null && userService.login(user1,user.getPassWord())){
            model.addAttribute("user",user1);
            return "index";
        }else {
            model.addAttribute("msg","用户名或密码错误");
            return "login";
        }
    }

    /**
     * 新增一个用户（注册）
     * @param user user
     * @param model model
     * @return login
     */
    @RequestMapping("/user/reg")
    public String insertUer(User user, Model model){
        boolean rs = userService.addUser(user);
        return "login";
    }

    /**
     * 改变信息
     * @param user user
     * @param model model
     * @return index
     */
    @RequestMapping("/user/update")
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
    @RequestMapping("/user/del")
    public String delUer(int id, Model model){
        boolean rs = userService.deleteUser(id);
        return "index";
    }



}
