import java.io.*;
import java.util.HashMap;
import java.util.Map;

/**
 * Bank class manages the banking system
 */
public class Bank {
    private Map<String, User> users;
    private Map<String, Account> accounts;
    private String dataFilePath = "bank_data.dat";
    
    public Bank() {
        this.users = new HashMap<>();
        this.accounts = new HashMap<>();
        loadData();
    }
    
    /**
     * Register a new user
     */
    public boolean registerUser(String userId, String name, String email, 
                               String password, String phoneNumber) {
        if (users.containsKey(userId)) {
            System.out.println("Error: User ID already exists!");
            return false;
        }
        
        User user = new User(userId, name, email, password, phoneNumber);
        users.put(userId, user);
        saveData();
        System.out.println("✓ User registered successfully!");
        return true;
    }
    
    /**
     * Authenticate user login
     */
    public User loginUser(String userId, String password) {
        User user = users.get(userId);
        
        if (user == null) {
            System.out.println("Error: User not found!");
            return null;
        }
        
        if (!user.getPassword().equals(password)) {
            System.out.println("Error: Invalid password!");
            return null;
        }
        
        System.out.println("✓ Login successful! Welcome, " + user.getName() + "!");
        return user;
    }
    
    /**
     * Create a new account for user
     */
    public Account createAccount(String userId, String accountType, double initialBalance) {
        if (!users.containsKey(userId)) {
            System.out.println("Error: User not found!");
            return null;
        }
        
        if (initialBalance < 0) {
            System.out.println("Error: Initial balance cannot be negative!");
            return null;
        }
        
        String accountNumber = generateAccountNumber();
        Account account = new Account(accountNumber, accountType, userId, initialBalance);
        accounts.put(accountNumber, account);
        saveData();
        
        System.out.println("✓ Account created successfully!");
        System.out.println("  Account Number: " + accountNumber);
        System.out.println("  Account Type: " + accountType);
        System.out.println("  Initial Balance: RM " + String.format("%.2f", initialBalance));
        
        return account;
    }
    
    /**
     * Get user accounts
     */
    public Map<String, Account> getUserAccounts(String userId) {
        Map<String, Account> userAccounts = new HashMap<>();
        
        for (Account account : accounts.values()) {
            if (account.getUserId().equals(userId)) {
                userAccounts.put(account.getAccountNumber(), account);
            }
        }
        
        return userAccounts;
    }
    
    /**
     * Get account by account number
     */
    public Account getAccount(String accountNumber) {
        return accounts.get(accountNumber);
    }
    
    /**
     * Transfer money between accounts
     */
    public boolean transferBetweenAccounts(String fromAccountNumber, String toAccountNumber, 
                                          double amount) {
        Account fromAccount = accounts.get(fromAccountNumber);
        Account toAccount = accounts.get(toAccountNumber);
        
        if (fromAccount == null || toAccount == null) {
            System.out.println("Error: One or both accounts not found!");
            return false;
        }
        
        if (!fromAccount.transfer(amount, toAccountNumber, "Transfer")) {
            return false;
        }
        
        // Add deposit transaction to recipient account
        toAccount.deposit(amount, "Transfer from " + fromAccountNumber);
        saveData();
        
        return true;
    }
    
    /**
     * Generate unique account number
     */
    private String generateAccountNumber() {
        return "ACC" + System.currentTimeMillis();
    }
    
    /**
     * Save all data to file
     */
    public void saveData() {
        try (ObjectOutputStream oos = new ObjectOutputStream(
                new FileOutputStream(dataFilePath))) {
            oos.writeObject(users);
            oos.writeObject(accounts);
        } catch (IOException e) {
            System.out.println("Error saving data: " + e.getMessage());
        }
    }
    
    /**
     * Load data from file
     */
    @SuppressWarnings("unchecked")
    private void loadData() {
        File file = new File(dataFilePath);
        if (!file.exists()) {
            return;
        }
        
        try (ObjectInputStream ois = new ObjectInputStream(
                new FileInputStream(dataFilePath))) {
            users = (Map<String, User>) ois.readObject();
            accounts = (Map<String, Account>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error loading data: " + e.getMessage());
        }
    }
    
    /**
     * Get user by ID
     */
    public User getUser(String userId) {
        return users.get(userId);
    }
    
    /**
     * Check if user exists
     */
    public boolean userExists(String userId) {
        return users.containsKey(userId);
    }
}
