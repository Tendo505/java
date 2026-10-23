public class LoginCredentials {
    private String adminUsername = "admin";
    private String adminPassword = "admin123";

    public boolean authenticate(String username, String password) {
        return username.equals(adminUsername) && password.equals(adminPassword);
    }

    public String getAdminUsername() {
        return adminUsername;
    }

    public String getAdminPassword() {
        return adminPassword;
    }
}
