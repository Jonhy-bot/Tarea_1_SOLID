package SRP.fixed;

public class Main {
    public static void main(String[] args) {
        /**
         * Clase principal para probar el sistema de autenticación.
         * Responsabilidad única: Ejecutar y demostrar el funcionamiento del sistema.
         */

        User user = new User("jonathan", "Jonathan123");

        AutheticationService autheticationService = new AutheticationService();

        UserValidator validator = new UserValidator();
        System.out.println("Username válido? " + validator.validateUsername(user.getUserName()));
        System.out.println("Password válido? " + validator.validatePassword(user.getPassword()));
        System.out.println("Usuario válido? " + validator.validateUser(user));

        autheticationService.registerUser(user);
        autheticationService.loginUser(user);
    }
}
