package HomeWork04;

import HomeWork04.controller.StudentController;
import HomeWork04.controller.TeacherController;

public class Main {
    public static void main(String[] args) {
        TeacherController tc = new TeacherController();
        tc.create("Oleg", "Olegov", "Olegovich");
        tc.create("Anton", "Antonov", "Antonovich");
        tc.create("Egor", "Egorov", "Egorovich");
        tc.sendOnConsoleTeacher();

//        StudentController controller = new StudentController();
//        controller.create("aab", "aab", "aab");
//        controller.create("ab", "ab", "ab");
//        controller.sendOnConsoleStudent();
    }
}


