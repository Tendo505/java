# Banking Application - Class Documentation

## 📚 Class Overview

This document explains each class in the banking application system.

---

## 1. User Class

**File**: `User.java`

**Purpose**: Represents a bank customer with personal information and credentials.

### Attributes
```java
- userId (String)      : Unique identifier for the user
- name (String)        : Full name of the user
- email (String)       : Email address
- password (String)    : Account password
- phoneNumber (String) : Contact phone number
```

### Key Methods
```java
User(String userId, String name, String email, String password, String phoneNumber)
  → Constructor to create new user

toString()
  → Display user information in readable format
```

### Example Usage
```java
User user = new User("john123", "John Doe", "john@example.com", "pass123", "0123456789");
System.out.println(user.getName()); // Output: John Doe
```

---

## 2. Account Class

**File**: `Account.java`

**Purpose**: Manages bank account operations (deposit, withdraw, transfer).

### Attributes
```java
- accountNumber (String)      : Unique account identifier
- accountType (String)        : SAVINGS or CHECKING
- userId (String)             : Owner of the account
- balance (double)            : Current account balance
- transactionHistory (List)   : All transactions for this account
- interestRate (double)       : 2.5% for SAVINGS, 0.5% for CHECKING
- isActive (boolean)          : Account status
```

### Key Methods
```java
// Transaction Operations
deposit(double amount, String description)
  → Add money to account, returns true if successful

withdraw(double amount, String description)
  → Remove money from account, validates sufficient balance

transfer(double amount, String recipientAccountNumber, String description)
  → Send money to another account

// Query Operations
getBalance()
  → Returns current balance

displayTransactionHistory()
  → Shows all transactions with dates and amounts

displayRecentTransactions(int count)
  → Shows last N transactions

getTransactionHistory()
  → Returns list of all transactions
```

### Business Logic
- **Deposit**: Amount must be positive, balance increases
- **Withdraw**: Amount must be positive AND less than or equal to balance
- **Transfer**: Validates recipient account exists and sufficient balance
- **Interest Rate**: Savings accounts earn 2.5%, Checking earn 0.5%

### Example Usage
```java
Account account = new Account("ACC1234567890", "SAVINGS", "john123", 5000.0);

// Deposit
account.deposit(1000, "Salary deposit");
// Output: Balance becomes 6000.00

// Withdraw
account.withdraw(500, "ATM withdrawal");
// Output: Balance becomes 5500.00

// Check balance
System.out.println(account.getBalance()); // 5500.0
```

---

## 3. Transaction Class

**File**: `Transaction.java`

**Purpose**: Records and tracks individual financial transactions.

### Attributes
```java
- transactionId (String)    : Unique transaction identifier (TXN + timestamp)
- accountNumber (String)    : Account involved in transaction
- transactionType (String)  : DEPOSIT, WITHDRAWAL, or TRANSFER
- amount (double)          : Transaction amount
- timestamp (LocalDateTime) : Date and time of transaction
- description (String)     : Transaction details/notes
- balanceAfter (double)    : Account balance after transaction
```

### Key Methods
```java
Transaction(String transactionId, String accountNumber, String transactionType,
           double amount, String description, double balanceAfter)
  → Constructor to record a transaction

toString()
  → Formatted display of transaction details
```

### Example Output
```
Transaction{ID='TXN1705329600000', Type='DEPOSIT', Amount=1000.0, 
Date=15-01-2026 10:30:45, Description='Salary deposit', Balance After=6000.0}
```

### Data Flow
1. User performs operation (e.g., deposit RM1000)
2. Account balance is updated
3. Transaction object is created with new balance
4. Transaction is added to account's transaction history

---

## 4. Bank Class

**File**: `Bank.java`

**Purpose**: Core banking system - manages users and accounts globally.

### Attributes
```java
- users (HashMap)      : Stores all registered users {userId -> User}
- accounts (HashMap)   : Stores all accounts {accountNumber -> Account}
- dataFilePath (String): Path to persistent storage file "bank_data.dat"
```

### Key Methods

#### User Management
```java
registerUser(String userId, String name, String email, String password, String phoneNumber)
  → Create new user account

loginUser(String userId, String password)
  → Authenticate user, returns User object if valid

getUser(String userId)
  → Retrieve user by ID

userExists(String userId)
  → Check if user is registered
```

#### Account Management
```java
createAccount(String userId, String accountType, double initialBalance)
  → Create new account for user

getAccount(String accountNumber)
  → Get account by number

getUserAccounts(String userId)
  → Get all accounts belonging to a user
```

#### Transaction Processing
```java
transferBetweenAccounts(String fromAccountNumber, String toAccountNumber, double amount)
  → Transfer money between any two accounts

saveData()
  → Persist all data to bank_data.dat file

loadData()
  → Load data from bank_data.dat file on startup
```

### Data Persistence
- Uses Java Serialization to save objects to file
- Automatically saves after user registration, account creation, and transactions
- Loads data when application starts
- If file doesn't exist, starts with empty system

### Example Usage
```java
Bank bank = new Bank(); // Auto-loads previous data

// Register user
bank.registerUser("john123", "John Doe", "john@example.com", "pass123", "0123456789");

// Create account
Account acc = bank.createAccount("john123", "SAVINGS", 5000.0);

// Get user accounts
Map<String, Account> userAccounts = bank.getUserAccounts("john123");

// Transfer between accounts
bank.transferBetweenAccounts("ACC111", "ACC222", 1000.0);

// Data is automatically saved
```

---

## 5. BankingApp Class

**File**: `BankingApp.java`

**Purpose**: Main application - provides menu-driven user interface.

### Attributes
```java
- bank (Bank)          : Backend banking system
- scanner (Scanner)    : User input handler
- currentUser (User)   : Currently logged-in user
- currentAccount (Account) : Currently selected account
```

### Menu Structure
```
┌─ Authentication Menu
│  ├─ 1. Login
│  ├─ 2. Register
│  └─ 3. Exit
│
└─ Main Menu (after login)
   ├─ 1. Create Account
   ├─ 2. Select Account
   │  └─ Account Operations Menu
   │     ├─ 1. Deposit
   │     ├─ 2. Withdraw
   │     ├─ 3. Transfer
   │     ├─ 4. View Transaction History
   │     ├─ 5. View Recent Transactions
   │     └─ 6. Back to Main Menu
   ├─ 3. View My Accounts
   └─ 4. Logout
```

### Key Methods

#### Menu Display
```java
start()
  → Main entry point, shows welcome banner, controls menu flow

displayAuthenticationMenu()
  → Shows login/register options for unauthenticated users

displayMainMenu()
  → Main user dashboard after login

displayAccountMenu()
  → Operations menu for selected account
```

#### User Operations
```java
login()
  → Prompt user for credentials and authenticate

register()
  → Create new user account with validation

logout()
  → Clear current user session
```

#### Account Operations
```java
createAccount()
  → Create new account with type and initial balance

selectAccount()
  → Choose account from user's accounts for operations

viewMyAccounts()
  → Display summary of all user's accounts
```

#### Banking Operations
```java
deposit()
  → Deposit money with description

withdraw()
  → Withdraw money with validation

transfer()
  → Transfer between accounts with recipient validation
```

### Example Flow
```
User starts app
    ↓
Sees authentication menu
    ↓
Registers new account (or logs in)
    ↓
Navigated to main menu
    ↓
Creates/selects account
    ↓
Opens account operations menu
    ↓
Performs transactions (deposit/withdraw/transfer)
    ↓
Views transaction history
    ↓
Logs out
    ↓
Data saved to bank_data.dat
```

---

## 🔄 Data Flow Diagram

```
User Input
    ↓
BankingApp (UI Handler)
    ↓
Bank (Business Logic)
    ↓
Account/User (Data Model)
    ↓
Serialization (Persistence)
    ↓
bank_data.dat (File Storage)
```

---

## 🎓 OOP Concepts Used

| Concept | Implementation |
|---------|-----------------|
| **Encapsulation** | Private attributes with public getters/setters |
| **Serialization** | Objects saved/loaded from file |
| **Collections** | HashMap for fast user/account lookup |
| **Exception Handling** | Try-catch for file I/O operations |
| **Validation** | Input checks in all transaction methods |

---

## 📊 Class Relationships

```
┌─────────────────┐
│      User       │ (stored in Bank.users)
└────────┬────────┘
         │
         │ owns 1..* 
         ↓
┌─────────────────┐
│    Account      │ (stored in Bank.accounts)
└────────┬────────┘
         │
         │ has 1..* 
         ↓
┌─────────────────┐
│  Transaction    │ (stored in Account.transactionHistory)
└─────────────────┘

┌─────────────────┐
│     Bank        │ (manages all users and accounts)
└────────┬────────┘
         │
         │ uses
         ↓
┌─────────────────┐
│   BankingApp    │ (UI interface for Bank operations)
└─────────────────┘
```

---

## 💡 Method Call Examples

### Register and Login Flow
```java
Bank bank = new Bank();

// Register
bank.registerUser("john123", "John Doe", "john@example.com", "pass123", "0123456789");

// Login
User user = bank.loginUser("john123", "pass123"); // Returns User or null
```

### Account and Transaction Flow
```java
// Create account
Account account = bank.createAccount("john123", "SAVINGS", 5000.0);

// Perform transactions
account.deposit(1000, "Salary");      // Balance: 6000
account.withdraw(500, "ATM");         // Balance: 5500
account.transfer(300, "ACC222", "Transfer to brother");

// View history
account.displayTransactionHistory();
```

---

## 🔐 Important Notes

1. **Password Storage**: Currently stores plaintext (not secure for production)
2. **Data Validation**: Input validation is implemented
3. **Error Handling**: User-friendly error messages provided
4. **Concurrent Access**: Single-threaded (no multi-user support)

---

**For more details, see README.md and individual class source code.**
