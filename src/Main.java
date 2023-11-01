public class Main {
    public static void main(String[] args) {
        BankAccount megansBankAccount = new BankAccount("megan", 2);
        System.out.println(megansBankAccount.getAccountBalance());
        
        megansBankAccount.deposit(150);
        System.out.println(megansBankAccount.getAccountBalance());
        System.out.println(megansBankAccount.getTransactions());

        megansBankAccount.withdraw(300);
        System.out.println(megansBankAccount.getAccountBalance());

        FixedDepositAccount jiminsFixedDepositAccount = new FixedDepositAccount("jimin", 2000);
        jiminsFixedDepositAccount.deposit(600);
        System.out.println(jiminsFixedDepositAccount.getAccountBalance());
    }
}