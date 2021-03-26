package A11DefiningClassesd.E03BankAccount;

public class BankAccount {

    private static int currentId = 1;
    private static double interestRate = 0.02;

    private int id;
    private double balance;

    public BankAccount() {
        this.id = currentId++;
        System.out.println("Account ID" + this.id + " created");
    }

    public void setInterest(double interest) {
        BankAccount.interestRate = interest;
    }

    public int getId() {
        return this.id;
    }

    public double getInterest(int years) {
        return this.balance * years * interestRate;
    }

    public void deposit(double amount) {
        this.balance += amount;
        System.out.printf("Deposited %.0f to ID%d%n", amount,  this.id);
    }


}
