# Bank System Application

    This is a simple Java-based banking system application with a graphical user interface (GUI). The application allows users to manage bank accounts, deposit funds, withdraw funds, and check account balances. The project is built using Java Swing for the GUI and standard Java classes for backend logic.

# Features

1. Account Management
    Automatically creates an account when a new account number is provided.
2. Deposit Money
    Allows the user to deposit a specified amount into an account.
3. Withdraw Money
    Allows the user to withdraw a specified amount from an account, provided sufficient balance is available.
4. Check Balance
    Displays the current balance of the specified account.

# Classes

1. Account
    The Account class represents a single bank account with attributes for the account number and balance.

    Key Methods:

    - Account(String accountNumber)
        Constructor to initialize an account with a specific account number and zero balance.
    - String getAccountNumber()
        Returns the account number.
    - double getBalance()
        Returns the current account balance.
    - void deposit(double amount)
        Increases the account balance by the specified amount. Throws an exception for invalid amounts.
    - void withdraw(double amount)
        Decreases the account balance by the specified amount. Throws an exception for insufficient funds or invalid amounts.

2. BankSystem
    The BankSystem class manages multiple accounts using a HashMap.

    - Key Methods:

        Account getAccount(String accountNumber)
        Retrieves an account by account number. Creates a new account if it doesn't exist.

3. BankGUI
    The BankGUI class provides a user-friendly graphical interface for interacting with the BankSystem.

    GUI Components:

    Input Fields:
        Account Number
        Amount
    Buttons:
        Deposit
        Withdraw
        Check Balance
    Feedback Area:
        Displays success or error messages for user actions.

# How It Works

1. Start the application by running the BankGUI class.
2. Enter an account number in the "Account Number" field.
3. Use the "Amount" field to specify a monetary value for deposit or withdrawal.
4. Click on:
    - Deposit to add money to the account.
    - Withdraw to subtract money from the account (if sufficient funds are available).
    - Check Balance to view the current balance of the account.
5. Feedback messages will appear in the text area below the buttons

6. Requirements

    - Java Development Kit (JDK): Version 8 or later.
    - IDE: Any Java-supported IDE like IntelliJ IDEA, Eclipse, or VSCode.

# Installation and Usage

1. Clone the Repository
    git clone https://github.com/AdelinaKachinda/BankSystem
    cd bank-system
2. Compile the Files
    Compile all .java files:
    javac *.java
3. Run the Application
    Start the application using:
    java BankGUI
4. Using the GUI
    Follow the steps mentioned in the How It Works section to interact with the banking system.

# Author

Developer: Adelina Kachinda
University: Bethune-Cookman University

Developer: Aldridge Kalenga
University: Bethune-Cookman University

Developer: Raphael Boakye
University: Bethune-Cookman University
