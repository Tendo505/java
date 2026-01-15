# Sample Test Run & Output Documentation

## 🧪 Complete Banking App Test Run

This document shows expected output when running the banking application with various test scenarios.

---

## 📺 Test Run #1: User Registration and Login

### Command
```bash
$ java BankingApp
```

### Expected Output

```
╔════════════════════════════════════════╗
║                                        ║
║         WELCOME TO MAYBANK APP         ║
║                                        ║
╚════════════════════════════════════════╝

========== AUTHENTICATION ==========
1. Login
2. Register
3. Exit
====================================
Choose an option (1-3): 2

========== REGISTER NEW ACCOUNT ==========
Enter User ID: john123
Enter Full Name: John Doe
Enter Email: john@example.com
Enter Password: secure123
Enter Phone Number: 0187654321

✓ User registered successfully!

========== AUTHENTICATION ==========
1. Login
2. Register
3. Exit
====================================
Choose an option (1-3): 1

========== LOGIN ==========
Enter User ID: john123
Enter Password: secure123

✓ Login successful! Welcome, John Doe!

========== MAIN MENU ==========
Welcome, John Doe!
1. Create Account
2. Select Account
3. View My Accounts
4. Logout
===============================
Choose an option (1-4):
```

---

## 📺 Test Run #2: Create Multiple Accounts

### User Input Sequence
```
Option: 1 (Create Account)
Account Type: SAVINGS
Initial Balance: 5000

Option: 1 (Create Account)
Account Type: CHECKING
Initial Balance: 2000

Option: 3 (View My Accounts)
```

### Expected Output

```
========== CREATE NEW ACCOUNT ==========
Account Types: SAVINGS, CHECKING
Enter Account Type: SAVINGS
Enter Initial Balance (RM): 5000

✓ Account created successfully!
  Account Number: ACC1705329600001
  Account Type: SAVINGS
  Initial Balance: RM 5000.00

========== MAIN MENU ==========
Welcome, John Doe!
1. Create Account
2. Select Account
3. View My Accounts
4. Logout
===============================
Choose an option (1-4): 1

========== CREATE NEW ACCOUNT ==========
Account Types: SAVINGS, CHECKING
Enter Account Type: CHECKING
Enter Initial Balance (RM): 2000

✓ Account created successfully!
  Account Number: ACC1705329610002
  Account Type: CHECKING
  Initial Balance: RM 2000.00

========== MAIN MENU ==========
Welcome, John Doe!
1. Create Account
2. Select Account
3. View My Accounts
4. Logout
===============================
Choose an option (1-4): 3

========== MY ACCOUNTS ==========
ACC1705329600001 | SAVINGS | Balance: RM 5000.00
ACC1705329610002 | CHECKING | Balance: RM 2000.00
=================================
```

---

## 📺 Test Run #3: Deposit Transaction

### User Input Sequence
```
Option: 2 (Select Account)
Select Account: 1
Option: 1 (Deposit)
Amount: 1500
Description: Salary deposit
```

### Expected Output

```
========== SELECT ACCOUNT ==========
1. ACC1705329600001 (SAVINGS) - Balance: RM 5000.00
2. ACC1705329610002 (CHECKING) - Balance: RM 2000.00
Select account number: 1

========== ACCOUNT MENU ==========
Account: ACC1705329600001
Balance: RM 5000.00
1. Deposit
2. Withdraw
3. Transfer
4. View Transaction History
5. View Recent Transactions
6. Back to Main Menu
=================================
Choose an option (1-6): 1

========== DEPOSIT ==========
Enter deposit amount (RM): 1500
Enter description (optional): Salary deposit

✓ Deposit successful! Amount: RM 1500.00
  New balance: RM 6500.00
```

---

## 📺 Test Run #4: Withdrawal Transaction

### User Input Sequence
```
Option: 2 (Withdraw)
Amount: 500
Description: ATM withdrawal
```

### Expected Output

```
========== ACCOUNT MENU ==========
Account: ACC1705329600001
Balance: RM 6500.00
1. Deposit
2. Withdraw
3. Transfer
4. View Transaction History
5. View Recent Transactions
6. Back to Main Menu
=================================
Choose an option (1-6): 2

========== WITHDRAW ==========
Enter withdrawal amount (RM): 500
Enter description (optional): ATM withdrawal

✓ Withdrawal successful! Amount: RM 500.00
  New balance: RM 6000.00
```

---

## 📺 Test Run #5: Failed Withdrawal (Insufficient Balance)

### User Input Sequence
```
Select Account 2 (CHECKING, Balance: 2000)
Option: 2 (Withdraw)
Amount: 2500
```

### Expected Output

```
========== SELECT ACCOUNT ==========
1. ACC1705329600001 (SAVINGS) - Balance: RM 6000.00
2. ACC1705329610002 (CHECKING) - Balance: RM 2000.00
Select account number: 2

========== ACCOUNT MENU ==========
Account: ACC1705329610002
Balance: RM 2000.00
1. Deposit
2. Withdraw
3. Transfer
4. View Transaction History
5. View Recent Transactions
6. Back to Main Menu
=================================
Choose an option (1-6): 2

========== WITHDRAW ==========
Enter withdrawal amount (RM): 2500
Enter description (optional): 

Error: Insufficient balance! Your balance: RM 2000.00
```

---

## 📺 Test Run #6: Transfer Between Accounts

### User Input Sequence
```
Select Account: 1 (SAVINGS, Balance: 6000)
Option: 3 (Transfer)
Recipient: ACC1705329610002
Amount: 1000
Description: Transfer to checking
```

### Expected Output

```
========== SELECT ACCOUNT ==========
1. ACC1705329600001 (SAVINGS) - Balance: RM 6000.00
2. ACC1705329610002 (CHECKING) - Balance: RM 2000.00
Select account number: 1

========== ACCOUNT MENU ==========
Account: ACC1705329600001
Balance: RM 6000.00
1. Deposit
2. Withdraw
3. Transfer
4. View Transaction History
5. View Recent Transactions
6. Back to Main Menu
=================================
Choose an option (1-6): 3

========== TRANSFER ==========
Enter recipient account number: ACC1705329610002
Enter transfer amount (RM): 1000
Enter description (optional): Transfer to checking

✓ Transfer successful! Amount: RM 1000.00
  Transferred to account: ACC1705329610002
  New balance: RM 5000.00

✓ Transfer completed successfully!
```

---

## 📺 Test Run #7: View Transaction History

### User Input Sequence
```
Select Account: 1
Option: 4 (View Transaction History)
```

### Expected Output

```
========== ACCOUNT MENU ==========
Account: ACC1705329600001
Balance: RM 5000.00
1. Deposit
2. Withdraw
3. Transfer
4. View Transaction History
5. View Recent Transactions
6. Back to Main Menu
=================================
Choose an option (1-6): 4

========== TRANSACTION HISTORY ==========
Account: ACC1705329600001 | Type: SAVINGS
=========================================
Transaction{ID='TXN1705329600123', Type='DEPOSIT', Amount=5000.0, 
Date=15-01-2026 10:00:00, Description='Deposit', Balance After=5000.0}

Transaction{ID='TXN1705329601234', Type='DEPOSIT', Amount=1500.0, 
Date=15-01-2026 10:05:30, Description='Salary deposit', Balance After=6500.0}

Transaction{ID='TXN1705329602345', Type='WITHDRAWAL', Amount=500.0, 
Date=15-01-2026 10:10:15, Description='ATM withdrawal', Balance After=6000.0}

Transaction{ID='TXN1705329603456', Type='TRANSFER', Amount=1000.0, 
Date=15-01-2026 10:15:45, Description='Transfer to ACC1705329610002', 
Balance After=5000.0}

=========================================
Current Balance: RM 5000.00
```

---

## 📺 Test Run #8: View Recent Transactions

### User Input Sequence
```
Option: 5 (View Recent Transactions)
```

### Expected Output

```
========== RECENT TRANSACTIONS ==========
1. Transaction{ID='TXN1705329601234', Type='DEPOSIT', Amount=1500.0, 
Date=15-01-2026 10:05:30, Description='Salary deposit', Balance After=6500.0}

2. Transaction{ID='TXN1705329602345', Type='WITHDRAWAL', Amount=500.0, 
Date=15-01-2026 10:10:15, Description='ATM withdrawal', Balance After=6000.0}

3. Transaction{ID='TXN1705329603456', Type='TRANSFER', Amount=1000.0, 
Date=15-01-2026 10:15:45, Description='Transfer to ACC1705329610002', 
Balance After=5000.0}

=========================================
```

---

## 📺 Test Run #9: Data Persistence Test

### Sequence
```
1. Make several transactions
2. Logout
3. Exit application
4. Restart application
5. Login with same credentials
6. Check account balances and history
```

### Expected Output After Restart

```
╔════════════════════════════════════════╗
║                                        ║
║         WELCOME TO MAYBANK APP         ║
║                                        ║
╚════════════════════════════════════════╝

========== AUTHENTICATION ==========
1. Login
2. Register
3. Exit
====================================
Choose an option (1-3): 1

========== LOGIN ==========
Enter User ID: john123
Enter Password: secure123

✓ Login successful! Welcome, John Doe!

========== MAIN MENU ==========
Welcome, John Doe!
1. Create Account
2. Select Account
3. View My Accounts
4. Logout
===============================
Choose an option (1-4): 3

========== MY ACCOUNTS ==========
ACC1705329600001 | SAVINGS | Balance: RM 5000.00
ACC1705329610002 | CHECKING | Balance: RM 3000.00
=================================

[Note: Balances are same as before restart, proving data persistence]
```

---

## 📺 Test Run #10: Invalid Input Handling

### Test Case: Negative Deposit

```
========== DEPOSIT ==========
Enter deposit amount (RM): -500
Enter description (optional): 

Error: Deposit amount must be positive!
```

### Test Case: Invalid Account Type

```
========== CREATE NEW ACCOUNT ==========
Account Types: SAVINGS, CHECKING
Enter Account Type: PREMIUM
Enter Initial Balance (RM): 

Error: Invalid account type!
```

### Test Case: Non-numeric Input

```
========== WITHDRAW ==========
Enter withdrawal amount (RM): abc
Enter description (optional): 

Error: Invalid amount!
```

### Test Case: Login Failure

```
========== LOGIN ==========
Enter User ID: john123
Enter Password: wrongpassword

Error: Invalid password!
```

---

## 📊 Data File Content Example

### bank_data.dat (Binary Format)

When you examine the file size and structure:

```
File: bank_data.dat
Size: ~5-10 KB (depending on number of users/accounts/transactions)
Format: Java Serialized Objects
Contains:
  - HashMap of User objects
  - HashMap of Account objects
  - All Transaction objects embedded in accounts
  
Note: This file is binary and not human-readable
```

---

## 🎯 Expected Behavior Summary

| Scenario | Expected Result |
|----------|-----------------|
| Valid registration | Account created, saved to file |
| Valid login | User authenticated, main menu shown |
| Invalid password | Login rejected, error message |
| Create account | Account number generated, balance set |
| Valid deposit | Balance increased, transaction recorded |
| Invalid withdrawal | Balance unchanged, error message |
| Valid transfer | Balance decreased in source, increased in target |
| View history | All transactions with details displayed |
| Exit and restart | All data persists |

---

## 🔍 Output Format Notes

- **Checkmark (✓)**: Success messages
- **X (✗)**: Error messages
- **Formatted amounts**: Always show RM with 2 decimal places
- **Timestamps**: Format as DD-MM-YYYY HH:MM:SS
- **Account numbers**: Format as ACC[timestamp]
- **Transaction IDs**: Format as TXN[timestamp]

---

## ✅ Verification Checklist

After running test scenarios, verify:
- [x] All menus display correctly
- [x] User input is validated
- [x] Error messages are clear
- [x] Transactions update balances correctly
- [x] Transaction history shows all operations
- [x] Data persists between sessions
- [x] No application crashes
- [x] All calculations are accurate
- [x] Timestamps are recorded
- [x] Multiple accounts work independently

---

## 📝 Notes for Submission

When documenting your testing:
1. Screenshot all test run outputs
2. Document test results in a table
3. Show successful and error scenarios
4. Verify data persistence across sessions
5. Confirm all features work as expected
6. Highlight unique/bonus features if added

---

**This document serves as a reference for expected application behavior during testing.**
