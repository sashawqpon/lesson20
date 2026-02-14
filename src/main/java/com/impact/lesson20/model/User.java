package com.impact.lesson20.model;

public class User {
    private Long id;
    private String username;
    private String email;
    private String password;
    private String role;
    private boolean enabled;

    //Getters

    public Long getId() {
        return id;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public String getRole() {
        return role;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }

    public String getUsername() {
        return username;
    }

    // Setters


    public void setId(Long id) {
        this.id = id;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setRole(String role) {
        this.role = role;
    }

    // constructors

    public User(boolean enabled, String role, String password, String email, String username) {
        this.enabled = enabled;
        this.role = role;
        this.password = password;
        this.email = email;
        this.username = username;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;



    }
}
