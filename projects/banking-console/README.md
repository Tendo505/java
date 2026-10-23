# Maybank-Like Banking Application (Java FYP)

A beginner-friendly banking application built with Java, featuring user authentication, account management, and transaction operations similar to Malaysia's Maybank.

## 🎯 Features

### User Management
- User registration and authentication
- Secure login with password verification
- User profile with email and phone number

### Account Management
- Create multiple accounts per user
- Two account types: SAVINGS and CHECKING
- Different interest rates (Savings: 2.5%, Checking: 0.5%)

### Banking Operations
- **Deposit**: Add money to your account
- **Withdraw**: Withdraw money with balance validation
- **Transfer**: Send money between accounts
- **Transaction History**: View all transactions with timestamps
- **Recent Transactions**: Quick view of last 5 transactions
- **Balance Inquiry**: Check current balance anytime

### Data Persistence
- File-based storage using Java serialization
- All user data and transactions are saved automatically
- Data persists between application sessions

## 📁 Project Structure

```
java/
├── User.java              # User profile and credentials
├── Account.java           # Bank account operations
├── Transaction.java       # Transaction records
├── Bank.java             # Banking system backend
├── BankingApp.java       # Main application with menu interface
└── bank_data.dat         # Data persistence file (auto-created)
```

## 🛠 Technical Stack

- **Language**: Java (JDK 8+)
- **Storage**: Object serialization (.dat file)
- **Interface**: Console-based menu system
- **No External Dependencies**: Uses only Java standard library

## 🚀 Getting Started

### Prerequisites
- Java Development Kit (JDK) 8 or higher
- A text editor or IDE (VS Code, IntelliJ IDEA, Eclipse, etc.)

### Installation & Setup

1. **Clone/Download the Repository**
   ```bash
   cd your-project-directory
   ```

2. **Compile All Java Files**
   ```bash
   javac User.java Account.java Transaction.java Bank.java BankingApp.java
   ```

3. **Run the Application**
   ```bash
   java BankingApp
   ```

## 📖 How to Use

### First Time Users

1. **Register Account**
   - Choose "Register" from the authentication menu
   - Enter a User ID (e.g., user123)
   - Provide your full name, email, and password
   - Enter your phone number

2. **Login**
   - Choose "Login"
   - Enter your User ID and password
   - You'll be logged into your banking dashboard

3. **Create Bank Account**
   - Select "Create Account" from main menu
   - Choose account type: SAVINGS or CHECKING
   - Enter initial balance

### Using the Banking Features

#### Deposit Money
```
1. Select your account
2. Choose "Deposit"
3. Enter amount in RM
4. Add optional description
```

#### Withdraw Money
```
1. Select your account
2. Choose "Withdraw"
3. Enter amount (must be ≤ available balance)
4. Transaction completed instantly
```

#### Transfer Between Accounts
```
1. Select your account
2. Choose "Transfer"
3. Enter recipient's account number
4. Enter transfer amount
5. Add optional description
```

#### View Transactions
```
1. Select your account
2. View Transaction History - See all transactions
3. View Recent Transactions - See last 5 transactions
```

## 📊 Sample Usage Flow

```
Welcome to Maybank App
├── Authentication Menu
│   ├── Register new user
│   └── Login with credentials
├── Main Menu (after login)
│   ├── Create Account
│   ├── Select Account
│   │   ├── Deposit
│   │   ├── Withdraw
│   │   ├── Transfer
│   │   └── View History
│   ├── View My Accounts
│   └── Logout
```

## 💾 Data Storage

The application stores all data in `bank_data.dat` file:
- User information and passwords
- All accounts and their details
- Complete transaction history

**Note**: This is a demonstration app. For production use, implement proper encryption and use a real database.

## 🔒 Security Notes

This is a beginner-friendly educational project. For production use, implement:
- Password hashing (bcrypt, PBKDF2)
- Database encryption
- SSL/TLS for data transmission
- Proper authentication tokens
- Input validation and sanitization

## 🎓 Learning Concepts Covered

- Object-Oriented Programming (Classes, Objects, Inheritance)
- Data Encapsulation (Getters, Setters)
- File I/O and Serialization
- Exception Handling
- Collections (HashMap, ArrayList)
- String manipulation and formatting
- Control flow (if-else, switch, loops)

## 📝 Example Test Cases

### Test Case 1: User Registration
```
User ID: john123
Name: John Doe
Email: john@email.com
Password: pass123
Phone: 0123456789
✓ User registered successfully
```

### Test Case 2: Deposit Transaction
```
Account: ACC1234567890
Type: SAVINGS
Initial Balance: 1000
Deposit: 500
✓ Deposit successful
New Balance: 1500
```

### Test Case 3: Withdrawal with Insufficient Balance
```
Current Balance: 1500
Withdrawal Request: 2000
✗ Error: Insufficient balance!
Current Balance: RM 1500.00
```

## 🐛 Troubleshooting

| Issue | Solution |
|-------|----------|
| Compilation errors | Ensure all .java files are in same directory |
| "User not found" | Double-check User ID spelling |
| "Insufficient balance" | Withdraw amount must be ≤ current balance |
| Data not saving | Check file permissions in the directory |

## 📚 Future Enhancements

- [ ] GUI using Swing/JavaFX
- [ ] Real database integration (MySQL, PostgreSQL)
- [ ] Interest calculation and application
- [ ] Loan management system
- [ ] Bill payment functionality
- [ ] Mobile app version
- [ ] REST API backend
- [ ] User notifications

## 👨‍💻 Code Quality

- Clean, readable code with comments
- Following Java naming conventions
- Proper error handling
- Object-oriented design principles
- Serializable classes for persistence

## 📄 License

Educational project - Free to use and modify for learning purposes.

## 🤝 Contributing

This is a FYP project. Feel free to extend and improve:
1. Add new features
2. Improve UI/UX
3. Optimize code
4. Add more validations

## 💡 Tips for FYP Submission

1. **Documentation**: Include all class diagrams and flowcharts
2. **Test Cases**: Create comprehensive test cases document
3. **User Manual**: Write clear user guide
4. **Code Comments**: Add meaningful comments throughout
5. **Features**: Highlight unique features you added
6. **Performance**: Test with large datasets

## 📞 Support

For questions or issues:
- Review the source code comments
- Check the How to Use section
- Test with the sample test cases provided

---

**Happy Banking! 🏦**

**Created for FYP - Beginner Friendly Banking Application**