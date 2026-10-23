/**
 * @(#)User.java
 *
 *
 * @author
 * @version 1.00 2026/2/15
 */

public class User {

    //instance variables @ global variables @ attributes @ data fields
    String username;
    String password;

    //default constructor
    public User() {
        username = "";
        password = "";
    }

    //constructor w value - to assign global w specified value
    public User(String u, String p) {
        username = u;
        password = p;
    }

    //instance method for username (untuk set value)
    public void setUsername(String u) {
        username = u;
    }

   //instance method for password (untuk set value)
    public void setPassword(String p) {
        password = p; 
    }

    //instance method for username (untuk read value)
    public String getUsername() {
        return username;
    }
    //instance method for password (untuk read value)
    public String getPassword() {
        return password;
    }
}