package HomeWork06.service;

import HomeWork04.model.Teacher;
import HomeWork04.model.User;

import java.util.List;



public interface UserService <T extends User>{
    List<Teacher> getAll();

    void create(String firstName, String secondName, String lastName);
}
