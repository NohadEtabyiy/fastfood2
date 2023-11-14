package com.example.fastfood2;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String matricul;
    private String password;

    // Constructor
    public User(String matricul, String password) {
        this.matricul = matricul;
        this.password = password;
    }

    // Getters and Setters for matricul
    public String getMatricul() {
        return matricul;
    }

    public void setMatricul(String matricul) {
        this.matricul = matricul;
    }

    // Getters and Setters for password
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    // Static list of users
    private static List<User> usersList = new ArrayList<>();

    // Method to add a user to the list
    public static void addUser(User user) {
        usersList.add(user);
    }

    // Method to get the list of users
    public static List<User> getUsersList() {
        return usersList;
    }
}
