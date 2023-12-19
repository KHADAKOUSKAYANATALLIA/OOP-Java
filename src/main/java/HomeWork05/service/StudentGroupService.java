package HomeWork05.service;

import HomeWork05.model.Student;
import HomeWork05.model.StudentGroup;
import HomeWork05.model.Teacher;

import java.util.List;

public class StudentGroupService {
    private StudentGroup studentGroup;

    public StudentGroupService() {
    }

    public StudentGroup createStudentGroup(Teacher t, List<Student> students) {
        this.studentGroup = new StudentGroup(t, students);
        return this.studentGroup;
    }

    public void addStudent(Student student) {
        if (!this.getStudentList().contains(student)) {
            this.getStudentList().add(student);
        }
    }

    public List<Student> getStudentList() {
        return this.studentGroup.getStudentList();
    }

    public Teacher getTeacher() {
        return this.studentGroup.getTeacher();
    }

    public StudentGroup getStudentGroup() {
        return studentGroup;
    }
}