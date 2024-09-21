
package mabsprojectzero;
public class Accounts {
 
    private int aid;
    private String firstName;
    private String lastName;
    private String email;
    private String username;
    private String password;

    public Accounts(int aid, String firstName, String lastName, String email, String username, String password) {
        this.aid = aid;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.username = username;
        this.password = password; // Consider encrypting or hashing the password in a real application
    }

    public int getAid() {
        return aid;
    }

    public String getEmail() {
        return email;
    }

    public String getUsername() {
        return username;
    }

    // Optional: Method to validate password (if needed)
    public boolean checkPassword(String inputPassword) {
        return this.password.equals(inputPassword);
    }

    public void viewAccounts() {
        System.out.printf("%-5d %-10s %-10s %-20s %-10s\n", aid, firstName, lastName, email, username);
    }
}
   
