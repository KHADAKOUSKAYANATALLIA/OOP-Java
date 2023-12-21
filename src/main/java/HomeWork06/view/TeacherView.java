package HomeWork06.view;

import HomeWork04.model.Teacher;

import java.util.List;

public class TeacherView implements UserView<Teacher> {

    @Override
    public void sendOnConsole(List<Teacher> list) {
        for(Teacher i: list){
            System.out.println(i + " ");
        }
    }
}



