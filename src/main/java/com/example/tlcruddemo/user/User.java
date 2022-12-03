package com.example.tlcruddemo.user;

public class User {
    Long id;
    String username;
    String email;
    Boolean enabled;

    public User(Long id) {
        this.id = id;
        this.enabled = true;
    }

    public User(Long id, String username, String email, Boolean enabled) {
        this.id = id;
        this.username = username;
        this.email = email;
        this.enabled = true;
    }
}
