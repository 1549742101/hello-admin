package top.glkj.teacherEvaluation.controlllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author : xgl
 * @version : 0.0.1
 * @date :2020/9/8 11:42
 */
@Controller
public class HelloController {
    @RequestMapping({"/","/index","/index.html"})
    public String hello(){
        return "index";
    }
}
