class BankAccount {
    constructor(accountHolderName, accountNumber, accountType = "Savings", balance = 1000.0) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.accountType = accountType;
        this.balance = balance;
    }

    displayAccountDetails() {
        console.log("\nAccount Details:");
        console.log("Account Holder Name: " + this.accountHolderName);
        console.log("Account Number: " + this.accountNumber); 
        console.log("Account Type: " + this.accountType);
        console.log("Balance: " + this.balance);
    }
}

class BankAccountManagementSystem {
    static main() {
        const readline = require('readline').createInterface({
            input: process.stdin,
            output: process.stdout
        });

        console.log("Welcome to the Bank Account Management System");
        console.log("Choose an option:");
        console.log("1. Create Default Account");
        console.log("2. Create Custom Account");

        readline.question('Enter your choice: ', (choice) => {
            choice = parseInt(choice);
            let account;

            switch (choice) {
                case 1:
                    // Creating Default Account
                    readline.question('Enter Account Holder Name: ', (defaultName) => {
                        readline.question('Enter Account Number: ', (defaultNumber) => {
                            account = new BankAccount(defaultName, parseInt(defaultNumber));
                            account.displayAccountDetails();
                            readline.close();
                        });
                    });
                    break;

                case 2:
                    // Creating Custom Account
                    readline.question('Enter Account Holder Name: ', (customName) => {
                        readline.question('Enter Account Number: ', (customNumber) => {
                            readline.question('Enter Account Type (Savings/Current): ', (customType) => {
                                readline.question('Enter Initial Balance: ', (customBalance) => {
                                    account = new BankAccount(
                                        customName,
                                        parseInt(customNumber),
                                        customType,
                                        parseFloat(customBalance)
                                    );
                                    account.displayAccountDetails();
                                    readline.close();
                                });
                            });
                        });
                    });
                    break;

                default:
                    console.log("Invalid option! Please try again.");
                    readline.close();
                    break;
            }
        });
    }
}

BankAccountManagementSystem.main();



// OUTPUT:

// 1) Welcome to the Bank Account Management System
// Choose an option:
// 1. Create Default Account
// 2. Create Custom Account
// 1
// Enter Account Holder Name: Aryan Roy
// Enter Account Number: 12345

// Account Details:
// Account Holder Name: John Doe
// Account Number: 12345
// Account Type: Savings
// Balance: 1000.0



// 2) Welcome to the Bank Account Management System
// Choose an option:
// 1. Create Default Account
// 2. Create Custom Account
// 2
// Enter Account Holder Name: Alice Smith
// Enter Account Number: 67890
// Enter Account Type (Savings/Current): Current
// Enter Initial Balance: 5000

// Account Details:
// Account Holder Name: Rahul Chauhan
// Account Number: 67890
// Account Type: Current
// Balance: 5000.0




