package java.database;

import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Long;
import java.lang.String;
import java.util.List;

public class Task extends DBClass {
    private Long taskId;
    private Long dateCreate;
    private Long dateChange;
    private String taskText;
    private String taskTitle;
    private Boolean isArchived;
    private Integer priority;

    private List<TaskUsers> taskUsersList;

    public Task(Long taskId, String taskText, String taskTitle, Integer priority) {
        this.taskId = taskId;
        this.dateCreate = System.currentTimeMillis();
        this.dateChange = System.currentTimeMillis();
        this.taskText = taskText;
        this.taskTitle = taskTitle;
        this.isArchived = Boolean.FALSE;
        this.priority = priority;
    }

    public List<TaskUsers> getTaskUsersList() {
        return taskUsersList;
    }

    public Long getTaskId() {
        return taskId;
    }

    public void setTaskId(Long taskId) {
        this.taskId = taskId;
    }

    public Long getDateCreate() {
        return dateCreate;
    }

    public void setDateCreate(Long dateCreate) {
        this.dateCreate = dateCreate;
    }

    public Long getDateChange() {
        return dateChange;
    }

    public void setDateChange(Long dateChange) {
        this.dateChange = dateChange;
    }

    public String getTaskText() {
        return taskText;
    }

    public void setTaskText(String taskText) {
        this.taskText = taskText;
    }

    public String getTaskTitle() {
        return taskTitle;
    }

    public void setTaskTitle(String taskTitle) {
        this.taskTitle = taskTitle;
    }

    public Boolean getIsArchived() {
        return isArchived;
    }

    public void setIsArchived(Boolean isArchived) {
        this.isArchived = isArchived;
    }

    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }
}