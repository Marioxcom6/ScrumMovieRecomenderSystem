package src.user.normaluser;

public interface UserAccess {
    void registerUser(User user);
    void loginUser(String username, String password);
}
