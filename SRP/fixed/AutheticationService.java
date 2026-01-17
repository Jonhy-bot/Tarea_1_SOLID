package SRP.fixed;

public class AutheticationService {
    /**
     * Esta clase hace la autenticación de usuarios.
     * Responsabilidad única: Gestionar el registro e inicio de sesión de usuarios.
     * 
     * Esta clase utiliza UserValidator para validar las credenciales antes de
     * permitir el registro o login.
     * 
     */
    private UserValidator validator;

    public AutheticationService() {
        this.validator = new UserValidator(); // Acá lo que hice fue crear la instancia de un solo tiro para que así en
                                              // los métodos pudieran usar el validateUser,
        // y así se validan los usarios de una vez.
    }

    public void registerUser(User user) {
        if (validator.validateUser(user)) {
            System.out.println("User registered successfully");
        } else {
            System.out.println("Invalid username or password");

        }
    }

    public void loginUser(User user) {
        if (validator.validateUser(user)) {
            System.out.println("User logged in successfully");
        } else {
            System.out.println("Invalid username or password");

        }
    }

}
