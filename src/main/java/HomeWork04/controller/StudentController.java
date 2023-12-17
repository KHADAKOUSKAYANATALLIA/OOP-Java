package HomeWork04.controller;

import HomeWork04.model.Student;
import HomeWork04.service.StudentService;
import HomeWork04.view.StudentView;


public class StudentController implements UserController<Student>{
    private final StudentService studentService = new StudentService();
    private final StudentView studentView = new StudentView();

    @Override
    public void create(String firstName, String secondName, String lastName) {
        studentService.create(firstName, secondName, lastName);
    }

    public void sendOnConsoleStudent(){
        studentView.sendOnConsole(studentService.getStudentList());

    }
}