package userRegistrationTask;

public class Registration {

    private String email;
    private String userName;
    private String password;

    public void setEmail(String email) {
        if (email.endsWith("@yahoo.com")) {
            this.email = email;
        } else {
            System.out.println("Invalid email. Only Yahoo emails are allowed.");
        }
    }
    public void setUserName(String userName) {
        if (userName != null && userName.length() > 6) {
            this.userName = userName;
        } else {
            System.out.println("Invalid userName. It must be longer than 6 characters.");
        }
    }
    public void setPassword(String password) {
        if (password != null && password.length() > 6 && !password.contains(userName)) {
            this.password = password;
        } else {
            System.out.println("Invalid password. It must be longer than 6 characters and cannot contain the userName.");
        }
    }
    public void displayUserDetails() {
        System.out.println("Email: " + email);
        System.out.println("UserName: " + userName);
        System.out.println("Password: " + password);
    }
    public static void main(String[] args) {
        Registration user = new Registration();
        user.setEmail("example@yahoo.com");
        user.setUserName("username123");
        user.setPassword("securePassword123");
        user.displayUserDetails();
    }
}

