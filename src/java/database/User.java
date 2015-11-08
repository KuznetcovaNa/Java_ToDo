package java.database;

import java.util.List;

public class User{
    private String username;
    private String email;
    private String password;
    private Boolean isVerified;
    private long dateCreate;

    private List<TaskUsers> taskUsersList;

    public User(String username, String email, String password) {
        this.username = username;
        this.email = email;
        this.password = password;
        this.isVerified = Boolean.FALSE;
        this.dateCreate = System.currentTimeMillis();
    }

    public List<TaskUsers> getTaskUsersList() {
        return taskUsersList;
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