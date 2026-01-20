package lms.model;

//User should be an abstract class
public abstract class User {
    private String userId;
    private String name;
    //private String password;
    public static int total_user = 0;

    // Getters and Setters
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static int getTotal_user() {
        return total_user;
    }

    public static void setTotal_user(int total_user) {
        User.total_user = total_user;
    }

    // Construnctor
    public User(String name){
        this.userId = generateUniqueId();
        this.name = name;
    }

    private String generateUniqueId(){
        return "user" + String.valueOf(++total_user);
    }

    public abstract void userDashboard();

    public abstract boolean canLend();
}
