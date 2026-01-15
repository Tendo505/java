import java.io.Serializable;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * Transaction class represents a bank transaction
 */
public class Transaction implements Serializable {
    private static final long serialVersionUID = 1L;
    
    private String transactionId;
    private String accountNumber;
    private String transactionType; // DEPOSIT, WITHDRAWAL, TRANSFER
    private double amount;
    private LocalDateTime timestamp;
    private String description;
    private double balanceAfter;
    
    /**
     * Constructor to create a new transaction
     */
    public Transaction(String transactionId, String accountNumber, String transactionType, 
                      double amount, String description, double balanceAfter) {
        this.transactionId = transactionId;
        this.accountNumber = accountNumber;
        this.transactionType = transactionType;
        this.amount = amount;
        this.timestamp = LocalDateTime.now();
        this.description = description;
        this.balanceAfter = balanceAfter;
    }
    
    // Getters
    public String getTransactionId() {
        return transactionId;
    }
    
    public String getAccountNumber() {
        return accountNumber;
    }
    
    public String getTransactionType() {
        return transactionType;
    }
    
    public double getAmount() {
        return amount;
    }
    
    public LocalDateTime getTimestamp() {
        return timestamp;
    }
    
    public String getDescription() {
        return description;
    }
    
    public double getBalanceAfter() {
        return balanceAfter;
    }
    
    @Override
    public String toString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        return "Transaction{" +
                "ID='" + transactionId + '\'' +
                ", Type='" + transactionType + '\'' +
                ", Amount=" + amount +
                ", Date=" + timestamp.format(formatter) +
                ", Description='" + description + '\'' +
                ", Balance After=" + balanceAfter +
                '}';
    }
}
