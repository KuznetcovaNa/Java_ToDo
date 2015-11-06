package java.database;

import java.util.List;

public class User{
    private String username;
    private String email;
    private String password;
    private Boolean isAdmin;
    private Boolean isVerified;
    private long dateCreate;

    private List<TaskUsers> taskUsersList;

    public User(String username, String email, String password, Boolean isAdmin, Boolean isVerified, long dateCreate) {
        this.username = username;
        this.email = email;
        this.password = password;
        this.isAdmin = isAdmin;
        this.isVerified = isVerified;
        this.dateCreate = dateCreate;
    }

    public List<TaskUsers> getTaskUsersList() {
        return taskUsersList;
    }

    public void setTaskUsersList(List<TaskUsers> taskUsersList) {
        this.taskUsersList = taskUsersList;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Boolean getIsAdmin() {
        return isAdmin;
    }

    public void setIsAdmin(Boolean isAdmin) {
        this.isAdmin = isAdmin;
    }

    public Boolean getIsVerified() {
        return isVerified;
    }

    public void setIsVerified(Boolean isVerified) {
        this.isVerified = isVerified;
    }

    public long getDateCreate() {
        return dateCreate;
    }

    public void setDateCreate(long dateCreate) {
        this.dateCreate = dateCreate;
    }
}