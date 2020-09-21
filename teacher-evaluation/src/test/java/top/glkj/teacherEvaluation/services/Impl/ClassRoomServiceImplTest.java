package top.glkj.teacherEvaluation.services.Impl;

        import org.junit.Test;
        import org.junit.runner.RunWith;
        import org.springframework.beans.factory.annotation.Autowired;
        import org.springframework.boot.test.context.SpringBootTest;
        import org.springframework.test.context.junit4.SpringRunner;
        import top.glkj.teacherEvaluation.bean.ClassRoom;
        import top.glkj.teacherEvaluation.services.ClassRoomService;

        import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ClassRoomServiceImplTest {

    @Autowired
    ClassRoomService classRoomService;
    @Test
    public void getAllClassRoom() {

        System.out.println(classRoomService.getAllClassRoom());
    }

    @Test
    public void getClassRoomById() {
        System.out.println("ID查询:"+classRoomService.getClassRoomById(2));
    }

    @Test
    public void addClassRoom() {
        ClassRoom classRoom = new ClassRoom();
        classRoom.setClassName("测试3班");
        classRoom.setColId(3);
        classRoom.setCounselorId(8003);
        classRoom.setProfession("计算机专业");
        boolean rs =  classRoomService.addClassRoom(classRoom);
        System.out.println("增加测试:"+rs);
    }

    @Test
    public void updateClassRoomById() {
        ClassRoom classRoom = new ClassRoom();
        classRoom.setId(2);
        classRoom.setClassName("测试2班");
        classRoom.setColId(2);
        classRoom.setCounselorId(8002);
        classRoom.setProfession("计算机专业");
        boolean rs =  classRoomService.updateClassRoomById(classRoom);
        System.out.println("更新测试:"+rs);
    }

    @Test
    public void deleteClassRoom() {
        boolean rs =  classRoomService.deleteClassRoom(3);
        System.out.println("删除测试:"+rs);
    }
}