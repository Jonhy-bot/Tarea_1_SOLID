package SRP.fixed;

public class User {
    /**
     * Clase que representa un usuario del sistema.
     * Responsabilidad única: Almacenar los datos del usuario (username y password).
     */
    private String userName;
    private String password;

    public User(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserName() {
        return userName;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }
}
