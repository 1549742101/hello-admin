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
import org.springframework.web.bind.annotation.PathVariable;
import top.glkj.teacherEvaluation.bean.User;
import top.glkj.teacherEvaluation.services.UserService;

@Controller
public class UserController {
    @Autowired
    UserService userService;

    @GetMapping("user/{id}")
    public User getUer(@PathVariable Integer id ,Model model){
        return userService.getUerById(id);
    }


}
