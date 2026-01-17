package SRP.fixed;

public class UserValidator {
    /**
     * Clase encargada de validar el nombre y contraseñas de los usuarios.
     * Responsabilidad única: Validar que username y password cumplan con los
     * requisitos.
     */

    public boolean validateUsername(String username) {
        return username.length() >= 5 && username.matches("[a-zA-Z_0-9]+");
    }

    public boolean validatePassword(String password) {
        return password.length() >= 8 && password.matches("^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d).+$");
    }

    public boolean validateUser(User user) {
        return validateUsername(user.getUserName()) && validatePassword(user.getPassword());
    }

}
