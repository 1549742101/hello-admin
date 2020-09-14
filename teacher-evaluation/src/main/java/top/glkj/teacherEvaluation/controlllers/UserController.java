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

    @RequestMapping("/user/login")
   //@PathVariable String loginName
    public String getUer(User user,Model model){
        User user1 = userService.getUerByName(user.getLoginName());
        model.addAttribute("user",user);
        return "index";
    }

    @GetMapping("/index")
    public String index(){
        return "login";
    }


}
