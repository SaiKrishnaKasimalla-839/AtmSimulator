import java.util.*;
class Bank {
    String AcName;
    int AcBalance;
    int desAmount;
    int TotalBalance; 
    int debAmount;
    Scanner sc = new Scanner(System.in);
    Bank(String AcName, int AcBalance) {
        this.AcName = AcName;
        this.AcBalance = AcBalance;
        this.desAmount = 0;
        this.TotalBalance = AcBalance; 
        System.out.println("Welcome.... " + this.AcName);
        List();
    }
    public void List() {
        System.out.println("1. Account Balance");
        System.out.println("2. Deposit");
        System.out.println("3. Total Balance");
        System.out.println("4.Deposit");
        System.out.println("Enter:");
        int but = sc.nextInt();
        switch (but) {
            case 1:
                showBalance();
                break;
            case 2:
                deposit();
                break;
            case 3:
                showTotalBalance();
                break;
            case 4:debit();
                break;
            default:
                System.out.println("Not Found");
                break;
        }
    }

    public void showBalance() {
        System.out.println("Account Balance: " + AcBalance);
    }

    public void deposit() {
        System.out.println("Enter Amount:");
        desAmount = sc.nextInt();
        System.out.println("Deposited Successfully.....");
        TotalBalance = AcBalance + desAmount; 
        System.out.println("Balance: " + TotalBalance);
    }

    public void showTotalBalance() {
        System.out.println("Total Balance: " + TotalBalance);
    }
    public void debit(){
        System.out.println("Enter Amount:");
        debAmount = sc.nextInt();
        System.out.println("Debited Successfully...");
        int rembalance=this.AcBalance-debAmount;
        System.out.println("Balance:"+rembalance);
    }

    public static void main(String[] args) {
        Bank b = new Bank("SAI KRISHNA KASIMALLA", 19365);
    }
}
