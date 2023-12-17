package HomeWork04.model;

import java.time.LocalDate;

public class Student extends User implements Comparable<Student>{
    private int studentId;

    public Student(String firstName, String secondName, String lastName, int studentId) {
        super(firstName, secondName, lastName);
        this.studentId = studentId;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    @Override
    public String toString() {
        return "Student{" + "studentId=" + studentId +
                ", firstName='" + getFirstName() + '\'' +
                ", secondName='" + getSecondName() + '\'' +
                ", lastName='" + getLastName() + '\'' +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        if(studentId > o.getStudentId())
            return 1;
        if(studentId < o.getStudentId())
            return -1;
        return 0;
    }
}


