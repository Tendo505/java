# Quick Start Guide - Banking Application

## ⚡ 30-Second Setup

### Step 1: Compile
Open command prompt/terminal in the project directory and run:
```bash
javac User.java Account.java Transaction.java Bank.java BankingApp.java
```

### Step 2: Run
```bash
java BankingApp
```

## 🎮 Quick Test

### Test Scenario 1: Register & Login
```
Choose option: 2 (Register)
User ID: testuser
Name: Test User
Email: test@example.com
Password: test123
Phone: 0123456789

Choose option: 1 (Login)
User ID: testuser
Password: test123
✓ Login successful!
```

### Test Scenario 2: Create & Use Account
```
Main Menu → 1. Create Account
Account Type: SAVINGS
Initial Balance: 5000

Main Menu → 2. Select Account
Select account: 1
Choose: 1. Deposit
Amount: 1000
✓ Balance: RM 6000.00
```

### Test Scenario 3: Transfer Money
```
Create 2 accounts first
Account 1: ACC1234567890 (Balance: 5000)
Account 2: ACC0987654321 (Balance: 3000)

Select Account 1 → 3. Transfer
Recipient: ACC0987654321
Amount: 1000
✓ Transfer successful!
Account 1 new balance: RM 4000
Account 2 new balance: RM 4000
```

## 🎯 Key Menus

```
Main Screen
  ├─ 1: Login
  ├─ 2: Register
  └─ 3: Exit

After Login
  ├─ 1: Create Account
  ├─ 2: Select Account (opens transaction menu)
  │    ├─ 1: Deposit
  │    ├─ 2: Withdraw
  │    ├─ 3: Transfer
  │    ├─ 4: View All Transactions
  │    ├─ 5: View Last 5 Transactions
  │    └─ 6: Back to Main Menu
  ├─ 3: View My Accounts
  └─ 4: Logout
```

## 📋 Test Credentials (after first run)

After registering a user, use these to login:
- User ID: (whatever you registered)
- Password: (whatever you set)

## ✅ Features to Try

- ✓ Register new user
- ✓ Login with credentials
- ✓ Create multiple accounts
- ✓ Deposit money
- ✓ Withdraw money
- ✓ Transfer between accounts
- ✓ View transaction history
- ✓ Check account balance
- ✓ Data persists after exit

## 📱 Sample Data Format

**User Account**
- User ID: john_doe
- Name: John Doe
- Email: john@example.com
- Phone: 0187654321

**Bank Accounts**
- Account 1: SAVINGS (Interest: 2.5%)
- Account 2: CHECKING (Interest: 0.5%)

## 🔍 Verify Installation

1. Check if `BankingApp.java` exists in project folder
2. Ensure all 5 Java files are compiled (.class files created)
3. Run application - should see welcome banner
4. No Java errors should appear

## 💾 Data File

- Created automatically: `bank_data.dat`
- Location: Same folder as BankingApp.java
- Delete this file to reset all data

## 🆘 Common Errors

| Error | Fix |
|-------|-----|
| `javac: command not found` | Install Java JDK, add to PATH |
| `java: ClassNotFoundException` | Ensure all .class files exist |
| `FileNotFound` | Run from correct directory |
| `Serialization Error` | Delete bank_data.dat and restart |

## ⏱️ Time Estimates

- Compilation: ~5 seconds
- First Run: ~10 seconds
- Full Test Flow: ~2 minutes

---

**Ready to start? Run `javac *.java` and then `java BankingApp`!**
