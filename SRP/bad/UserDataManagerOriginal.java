package SRP.bad;

public class UserDataManagerOriginal {
    private String username;
    private String password;

    public UserDataManagerOriginal(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public void registerUser() {
        if (validateUsername(username) && validatePassword(password)) {
            System.out.println("User registered successfully.");
        } else {
            System.out.println("Invalid username or password.");
        }
    }

    public void loginUser() {
        if (validateUsername(username) && validatePassword(password)) {
            System.out.println("User logged in successfully.");
        } else {
            System.out.println("Invalid username or password.");
        }
    }

    private boolean validateUsername(String username) {
        return username.length() >= 5 && username.matches("[a-zA-Z_0-9]+");
    }

    private boolean validatePassword(String password) {
        return password.length() >= 8 && password.matches("^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d).+$");
    }

    public static void main(String[] args) {
        UserDataManagerOriginal userManager = new UserDataManagerOriginal("john_doe", "Password123");
        userManager.registerUser();
        userManager.loginUser();
    }
}
