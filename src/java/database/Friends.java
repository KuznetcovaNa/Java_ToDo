package java.database;

/**
 * Created by dnf on 08.11.15.
 */
public class Friends {
    private String username;
    private String friendName;

    private User currentUser;
    private User Friend;

    public Friends(String username, String friendName) {
        this.username = username;
        this.friendName = friendName;
    }

    public User getCurrentUser() {
        return currentUser;
    }

    public User getFriend() {
        return Friend;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getFriendName() {
        return friendName;
    }

    public void setFriendName(String friendName) {
        this.friendName = friendName;
    }
}
