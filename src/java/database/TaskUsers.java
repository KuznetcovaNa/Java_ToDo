package java.database;

public class TaskUsers {
    private Long taskId;
    private Long relativeTaskId;
    private String username;

    private User user;
    private Task task;

    public TaskUsers(Long taskId, Long relativeTaskId, String username) {
        this.taskId = taskId;
        this.relativeTaskId = relativeTaskId;
        this.username = username;
    }

    public Long getRelativeTaskId() {
        return relativeTaskId;
    }

    public void setRelativeTaskId(Long relativeTaskId) {
        this.relativeTaskId = relativeTaskId;
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
