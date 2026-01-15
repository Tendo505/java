import java.util.Map;
import java.util.Scanner;

/**
 * BankingApp - Main Application Class
 * Menu-driven banking application similar to Maybank
 */
public class BankingApp {
    private Bank bank;
    private Scanner scanner;
    private User currentUser;
    private Account currentAccount;
    
    public BankingApp() {
        this.bank = new Bank();
        this.scanner = new Scanner(System.in);
        this.currentUser = null;
        this.currentAccount = null;
    }
    
    /**
     * Main menu
     */
    public void start() {
        System.out.println("\n╔════════════════════════════════════════╗");
        System.out.println("║                                        ║");
        System.out.println("║         WELCOME TO MAYBANK APP         ║");
        System.out.println("║                                        ║");
        System.out.println("╚════════════════════════════════════════╝");
        
        while (true) {
            if (currentUser == null) {
                displayAuthenticationMenu();
            } else {
                displayMainMenu();
            }
        }
    }
    
    /**
     * Authentication menu (Login/Register)
     */
    private void displayAuthenticationMenu() {
        System.out.println("\n========== AUTHENTICATION ==========");
        System.out.println("1. Login");
        System.out.println("2. Register");
        System.out.println("3. Exit");
        System.out.println("====================================");
        System.out.print("Choose an option (1-3): ");
        
        String choice = scanner.nextLine().trim();
        
        switch (choice) {
            case "1":
                login();
                break;
            case "2":
                register();
                break;
            case "3":
                System.out.println("\nThank you for using Maybank App. Goodbye!");
                System.exit(0);
                break;
            default:
                System.out.println("Invalid option. Please try again.");
        }
    }
    
    /**
     * Login functionality
     */
    private void login() {
        System.out.println("\n========== LOGIN ==========");
        System.out.print("Enter User ID: ");
        String userId = scanner.nextLine().trim();
        
        System.out.print("Enter Password: ");
        String password = scanner.nextLine().trim();
        
        currentUser = bank.loginUser(userId, password);
    }
    
    /**
     * Register functionality
     */
    private void register() {
        System.out.println("\n========== REGISTER NEW ACCOUNT ==========");
        
        System.out.print("Enter User ID: ");
        String userId = scanner.nextLine().trim();
        
        if (bank.userExists(userId)) {
            System.out.println("Error: User ID already exists!");
            return;
        }
        
        System.out.print("Enter Full Name: ");
        String name = scanner.nextLine().trim();
        
        System.out.print("Enter Email: ");
        String email = scanner.nextLine().trim();
        
        System.out.print("Enter Password: ");
        String password = scanner.nextLine().trim();
        
        System.out.print("Enter Phone Number: ");
        String phoneNumber = scanner.nextLine().trim();
        
        if (bank.registerUser(userId, name, email, password, phoneNumber)) {
            System.out.println("\nAccount created successfully! You can now login.");
        }
    }
    
    /**
     * Main menu after login
     */
    private void displayMainMenu() {
        System.out.println("\n========== MAIN MENU ==========");
        System.out.println("Welcome, " + currentUser.getName() + "!");
        System.out.println("1. Create Account");
        System.out.println("2. Select Account");
        System.out.println("3. View My Accounts");
        System.out.println("4. Logout");
        System.out.println("===============================");
        System.out.print("Choose an option (1-4): ");
        
        String choice = scanner.nextLine().trim();
        
        switch (choice) {
            case "1":
                createAccount();
                break;
            case "2":
                selectAccount();
                break;
            case "3":
                viewMyAccounts();
                break;
            case "4":
                logout();
                break;
            default:
                System.out.println("Invalid option. Please try again.");
        }
    }
    
    /**
     * Create a new account
     */
    private void createAccount() {
        System.out.println("\n========== CREATE NEW ACCOUNT ==========");
        System.out.println("Account Types: SAVINGS, CHECKING");
        System.out.print("Enter Account Type: ");
        String accountType = scanner.nextLine().trim().toUpperCase();
        
        if (!accountType.equals("SAVINGS") && !accountType.equals("CHECKING")) {
            System.out.println("Error: Invalid account type!");
            return;
        }
        
        System.out.print("Enter Initial Balance (RM): ");
        try {
            double initialBalance = Double.parseDouble(scanner.nextLine().trim());
            bank.createAccount(currentUser.getUserId(), accountType, initialBalance);
        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid amount!");
        }
    }
    
    /**
     * Select an account to perform operations
     */
    private void selectAccount() {
        Map<String, Account> userAccounts = bank.getUserAccounts(currentUser.getUserId());
        
        if (userAccounts.isEmpty()) {
            System.out.println("\nNo accounts found. Please create an account first.");
            return;
        }
        
        System.out.println("\n========== SELECT ACCOUNT ==========");
        int index = 1;
        for (Account account : userAccounts.values()) {
            System.out.println(index + ". " + account.getAccountNumber() + 
                             " (" + account.getAccountType() + ") - Balance: RM " + 
                             String.format("%.2f", account.getBalance()));
            index++;
        }
        System.out.print("Select account number: ");
        
        try {
            int accountIndex = Integer.parseInt(scanner.nextLine().trim());
            Account[] accounts = userAccounts.values().toArray(new Account[0]);
            
            if (accountIndex >= 1 && accountIndex <= accounts.length) {
                currentAccount = accounts[accountIndex - 1];
                displayAccountMenu();
            } else {
                System.out.println("Invalid selection!");
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid input!");
        }
    }
    
    /**
     * Display account operations menu
     */
    private void displayAccountMenu() {
        while (currentAccount != null) {
            System.out.println("\n========== ACCOUNT MENU ==========");
            System.out.println("Account: " + currentAccount.getAccountNumber());
            System.out.println("Balance: RM " + String.format("%.2f", currentAccount.getBalance()));
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Transfer");
            System.out.println("4. View Transaction History");
            System.out.println("5. View Recent Transactions");
            System.out.println("6. Back to Main Menu");
            System.out.println("=================================");
            System.out.print("Choose an option (1-6): ");
            
            String choice = scanner.nextLine().trim();
            
            switch (choice) {
                case "1":
                    deposit();
                    break;
                case "2":
                    withdraw();
                    break;
                case "3":
                    transfer();
                    break;
                case "4":
                    currentAccount.displayTransactionHistory();
                    break;
                case "5":
                    currentAccount.displayRecentTransactions(5);
                    break;
                case "6":
                    currentAccount = null;
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }
    
    /**
     * Deposit money
     */
    private void deposit() {
        System.out.println("\n========== DEPOSIT ==========");
        System.out.print("Enter deposit amount (RM): ");
        
        try {
            double amount = Double.parseDouble(scanner.nextLine().trim());
            System.out.print("Enter description (optional): ");
            String description = scanner.nextLine().trim();
            if (description.isEmpty()) {
                description = "Deposit";
            }
            currentAccount.deposit(amount, description);
            bank.saveData();
        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid amount!");
        }
    }
    
    /**
     * Withdraw money
     */
    private void withdraw() {
        System.out.println("\n========== WITHDRAW ==========");
        System.out.print("Enter withdrawal amount (RM): ");
        
        try {
            double amount = Double.parseDouble(scanner.nextLine().trim());
            System.out.print("Enter description (optional): ");
            String description = scanner.nextLine().trim();
            if (description.isEmpty()) {
                description = "Withdrawal";
            }
            currentAccount.withdraw(amount, description);
            bank.saveData();
        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid amount!");
        }
    }
    
    /**
     * Transfer money to another account
     */
    private void transfer() {
        System.out.println("\n========== TRANSFER ==========");
        System.out.print("Enter recipient account number: ");
        String recipientAccountNumber = scanner.nextLine().trim();
        
        Account recipientAccount = bank.getAccount(recipientAccountNumber);
        if (recipientAccount == null) {
            System.out.println("Error: Recipient account not found!");
            return;
        }
        
        System.out.print("Enter transfer amount (RM): ");
        try {
            double amount = Double.parseDouble(scanner.nextLine().trim());
            System.out.print("Enter description (optional): ");
            String description = scanner.nextLine().trim();
            if (description.isEmpty()) {
                description = "Transfer";
            }
            
            if (bank.transferBetweenAccounts(currentAccount.getAccountNumber(), 
                                            recipientAccountNumber, amount)) {
                System.out.println("✓ Transfer completed successfully!");
            }
        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid amount!");
        }
    }
    
    /**
     * View all user accounts
     */
    private void viewMyAccounts() {
        Map<String, Account> userAccounts = bank.getUserAccounts(currentUser.getUserId());
        
        if (userAccounts.isEmpty()) {
            System.out.println("\nNo accounts found.");
            return;
        }
        
        System.out.println("\n========== MY ACCOUNTS ==========");
        for (Account account : userAccounts.values()) {
            System.out.println(account.getAccountNumber() + " | " + 
                             account.getAccountType() + " | Balance: RM " + 
                             String.format("%.2f", account.getBalance()));
        }
        System.out.println("=================================");
    }
    
    /**
     * Logout
     */
    private void logout() {
        System.out.println("\nLogging out...");
        currentUser = null;
        currentAccount = null;
        System.out.println("✓ Logged out successfully!");
    }
    
    /**
     * Main method to run the application
     */
    public static void main(String[] args) {
        BankingApp app = new BankingApp();
        app.start();
    }
}
