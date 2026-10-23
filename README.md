# Java practice

My Java learning journey: the exercises, assignment practice and small programs I wrote while learning Java at university, from the first `println` to multi-class GUI systems. It's kept as-is, mistakes and all, because it shows how I got here.

For my finished, tested projects, see my [GitHub profile](https://github.com/Tendo505).

## What's inside

| Folder | Files | Topics |
| --- | --- | --- |
| [`basics/`](basics) | 40 | Input/output, arithmetic, `Scanner`, formatting, small calculators (BMI, fees, payroll, temperature, volume) |
| [`conditionals/`](conditionals) | 6 | `if`/`else`, `switch`, comparisons (age groups, min/max, odd or zero) |
| [`loops/`](loops) | 10 | `for`, `while`, `do-while`, a guessing game |
| [`arrays/`](arrays) | 12 | 1D and 2D arrays, searching, passing arrays to methods |
| [`methods/`](methods) | 11 | Parameters, return values, `void` methods, overloading |
| [`oop/`](oop) | 1 | Interfaces |
| [`gui-swing/`](gui-swing) | 8 | Swing windows, forms and event handling |
| [`assignment-practice/`](assignment-practice) | 12 | Practice for assignment questions, including error/fix pairs (`Q1APErr` → `Q1APErrFix`) |
| [`projects/`](projects) | 39 | Multi-class programs (below) |
| [`cpp/`](cpp) | 1 | A stack in C++ |

### Projects

| Project | What it is | Run |
| --- | --- | --- |
| [`banking-console`](projects/banking-console) | Console banking system: accounts, deposits, withdrawals, transfers, transaction history ([docs](projects/banking-console/docs)) | `BankingApp` |
| [`shapes-geometry`](projects/shapes-geometry) | Inheritance with `Circle` → `Sphere`, `Cone`, `Cylinder`: area and volume | `testProgramC3` |
| [`cafe-ordering-gui`](projects/cafe-ordering-gui) | Swing café ordering app: register, log in, order, pricing, receipt, view records | `CalculatePrice` |
| [`coffee-tea-system-gui`](projects/coffee-tea-system-gui) | Swing coffee & tea ordering app with a menu, orders and users | `CoffeeTeaSystemGUI` |
| [`coffee-tea-system-v1`](projects/coffee-tea-system-v1), [`v2`](projects/coffee-tea-system-v2) | Earlier iterations of the coffee & tea system (login, menu panels) | `CoffeeTeaSystemApp` |
| [`member-login-gui`](projects/member-login-gui) | Swing login screen leading to a member information page | `LoginPage` |
| [`checkout-gui`](projects/checkout-gui) | Checkout and order-history windows | — |
| [`bank-account-basics`](projects/bank-account-basics) | First steps with classes: an `Account` class and a caller | `AccountCaller` |
| [`menu-orderable-interface`](projects/menu-orderable-interface) | An `Orderable` interface implemented by a menu | — |

## Running a program

Each file or project folder is self-contained, using the default package and no build tool:

```bash
cd projects/banking-console
javac *.java
java BankingApp
```

```bash
cd loops
javac GuessingGame.java && java GuessingGame
```

> Most programs compile with any modern JDK (110 of 140 files as checked with JDK 25). The rest are honest snapshots of work in progress: a few exercises are deliberately broken to practise fixing errors, some files were renamed after their class, and some projects depend on files I didn't keep. Folders named `v2` hold a different version of a file with the same name.
