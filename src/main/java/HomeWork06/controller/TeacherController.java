package HomeWork06.controller;

import HomeWork04.model.Teacher;
import HomeWork04.service.TeacherService;
import HomeWork04.view.TeacherView;

import java.util.List;

public class TeacherController implements UserController<Teacher> {
    private final TeacherService teacherService = new TeacherService();
    private final TeacherView teacherView = new TeacherView();

    @Override
    public void create(String firstName, String secondName, String lastName) {
        teacherService.create(firstName, secondName, lastName);
    }

    public List<Teacher> getAll() {
        return teacherService.getAll();
    }

    public void sendOnConsoleTeacher() {
        teacherView.sendOnConsole(teacherService.getTeacherList());
    }
}
