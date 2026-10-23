public class LoginData
{
    // instance variables
    String Username;
    String Password;

    // default constructor
    public LoginData()
    {
        Username = "";
        Password = "";
    }

    // constructor with values
    public LoginData(String username, String password)
    {
        Username = username;
        Password = password;
    }

    // setter for Username
    public void setUsername(String username)
    {
        Username = username;
    }

    // setter for Password
    public void setPassword(String password)
    {
        Password = password;
    }

    // method to check login
    public boolean checkLogin(String user, String pass)
    {
        return user.equals(Username) && pass.equals(Password);
    }
}