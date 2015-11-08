package java.database;

public class TaskUsers {
    private Long taskId;
    private Long relativeTaskId;
    private String username;
    private Boolean readOnly;

    private User user;
    private Task task;

    public TaskUsers(Long taskId, Long relativeTaskId, String username, Boolean readOnly) {
        this.taskId = taskId;
        this.relativeTaskId = relativeTaskId;
        this.username = username;
        this.readOnly = readOnly;
    }

    public User getUser() {
        return user;
    }

    public Task getTask() {
        return task;
    }

    public Long getRelativeTaskId() {
        return relativeTaskId;
    }

    public void setRelativeTaskId(Long relativeTaskId) {
        this.relativeTaskId = relativeTaskId;
    }

    public Boolean getReadOnly() {
        return readOnly;
    }

    public void setReadOnly(Boolean readOnly) {
        this.readOnly = readOnly;
    }

    public Long getTaskId() {
        return taskId;
    }

    public void setTaskId(Long taskId) {
        this.taskId = taskId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
