package HomeWork05.controler;

import HomeWork05.model.Student;
import HomeWork05.model.Type;
import HomeWork05.service.DataService;
import HomeWork05.service.StudentGroupService;
import HomeWork05.view.StudentGroupView;
import HomeWork05.view.StudentView;

import java.util.List;

public class Controller {
    DataService dataService = new DataService();
    StudentView studentView = new StudentView();
    StudentGroupView studentGroupView = new StudentGroupView();
    StudentGroupService studentGroupService = new StudentGroupService();

    public void createStudent(String firstName, String secondName, String dateOfBirth) {
        dataService.create(firstName, secondName, dateOfBirth, Type.STUDENT);
    }

    public void createTeacher(String firstName, String secondName, String dateOfBirth) {
        dataService.create(firstName, secondName, dateOfBirth, Type.TEACHER);
    }

    public void getAllStudents() {
        List<Student> students = dataService.getAllStudent();
        for (Student s : students) {
            studentView.printOnConsole(s);
        }
    }

    public void printStudentGroup() {
        studentGroupView.printStudentGroup(studentGroupService.getStudentGroup());
    }

    public void createStudentGroup() {
        studentGroupService.createStudentGroup(dataService.getTeacher(), dataService.getAllStudent());
    }

}