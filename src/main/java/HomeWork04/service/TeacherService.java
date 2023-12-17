package HomeWork04.service;

import HomeWork04.model.Teacher;

import java.util.ArrayList;
import java.util.List;

public class TeacherService implements UserService<Teacher> {

    private final List<Teacher> teacherList;

    public TeacherService() {
        this.teacherList = new ArrayList<>();
    }

    @Override
    public List<Teacher> getAll() {
        return teacherList;
    }

    @Override
    public void create(String firstName, String secondName, String lastName) {
        int countMaxId = 0;
        for (Teacher teacher : teacherList) {
            if (countMaxId >= teacher.getTeacherId()) {
                continue;
            }
            countMaxId = teacher.getTeacherId();
        }
        countMaxId++;
        Teacher teacher = new Teacher(firstName, secondName, lastName, countMaxId);
        teacherList.add(teacher);
    }

    public List<Teacher> getTeacherList() {
        return teacherList;
    }
}