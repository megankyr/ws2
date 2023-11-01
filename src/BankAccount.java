import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Random;

public class BankAccount {

    private final String name;
    private final String accountNumber;

    private float accountBalance;
    private ArrayList<String> transactions;
    private boolean accountClosed;
    private LocalDateTime accountCreationDate;
    private LocalDateTime accountClosingDate;

    public BankAccount(String name) {
        this.name = name;
        this.accountNumber = new Random().ints(10, 0, 10)
                .collect(StringBuilder::new, StringBuilder::append, StringBuilder::append).toString();
        this.accountBalance = 0;
        this.transactions = new ArrayList<>();
        this.accountClosed = false;
        this.accountCreationDate = LocalDateTime.now();
    }

    public BankAccount(String name, float accountBalance) {
        this.name = name;
        this.accountNumber = new Random().ints(10, 0, 10)
                .collect(StringBuilder::new, StringBuilder::append, StringBuilder::append).toString();
        this.accountBalance = accountBalance;
        this.transactions = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public float getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(float accountBalance) {
        this.accountBalance = accountBalance;
    }

    public ArrayList<String> getTransactions() {
        return transactions;
    }

    public void setTransactions(ArrayList<String> transactions) {
        this.transactions = transactions;
    }

    public boolean isAccountClosed() {
        return accountClosed;
    }

    public void setAccountClosed(boolean accountClosed) {
        this.accountClosed = accountClosed;
    }

    public LocalDateTime getAccountCreationDate() {
        return accountCreationDate;
    }

    public void setAccountCreationDate(LocalDateTime accountCreationDate) {
        this.accountCreationDate = accountCreationDate;
    }

    public LocalDateTime getAccountClosingDate() {
        return accountClosingDate;
    }

    public void setAccountClosingDate(LocalDateTime accountClosingDate) {
        this.accountClosingDate = accountClosingDate;
    }

    public static void main(String[] args) {

    }

    public void deposit(float depositAmount) {
        if (depositAmount > 0) {
            accountBalance += depositAmount;
            System.out.println("You have deposited $" + depositAmount + ". Your current balance is $" + accountBalance);
            transactions.add("$" + depositAmount + " was deposited at " + LocalDateTime.now());
        } else {
            throw new IllegalArgumentException("Please input a positive number to deposit.");
        }
    }

    public void withdraw(float withdrawAmount) {
        if (withdrawAmount <= accountBalance) {
            accountBalance -= withdrawAmount;
            System.out.println("You have withdrawn $" + withdrawAmount + ". Your current balance is $" + accountBalance);
            transactions.add("$" + withdrawAmount + " was withdrawn at " + LocalDateTime.now());
        } else {
            System.out.println("You have insufficient funds to withdraw $" + withdrawAmount + " as your balance is $" + accountBalance + ". Please input another amount to withdraw instead.");
        }
    }
}