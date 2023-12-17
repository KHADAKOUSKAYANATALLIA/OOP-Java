package HomeWork04.controller;

import HomeWork04.model.User;

public interface UserController<T extends User>{
    void create(String firstName, String secondName, String lastName);
}