package HomeWork04.service;

import HomeWork04.model.Student;
import HomeWork04.model.Teacher;
import java.util.ArrayList;
import java.util.List;

public class StudentService implements UserService<Student> {

    private final List<Student> studentList;

    public StudentService() {
        this.studentList = new ArrayList<>();
    }

    @Override
    public List<Teacher> getAll() {
        return null;
    }

    @Override
    public void create(String firstName, String secondName, String lastName) {
        int maxId = 0;
        for (Student i : studentList){
            if(maxId < i.getStudentId())
                maxId = i.getStudentId();
        }
        maxId++;
        studentList.add(new Student(firstName, secondName, lastName, maxId));
    }

    public List<Student> getStudentList() {
        return studentList;
    }
}