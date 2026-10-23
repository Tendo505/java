import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Account class represents a bank account
 */
public class Account implements Serializable {
    private static final long serialVersionUID = 1L;
    
    private String accountNumber;
    private String accountType; // SAVINGS, CHECKING
    private String userId;
    private double balance;
    private List<Transaction> transactionHistory;
    private double interestRate; // For savings accounts
    private boolean isActive;
    
    /**
     * Constructor to create a new account
     */
    public Account(String accountNumber, String accountType, String userId, double initialBalance) {
        this.accountNumber = accountNumber;
        this.accountType = accountType;
        this.userId = userId;
        this.balance = initialBalance;
        this.transactionHistory = new ArrayList<>();
        this.interestRate = accountType.equalsIgnoreCase("SAVINGS") ? 2.5 : 0.5;
        this.isActive = true;
    }
    
    /**
     * Deposit money to account
     */
    public boolean deposit(double amount, String description) {
        if (amount <= 0) {
            System.out.println("Error: Deposit amount must be positive!");
            return false;
        }
        
        balance += amount;
        String transactionId = generateTransactionId();
        Transaction transaction = new Transaction(transactionId, accountNumber, "DEPOSIT", 
                                                 amount, description, balance);
        transactionHistory.add(transaction);
        
        System.out.println("✓ Deposit successful! Amount: RM " + String.format("%.2f", amount));
        System.out.println("  New balance: RM " + String.format("%.2f", balance));
        return true;
    }
    
    /**
     * Withdraw money from account
     */
    public boolean withdraw(double amount, String description) {
        if (amount <= 0) {
            System.out.println("Error: Withdrawal amount must be positive!");
            return false;
        }
        
        if (amount > balance) {
            System.out.println("Error: Insufficient balance! Your balance: RM " + 
                             String.format("%.2f", balance));
            return false;
        }
        
        balance -= amount;
        String transactionId = generateTransactionId();
        Transaction transaction = new Transaction(transactionId, accountNumber, "WITHDRAWAL", 
                                                 amount, description, balance);
        transactionHistory.add(transaction);
        
        System.out.println("✓ Withdrawal successful! Amount: RM " + String.format("%.2f", amount));
        System.out.println("  New balance: RM " + String.format("%.2f", balance));
        return true;
    }
    
    /**
     * Transfer money to another account
     */
    public boolean transfer(double amount, String recipientAccountNumber, String description) {
        if (amount <= 0) {
            System.out.println("Error: Transfer amount must be positive!");
            return false;
        }
        
        if (amount > balance) {
            System.out.println("Error: Insufficient balance for transfer!");
            return false;
        }
        
        balance -= amount;
        String transactionId = generateTransactionId();
        Transaction transaction = new Transaction(transactionId, accountNumber, "TRANSFER", 
                                                 amount, description + " to " + recipientAccountNumber, 
                                                 balance);
        transactionHistory.add(transaction);
        
        System.out.println("✓ Transfer successful! Amount: RM " + String.format("%.2f", amount));
        System.out.println("  Transferred to account: " + recipientAccountNumber);
        System.out.println("  New balance: RM " + String.format("%.2f", balance));
        return true;
    }
    
    /**
     * Get account balance
     */
    public double getBalance() {
        return balance;
    }
    
    /**
     * Display transaction history
     */
    public void displayTransactionHistory() {
        if (transactionHistory.isEmpty()) {
            System.out.println("No transactions found for this account.");
            return;
        }
        
        System.out.println("\n========== TRANSACTION HISTORY ==========");
        System.out.println("Account: " + accountNumber + " | Type: " + accountType);
        System.out.println("=========================================");
        
        for (Transaction tx : transactionHistory) {
            System.out.println(tx);
        }
        
        System.out.println("=========================================");
        System.out.println("Current Balance: RM " + String.format("%.2f", balance));
    }
    
    /**
     * Get recent transactions (last 5)
     */
    public void displayRecentTransactions(int count) {
        if (transactionHistory.isEmpty()) {
            System.out.println("No transactions found.");
            return;
        }
        
        System.out.println("\n========== RECENT TRANSACTIONS ==========");
        int start = Math.max(0, transactionHistory.size() - count);
        for (int i = start; i < transactionHistory.size(); i++) {
            System.out.println((i - start + 1) + ". " + transactionHistory.get(i));
        }
        System.out.println("=========================================");
    }
    
    /**
     * Generate unique transaction ID
     */
    private String generateTransactionId() {
        return "TXN" + System.currentTimeMillis();
    }
    
    // Getters and Setters
    public String getAccountNumber() {
        return accountNumber;
    }
    
    public String getAccountType() {
        return accountType;
    }
    
    public String getUserId() {
        return userId;
    }
    
    public List<Transaction> getTransactionHistory() {
        return new ArrayList<>(transactionHistory);
    }
    
    public double getInterestRate() {
        return interestRate;
    }
    
    public boolean isActive() {
        return isActive;
    }
    
    public void setBalance(double balance) {
        this.balance = balance;
    }
    
    @Override
    public String toString() {
        return "Account{" +
                "accountNumber='" + accountNumber + '\'' +
                ", accountType='" + accountType + '\'' +
                ", balance=" + balance +
                ", interestRate=" + interestRate + "%" +
                ", isActive=" + isActive +
                '}';
    }
}
