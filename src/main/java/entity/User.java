package entity;

public abstract class User{
    private int id;
    private String GUID;
    private String password;

    public User(int id, String userName, String password) {
        this.id = id;
        this.GUID = userName;
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return GUID;
    }

    public void setUserName(String userName) {
        this.GUID = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
