package HomeWork03;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student(1, "Oleg", "Olegov", "Olegovich");
        Student student2 = new Student(2, "Egor", "Egorov", "Egorovich");
        Student student3 = new Student(3, "Anton", "Antonov", "Antonovich");
        Student student4 = new Student(4, "Petr", "Petrov", "Petrovich");
        Student student5 = new Student(5, "Ignat", "Ignatov", "Ignatovich");
        Student student6 = new Student(6, "Alex", "Alexov", "Alexovich");
        Student student7 = new Student(7, "Sergey", "Sergeey", "Sergeevich");
        Student student8 = new Student(8, "Denis", "Denisov", "Denisovich");
        Student student9 = new Student(9, "Oleg", "Petrov", "Antonovich");
        Student student10 = new Student(10, "Alex", "Egorov", "Denisovich");
        Student student11 = new Student(11, "Oleg", "Alexov", "Petrovich");

        Group group1 = new Group(1);
        group1.addStudent(student1);
        group1.addStudent(student2);
        System.out.println(group1);

        Group group2 = new Group(2);
        group2.addStudent(student3);
        group2.addStudent(student4);
        group2.addStudent(student5);
        group2.addStudent(student6);
        System.out.println(group2);

        Group group3 = new Group(3);
        group3.addStudent(student7);
        group3.addStudent(student8);
        group3.addStudent(student9);
        System.out.println(group3);

        Group group4 = new Group(4);
        group4.addStudent(student10);
        group4.addStudent(student11);
        System.out.println(group4);

        Stream stream1 = new Stream(1);
        stream1.addGroup(group1);
        stream1.addGroup(group2);
        stream1.addGroup(group3);

        Stream stream2 = new Stream(2);
        stream2.addGroup(group4);

        List<Stream> streamsList = new ArrayList<>();
        streamsList.add(stream1);
        streamsList.add(stream2);
        System.out.println(streamsList);
    }
}
//        Student student1 = new Student(4, "aab", "aab", "aab");
//        Student student2 = new Student(2, "aaa", "aaa", "aaa");
//        Student student3 = new Student(3, "Aaa", "Aaa", "Aaa");
//        Student student4 = new Student(1, "bbb", "bbb", "bbb");
//        List<Student> studentList = new ArrayList<>();
//        StudentGroup studentGroup = new StudentGroup(studentList);
//        studentGroup.addStudent(student1);
//        studentGroup.addStudent(student2);
//        studentGroup.addStudent(student3);
//        studentGroup.addStudent(student4);
//        StudentGroupService service = new StudentGroupService(studentGroup);
//        for (Student student : studentGroup) {
//            System.out.println(student);
//        }
//        System.out.println();
//        for (Student student : service.getSortedStudentGroup()) {
//            System.out.println(student);
//        }
//        System.out.println();
//        for (Student student : service.getSortedStudentGroupByFIO()) {
//            System.out.println(student);
//        }
//        StudentGroupIterator iterator = new StudentGroupIterator(studentGroup);
//        while (iterator.hasNext())
//            System.out.println(iterator.next());
//        System.out.println();
//        for (Student student : studentGroup) {
//            System.out.println(student);
//        }
//    }
//}
