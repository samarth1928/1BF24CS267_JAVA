import java.util.Scanner;

class Account {
    String Cname;
    int accno;
    String acctype;
    double balance;

    Account(String cname, int accno, String type, double b) {
        Cname = cname;
        this.accno = accno;
        acctype = type;
        balance = b;
    }

    void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited amount: " + amount);
        } else {
            System.out.println("Invalid deposit amount!");
        }
    }

    void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid withdrawal amount!");
            return;
        }
        if (amount > balance) {
            System.out.println("Insufficient balance!");
            return;
        }
        balance -= amount;
        System.out.println("Withdrawn amount: " + amount);
    }

    void displayBalance() {
        System.out.println("\n--- Account Details ---");
        System.out.println("Account Holder: " + Cname);
        System.out.println("Account Number: " + accno);
        System.out.println("Account Type: " + acctype);
        System.out.println("Current Balance: Rs." + balance);
    }
}

class Savings extends Account {
    double intrate = 0.05;

    Savings(String name, int accno, double balance) {
        super(name, accno, "savings", balance);
    }

    void CI(int years) {
        double interest = balance * Math.pow((1 + intrate), years) - balance;
        balance += interest;
        System.out.println("Interest of Rs " + interest + " added.");
    }
}

class Current extends Account {
    double minbalance = 1000;
    double sercharge = 100;

    Current(String name, int accno, double balance) {
        super(name, accno, "current", balance);
    }

    void withdraw(double amount) {
        super.withdraw(amount);
        if (balance < minbalance) {
            balance -= sercharge;
            System.out.println("A service charge of " + sercharge + " has been applied.");
            System.out.println("Balance after service charge: " + balance);
        }
    }
}

class Bank {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter customer name: ");
        String name = s.nextLine();

        System.out.print("Enter account number: ");
        int accno = s.nextInt();
        s.nextLine(); // consume newline

        System.out.print("Enter account type (savings/current): ");
        String type = s.nextLine().toLowerCase();

        System.out.print("Enter initial balance: ");
        double balance = s.nextDouble();

        // Declare both objects here (no null)
        Savings sv = new Savings(name, accno, balance);
        Current ct = new Current(name, accno, balance);

        System.out.println("\nMENU");
        System.out.println("1. Deposit");
        System.out.println("2. Withdraw");
        System.out.println("3. Compound Interest");
        System.out.println("4. Show Balance");
        System.out.println("5. Exit");

        int c;
        System.out.print("Enter choice: ");
        c = s.nextInt();

        while (c != 5) {
            switch (c) {
                case 1:
                    System.out.print("Enter the deposit amount: ");
                    double deposit = s.nextDouble();
                    if (type.equals("savings"))
                        sv.deposit(deposit);
                    else
                        ct.deposit(deposit);
                    break;

                case 2:
                    System.out.print("Enter the withdrawal amount: ");
                    double withdraw = s.nextDouble();
                    if (type.equals("savings"))
                        sv.withdraw(withdraw);
                    else
                        ct.withdraw(withdraw);
                    break;

                case 3:
                    if (type.equals("savings")) {
                        System.out.print("Enter number of years: ");
                        int years = s.nextInt();
                        sv.CI(years);
                    } else {
                        System.out.println("Interest not applicable for current account.");
                    }
                    break;

                case 4:
                    if (type.equals("savings"))
                        sv.displayBalance();
                    else
                        ct.displayBalance();
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

            System.out.println("\n1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Compound Interest");
            System.out.println("4. Show Balance");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");
            c = s.nextInt();
        }
    }
}