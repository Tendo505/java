# Test Cases and Scenarios - Banking Application

## 🧪 Comprehensive Testing Guide

This document provides test cases for validating the banking application functionality.

---

## 📋 Test Case Categories

### Category 1: Authentication & User Management

#### TC-001: User Registration - Valid Input
```
Objective: Register a new user with valid information
Steps:
  1. Select "Register" from main menu
  2. Enter User ID: "user001"
  3. Enter Name: "Alice Johnson"
  4. Enter Email: "alice@example.com"
  5. Enter Password: "secure123"
  6. Enter Phone: "0101234567"

Expected Result:
  ✓ "User registered successfully!"
  ✓ Data saved to bank_data.dat
  ✓ User can login with credentials
```

#### TC-002: User Registration - Duplicate User ID
```
Objective: Reject registration with existing User ID
Steps:
  1. Register user "user001" (from TC-001)
  2. Try to register another user with ID "user001"

Expected Result:
  ✗ "Error: User ID already exists!"
  ✗ No new account created
```

#### TC-003: User Login - Valid Credentials
```
Objective: Successfully login with correct credentials
Steps:
  1. Have user "user001" registered
  2. Select "Login"
  3. Enter User ID: "user001"
  4. Enter Password: "secure123"

Expected Result:
  ✓ "Login successful! Welcome, Alice Johnson!"
  ✓ Access to main menu granted
```

#### TC-004: User Login - Invalid Password
```
Objective: Reject login with wrong password
Steps:
  1. User "user001" exists with password "secure123"
  2. Select "Login"
  3. Enter User ID: "user001"
  4. Enter Password: "wrongpass"

Expected Result:
  ✗ "Error: Invalid password!"
  ✗ Main menu not accessible
```

#### TC-005: User Login - Non-existent User
```
Objective: Reject login for non-existent user
Steps:
  1. Select "Login"
  2. Enter User ID: "nonexistent"
  3. Enter Password: "anypass"

Expected Result:
  ✗ "Error: User not found!"
  ✗ Login fails
```

---

### Category 2: Account Management

#### TC-006: Create Savings Account
```
Objective: Create a savings account with initial balance
Steps:
  1. Login as "user001"
  2. Select "Create Account"
  3. Select Account Type: "SAVINGS"
  4. Enter Initial Balance: "5000"

Expected Result:
  ✓ Account created successfully
  ✓ Account number displayed (e.g., ACC1234567890)
  ✓ Balance shows: RM 5000.00
  ✓ Interest rate: 2.5%
```

#### TC-007: Create Checking Account
```
Objective: Create a checking account
Steps:
  1. Login as "user001"
  2. Select "Create Account"
  3. Select Account Type: "CHECKING"
  4. Enter Initial Balance: "2000"

Expected Result:
  ✓ Account created successfully
  ✓ Account number assigned
  ✓ Balance shows: RM 2000.00
  ✓ Interest rate: 0.5%
```

#### TC-008: Create Account - Invalid Type
```
Objective: Reject invalid account type
Steps:
  1. Login as "user001"
  2. Select "Create Account"
  3. Select Account Type: "PREMIUM" (invalid)

Expected Result:
  ✗ "Error: Invalid account type!"
  ✗ No account created
```

#### TC-009: Create Account - Negative Balance
```
Objective: Reject negative initial balance
Steps:
  1. Login as "user001"
  2. Select "Create Account"
  3. Select Account Type: "SAVINGS"
  4. Enter Initial Balance: "-1000"

Expected Result:
  ✗ "Error: Initial balance cannot be negative!"
  ✗ No account created
```

#### TC-010: View My Accounts
```
Objective: Display all accounts for logged-in user
Steps:
  1. Login as "user001" (has 2 accounts)
  2. Select "View My Accounts"

Expected Result:
  ✓ Shows both accounts:
    - ACC123... | SAVINGS | Balance: RM 5000.00
    - ACC456... | CHECKING | Balance: RM 2000.00
```

---

### Category 3: Deposit Operations

#### TC-011: Deposit - Valid Amount
```
Objective: Successfully deposit money to account
Steps:
  1. Login as "user001"
  2. Select account ACC123 (Savings)
  3. Choose "Deposit"
  4. Enter Amount: "1500"
  5. Enter Description: "Bonus payment"

Expected Result:
  ✓ "Deposit successful!"
  ✓ Amount: RM 1500.00
  ✓ New balance: RM 6500.00
  ✓ Transaction recorded in history
```

#### TC-012: Deposit - Zero Amount
```
Objective: Reject zero deposit
Steps:
  1. Login as "user001"
  2. Select account and choose "Deposit"
  3. Enter Amount: "0"

Expected Result:
  ✗ "Error: Deposit amount must be positive!"
  ✗ Balance unchanged
```

#### TC-013: Deposit - Negative Amount
```
Objective: Reject negative deposit
Steps:
  1. Login as "user001"
  2. Select account and choose "Deposit"
  3. Enter Amount: "-500"

Expected Result:
  ✗ "Error: Deposit amount must be positive!"
  ✗ Balance unchanged
```

#### TC-014: Deposit - Large Amount
```
Objective: Successfully deposit large amount
Steps:
  1. Login as "user001"
  2. Select account
  3. Enter Amount: "999999.99"

Expected Result:
  ✓ Deposit successful
  ✓ Balance increased correctly
  ✓ No upper limit enforced
```

---

### Category 4: Withdrawal Operations

#### TC-015: Withdrawal - Valid Amount
```
Objective: Successfully withdraw money
Steps:
  1. Login as "user001"
  2. Select account ACC123 (Current Balance: 6500)
  3. Choose "Withdraw"
  4. Enter Amount: "2000"
  5. Description: "ATM withdrawal"

Expected Result:
  ✓ "Withdrawal successful!"
  ✓ Amount: RM 2000.00
  ✓ New balance: RM 4500.00
  ✓ Transaction recorded
```

#### TC-016: Withdrawal - Insufficient Balance
```
Objective: Reject withdrawal exceeding balance
Steps:
  1. Account ACC123 has balance: RM 4500.00
  2. Select account and choose "Withdraw"
  3. Enter Amount: "5000"

Expected Result:
  ✗ "Error: Insufficient balance!"
  ✗ Your balance: RM 4500.00
  ✗ Balance unchanged
```

#### TC-017: Withdrawal - Exact Balance
```
Objective: Allow withdrawal of entire balance
Steps:
  1. Account ACC123 has balance: RM 4500.00
  2. Choose "Withdraw"
  3. Enter Amount: "4500"

Expected Result:
  ✓ Withdrawal successful
  ✓ New balance: RM 0.00
  ✓ Account still active
```

#### TC-018: Withdrawal - More Than Exact Balance
```
Objective: Reject withdrawal of 0.01 more than balance
Steps:
  1. Account balance: RM 4500.00
  2. Enter Withdrawal: "4500.01"

Expected Result:
  ✗ "Error: Insufficient balance!"
  ✗ Balance: RM 4500.00 (unchanged)
```

#### TC-019: Withdrawal - Negative Amount
```
Objective: Reject negative withdrawal
Steps:
  1. Select account and choose "Withdraw"
  2. Enter Amount: "-1000"

Expected Result:
  ✗ "Error: Withdrawal amount must be positive!"
```

---

### Category 5: Transfer Operations

#### TC-020: Transfer - Valid Between Accounts
```
Objective: Successfully transfer between user's accounts
Setup: User has ACC123 (5000) and ACC456 (2000)
Steps:
  1. Login as "user001"
  2. Select ACC123
  3. Choose "Transfer"
  4. Enter Recipient: "ACC456"
  5. Enter Amount: "1000"
  6. Description: "Transfer to checking"

Expected Result:
  ✓ Transfer successful
  ✓ ACC123 new balance: RM 4000.00
  ✓ ACC456 receives RM 1000.00 (balance: 3000)
  ✓ Both transactions recorded
```

#### TC-021: Transfer - To Non-existent Account
```
Objective: Reject transfer to invalid account
Steps:
  1. Select account
  2. Choose "Transfer"
  3. Enter Recipient: "ACCNONEXISTENT"
  4. Enter Amount: "500"

Expected Result:
  ✗ "Error: Recipient account not found!"
  ✗ No transfer executed
```

#### TC-022: Transfer - Insufficient Balance
```
Objective: Reject transfer exceeding balance
Steps:
  1. ACC123 has balance: RM 4000.00
  2. Choose "Transfer"
  3. Enter Recipient: "ACC456"
  4. Enter Amount: "5000"

Expected Result:
  ✗ "Error: Insufficient balance for transfer!"
  ✗ Balance unchanged
```

#### TC-023: Transfer - Self Transfer
```
Objective: Allow transfer from account to itself
Steps:
  1. Select ACC123
  2. Choose "Transfer"
  3. Enter Recipient: "ACC123"
  4. Enter Amount: "500"

Expected Result:
  ✓ Transfer successful (or prevented if designed)
  ✓ Balance remains same
  ✓ Two transactions recorded
```

#### TC-024: Transfer - Zero Amount
```
Objective: Reject zero transfer
Steps:
  1. Choose "Transfer"
  2. Enter Amount: "0"

Expected Result:
  ✗ "Error: Transfer amount must be positive!"
```

---

### Category 6: Transaction History

#### TC-025: View All Transactions
```
Objective: Display complete transaction history
Setup: Account has 5+ transactions
Steps:
  1. Select account with transactions
  2. Choose "View Transaction History"

Expected Result:
  ✓ Shows all transactions with:
    - Transaction ID (TXN...)
    - Type (DEPOSIT/WITHDRAWAL/TRANSFER)
    - Amount
    - Date & Time
    - Description
    - Balance after transaction
  ✓ Transactions in chronological order
  ✓ Current balance displayed
```

#### TC-026: View Recent Transactions
```
Objective: Display last 5 transactions
Setup: Account has 10+ transactions
Steps:
  1. Select account
  2. Choose "View Recent Transactions"

Expected Result:
  ✓ Shows only last 5 transactions
  ✓ Numbered 1-5
  ✓ Same format as full history
```

#### TC-027: View Transactions - Empty Account
```
Objective: Handle account with no transactions
Steps:
  1. Create new account (no operations)
  2. View transaction history

Expected Result:
  ✓ "No transactions found for this account."
  ✗ No error thrown
```

---

### Category 7: Data Persistence

#### TC-028: Data Saved After Deposit
```
Objective: Verify data persists after deposit
Steps:
  1. Deposit RM 1000
  2. Exit application
  3. Restart application
  4. Login as same user
  5. Check account balance

Expected Result:
  ✓ Balance still shows new amount
  ✓ Transaction still in history
  ✓ bank_data.dat file updated
```

#### TC-029: Data Saved After Transfer
```
Objective: Verify transfer data persists
Steps:
  1. Transfer between accounts
  2. Exit app
  3. Restart and login
  4. Check both accounts

Expected Result:
  ✓ Both accounts show correct balances
  ✓ Transactions recorded for both
  ✓ Persistent across sessions
```

#### TC-030: Multiple Users - Data Isolation
```
Objective: Verify data isolation between users
Setup: 2 registered users
Steps:
  1. User A registers, creates account, deposits 5000
  2. User A logs out
  3. User B registers, creates account, deposits 3000
  4. User A logs back in

Expected Result:
  ✓ User A sees only their account
  ✓ User A's balance: still 5000 (or updated by their transactions)
  ✓ User B's account not visible to User A
  ✓ No data mixed between users
```

---

### Category 8: Input Validation

#### TC-031: Non-numeric Amount Input
```
Objective: Handle invalid number input
Steps:
  1. Choose "Deposit"
  2. Enter Amount: "abc123"

Expected Result:
  ✗ Error caught gracefully
  ✗ "Error: Invalid amount!"
  ✗ No crash/exception visible
```

#### TC-032: Special Characters in Name
```
Objective: Accept special characters in user name
Steps:
  1. Register with Name: "John O'Brien-Smith"

Expected Result:
  ✓ Registration successful
  ✓ Name stored correctly
  ✓ Special characters preserved
```

#### TC-033: Very Long Input
```
Objective: Handle long input strings
Steps:
  1. Register with Name: (1000 characters)

Expected Result:
  ✓ Accepted (or max length enforced)
  ✓ No crash
  ✓ Data stored correctly
```

---

## 🎯 Test Execution Plan

### Phase 1: Unit Testing (Single Features)
```
Priority 1: Login, Register, Create Account
Priority 2: Deposit, Withdraw
Priority 3: Transfer, History
Priority 4: Data Persistence
```

### Phase 2: Integration Testing
```
Complete user journey:
  Register → Login → Create Accounts → Perform Transactions → View History → Logout
```

### Phase 3: Boundary Testing
```
Zero values, negative values, maximum values
Empty lists, single items, multiple items
```

### Phase 4: Error Handling
```
Invalid inputs, non-existent records, insufficient funds
```

---

## 📊 Test Results Template

```
Test Case ID: TC-001
Title: User Registration - Valid Input
Status: ✓ PASS / ✗ FAIL
Expected vs Actual: [Description]
Notes: [Any observations]
Date: DD-MM-YYYY
Tester: [Name]
```

---

## 🔄 Regression Testing

After any code changes, re-test:
- All authentication functions
- All transaction operations
- Data persistence
- Edge cases

---

## ✅ Quality Checklist

- [ ] All 33 test cases executed
- [ ] No unexpected errors
- [ ] Data persists correctly
- [ ] UI is user-friendly
- [ ] Error messages are clear
- [ ] All features working as expected

---

**Use these test cases to validate the banking application before FYP submission!**
