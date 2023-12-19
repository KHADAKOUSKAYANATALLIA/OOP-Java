package HomeWork05;

import HomeWork05.controler.Controller;

public class Main {
    public static void main(String[] args) {
        Controller controller = new Controller();
        controller.createStudent("Natallia", "Petrova", "01.09.1988");
        controller.createStudent("Oleg", "Antonov", "07.09.1983");
        controller.createTeacher("Tamara", "Voronova", "07.07.1957");

        controller.createStudentGroup();
        controller.printStudentGroup();
    }
}


//        Controler controler = new Controler();
//        controler.createStudent("1", "1","1","1");
//        controler.createStudent("2", "2","2","2");
//        controler.getAllStudent();
//        controler.createStudent("3", "3","3","3");
///       controler.createStudent("4", "4","4","4");
//        controler.getAllStudent();
//    }
//}

