# Example Scenarios & Data - Banking Application

## 🎬 Real-World Usage Scenarios

Use these scenarios to understand and test the banking application.

---

## Scenario 1: New User Complete Journey

### User Profile
- Name: Ahmad Amirul
- User ID: ahmad_123
- Email: ahmad@example.com
- Password: secure_pass_2024
- Phone: 0187654321

### Journey Steps

#### Step 1: Registration
```
App: "Welcome to Maybank App"
User: Register
Input:
  User ID: ahmad_123
  Name: Ahmad Amirul
  Email: ahmad@example.com
  Password: secure_pass_2024
  Phone: 0187654321
Output: ✓ User registered successfully!
```

#### Step 2: Create Savings Account
```
App: Main Menu
User: Create Account
Input:
  Account Type: SAVINGS
  Initial Balance: 10000
Output: 
  ✓ Account created successfully!
  Account Number: ACC1705329600000
  Balance: RM 10000.00
```

#### Step 3: Create Checking Account
```
User: Create Account
Input:
  Account Type: CHECKING
  Initial Balance: 2500
Output:
  ✓ Account created successfully!
  Account Number: ACC1705329600001
  Balance: RM 2500.00
```

#### Step 4: First Deposit
```
User: Select Savings Account → Deposit
Input:
  Amount: 5000
  Description: Bonus payment from employer
Output:
  ✓ Deposit successful! Amount: RM 5000.00
  New balance: RM 15000.00
```

#### Step 5: Withdraw for Expenses
```
User: Withdraw
Input:
  Amount: 1500
  Description: Monthly groceries
Output:
  ✓ Withdrawal successful! Amount: RM 1500.00
  New balance: RM 13500.00
```

#### Step 6: Transfer to Checking
```
User: Transfer
Input:
  Recipient: ACC1705329600001
  Amount: 2000
  Description: Transfer to checking for bills
Output:
  ✓ Transfer successful! Amount: RM 2000.00
  New balance: RM 11500.00
```

#### Step 7: View History
```
User: View Transaction History
Output:
  1. DEPOSIT (5000) - RM 15000.00 - Bonus payment
  2. WITHDRAWAL (1500) - RM 13500.00 - Monthly groceries
  3. TRANSFER (2000) - RM 11500.00 - Transfer to checking
```

---

## Scenario 2: Business Account Manager

### User Profile
- Name: Siti Rahman
- User ID: siti_biz_001
- Email: siti.rahman@bizmail.com
- Password: BizSecure2024!
- Phone: 0162234455

### Company Accounts
- Business Savings: RM 50000
- Business Checking: RM 20000
- Petty Cash: RM 5000

### Monthly Operations

#### Week 1: Payroll Distribution
```
Account: Business Checking (Current: RM 20000)

Transaction 1: Withdraw RM 15000
  Description: Employee payroll - Week 1
  Balance after: RM 5000

Transaction 2: Deposit RM 30000
  Description: Client invoice payment received
  Balance after: RM 35000
```

#### Week 2: Vendor Payments
```
Account: Business Checking

Transaction 1: Transfer RM 8000 to Petty Cash
  Description: Vendor advance payment
  Balance after: RM 27000

Account: Petty Cash
  Receives: RM 8000
  Balance after: RM 13000
```

#### Week 3: Revenue Consolidation
```
Account: Business Checking

Transaction 1: Receive Transfer from Petty Cash RM 10000
  Description: Daily collections consolidated
  Balance after: RM 37000

Account: Business Savings

Transaction 1: Receive Transfer RM 25000
  Description: Monthly profit allocation
  Balance after: RM 75000
```

---

## Scenario 3: Joint Account Household

### Family Members
1. **Husband**: Malik (malik_001)
   - 2 accounts: Personal Savings, Family Savings

2. **Wife**: Nur (nur_001)
   - 2 accounts: Personal Savings, Family Savings
   - Note: Same family account shared access

### Household Cash Flow

#### Malik's Personal Account
```
Initial Balance: RM 8000

Deposits:
  RM 5000 - Salary deposit
  RM 1000 - Freelance income

Withdrawals:
  RM 2000 - Personal shopping

Balance: RM 12000
```

#### Family Account (Shared)
```
Initial Balance: RM 15000

Deposits by Malik:
  RM 3000 - Monthly household contribution
  
Deposits by Nur:
  RM 2500 - Household allowance
  
Withdrawals:
  RM 2000 - Groceries (Nur)
  RM 1500 - Utilities (Malik)
  
Balance: RM 17000
```

#### Nur's Personal Account
```
Initial Balance: RM 6000

Deposits:
  RM 4500 - Salary deposit
  RM 500 - Gift from parents

Withdrawals:
  RM 1500 - Personal items
  
Balance: RM 9500
```

---

## Scenario 4: Student Financial Management

### User Profile
- Name: Amir Fadhil
- User ID: amir_student
- Email: amir.fadhil@uni.edu.my
- Phone: 0173334455

### Accounts
- **Allowance Account**: RM 2000 (monthly allowance)
- **Emergency Account**: RM 500 (savings)

### Monthly Budget

#### Month 1: September

```
Allowance Account
- Initial: RM 2000

Spending Patterns:
  → Deposit RM 100 (part-time job)
  → Withdraw RM 400 (books/stationery)
  → Withdraw RM 600 (accommodation)
  → Withdraw RM 300 (food)
  → Withdraw RM 200 (transport)
  
Balance after: RM 600

Transfer to Emergency Account: RM 200
Emergency Account Balance: RM 700
```

#### Month 2: October

```
Allowance Account
- Starting Balance: RM 600

New deposits:
  → RM 2000 (monthly allowance from parents)
  → RM 150 (tutoring income)

Withdrawals:
  → RM 600 (accommodation)
  → RM 400 (food)
  → RM 200 (utilities shared)
  → RM 150 (leisure/entertainment)

Balance: RM 400
```

#### Emergency Fund Usage

```
Emergency Account (RM 700)
- Need arises: Medical expenses RM 300

Withdrawal: RM 300
  Description: Doctor consultation and medication
  
Balance: RM 400
```

---

## Scenario 5: Error & Exception Testing

### Invalid Operations

#### Test 1: Insufficient Balance
```
Account: ACC001 (Balance: RM 1000)

Attempted Withdrawal: RM 2000
Error: "Error: Insufficient balance! Your balance: RM 1000.00"
Result: Transaction rejected, balance unchanged
```

#### Test 2: Invalid Transfer
```
Attempted Transfer:
- From: ACC001
- To: ACCNONEXISTENT
- Amount: RM 500

Error: "Error: Recipient account not found!"
Result: Transfer rejected, balance unchanged
```

#### Test 3: Negative Amount
```
Attempted Deposit: RM -1000
Error: "Error: Deposit amount must be positive!"
Result: Deposit rejected
```

#### Test 4: Invalid Login
```
Attempted Login:
- User ID: ahmed_123
- Password: wrongpassword

Error: "Error: Invalid password!"
Result: Login denied, menu unchanged
```

#### Test 5: Duplicate Registration
```
Attempted Registration:
- User ID: malik_001 (already exists)

Error: "Error: User ID already exists!"
Result: Registration rejected
```

---

## Scenario 6: Data Persistence Verification

### Initial State
```
User: malik_001
Account 1: ACC100 (SAVINGS) - Balance: RM 20000
Account 2: ACC101 (CHECKING) - Balance: RM 5000

Transactions:
  - Deposit 10000
  - Withdraw 3000
  - Transfer 2000 from ACC100 to ACC101

Final Balances:
  ACC100: RM 25000
  ACC101: RM 7000
```

### After Application Restart
```
Step 1: Close Application
Step 2: Restart Application
Step 3: Login with malik_001 / password

Result:
✓ User authenticated successfully
✓ View My Accounts shows:
  ACC100: RM 25000
  ACC101: RM 7000

✓ Transaction History shows all 3 transactions

Conclusion: Data persisted correctly!
```

---

## Scenario 7: Multi-User System

### Three Different Users

#### User 1: Rashid (rashid_001)
```
Accounts:
- ACC1001: SAVINGS (RM 15000)
- ACC1002: CHECKING (RM 5000)

Recent Transactions:
- Deposit RM 3000
- Withdraw RM 1000
- Transfer RM 2000 → ACC1002
```

#### User 2: Fatima (fatima_001)
```
Accounts:
- ACC2001: SAVINGS (RM 25000)
- ACC2002: CHECKING (RM 8000)

Recent Transactions:
- Deposit RM 5000
- Transfer RM 3000 → ACC2002
- Withdraw RM 2000
```

#### User 3: Hassan (hassan_001)
```
Accounts:
- ACC3001: SAVINGS (RM 10000)

Recent Transactions:
- Deposit RM 2000
- Withdraw RM 500
```

### Data Isolation Verification
```
When Rashid logs in:
✓ Can see ACC1001, ACC1002 only
✓ Cannot see Fatima's or Hassan's accounts
✓ Transaction history shows only Rashid's transactions

When Fatima logs in:
✓ Can see ACC2001, ACC2002 only
✓ Cannot see Rashid's or Hassan's accounts
✓ Transaction history shows only Fatima's transactions

When Hassan logs in:
✓ Can see ACC3001 only
✓ Cannot see anyone else's accounts
✓ Transaction history shows only Hassan's transactions
```

---

## Scenario 8: Advanced Features Test

### Test: Interest Rate Comparison
```
Account 1: SAVINGS Account
- Balance: RM 10000
- Interest Rate: 2.5% annually

Account 2: CHECKING Account
- Balance: RM 10000
- Interest Rate: 0.5% annually

Annual Earnings Difference:
- SAVINGS: RM 250
- CHECKING: RM 50
- Difference: RM 200 (Savings account earns more!)
```

### Test: Transaction ID Generation
```
Format: TXN[timestamp]

Examples:
- TXN1705329600123
- TXN1705329601234
- TXN1705329602345

Verification:
✓ Each transaction has unique ID
✓ ID is based on timestamp (milliseconds)
✓ Cannot have duplicate IDs
```

---

## Sample Test Data Summary

| Scenario | Type | Users | Accounts | Transactions | Focus |
|----------|------|-------|----------|--------------|-------|
| 1 | Real-World | 1 | 2 | 7 | Complete journey |
| 2 | Business | 1 | 3 | 5+ | Complex operations |
| 3 | Household | 2+ | 3+ | 10+ | Shared accounts |
| 4 | Student | 1 | 2 | 8+ | Budget management |
| 5 | Error Testing | - | - | - | Exception handling |
| 6 | Persistence | 1 | 2 | 3 | Data survival |
| 7 | Multi-User | 3 | 5 | 9+ | Data isolation |
| 8 | Advanced | - | 2 | - | Features |

---

## 💡 Tips for Creating Your Own Scenarios

1. **Start Simple**: New user → Create account → Simple transaction
2. **Add Complexity**: Multiple accounts → Transfers → History
3. **Test Errors**: Try wrong amounts → Non-existent accounts
4. **Verify Persistence**: Make changes → Restart → Verify
5. **Multi-User**: Create different users → Check isolation

---

## 📝 Recording Your Tests

When testing, document:
- What you tested
- Expected vs actual result
- Status (PASS/FAIL)
- Notes

Example:
```
Test: User Registration
Input: User ID=amir_001, Name=Amir, Email=amir@email.com, Pass=secure123
Expected: ✓ User registered successfully!
Actual: ✓ User registered successfully!
Status: ✓ PASS
Notes: Successful registration, data saved
```

---

**Use these scenarios to thoroughly test and understand your banking application!**
