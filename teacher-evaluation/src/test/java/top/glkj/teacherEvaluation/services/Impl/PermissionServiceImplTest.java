package top.glkj.teacherEvaluation.services.Impl;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import top.glkj.teacherEvaluation.services.PermissionService;
@RunWith(SpringRunner.class)
@SpringBootTest
public class PermissionServiceImplTest {
    @Autowired
    PermissionService permissionService;

    @Test
    public void selectPermission() {
        System.out.println(permissionService.selectPermission(1));
    }
}