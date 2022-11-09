package com.example.seg2105_project_gr49v4;

public class UserData {
    private String userId;
    private String email;
    private String username;
    private String role;

    public UserData(String email, String userId, String role, String username) {
        this.userId = userId;
        this.email = email;
        this.username = username;
        this.role = role;
    }

    public UserData() {
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
