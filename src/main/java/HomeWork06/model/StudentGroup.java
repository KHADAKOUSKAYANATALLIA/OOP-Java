package HomeWork06.model;

import java.util.List;

public class StudentGroup implements Iterable<Student>{
    private List<Student> studentList;
    private Teacher teacherList;

    public StudentGroup(Teacher teacher, List<Student> students) {
        this.studentList = students;
        this.teacherList = teacher;
    }

    public List<Student> getStudents() {
        return studentList;
    }

    public void setStudents(List<Student> students) {
        this.studentList = students;
    }

    public Teacher getTeacher() {
        return teacherList;
    }

    public void setTeacher(Teacher teacher) {
        this.teacherList = teacher;
    }

    @Override
    public String toString() {
        return "StudentGroup{" +
                "students=" + studentList +
                ", teacher=" + teacherList +
                '}';
    }

    @Override
    public StudentGroupIterator iterator() {
        return new StudentGroupIterator(this);
    }
}