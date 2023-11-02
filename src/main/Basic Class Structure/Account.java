public class Account extends User {
    private String username; // username
    private String password; // password

    public Account(String username, String password, String firstName, String lastName, String email, String phoneNumber, String address) {
        super(username, password, firstName, lastName, email, phoneNumber, address);
        this.username = username;
        this.setPassword(password);
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;

    }
}
