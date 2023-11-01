import java.time.LocalDateTime;

public class FixedDepositAccount extends BankAccount {

private float interest;
private int durationInMonths;

private boolean interestChanged;
private boolean durationChanged;

public FixedDepositAccount(String name, float accountBalance) {
    super(name, accountBalance);
    this.interest = 3;
    this.durationInMonths = 6;
}

public FixedDepositAccount(String name, float accountBalance, float interest) {
    super(name, accountBalance);
    if (interestChanged) {
        throw new IllegalArgumentException("Interest can only be changed once");
    }
    this.interest = interest;
    interestChanged = true;
}

public FixedDepositAccount(String name, float accountBalance, float interest, int durationInMonths) {
    super(name, accountBalance);
    this.interest = interest;
    if (durationChanged){
        throw new IllegalArgumentException("Duration can only be changed once");
    }
    this.durationInMonths = durationInMonths;
}

@Override
public float getAccountBalance(){
    return super.getAccountBalance() + interest;
}

@Override 
public void deposit(float depositAmount) {
        System.out.println("This is a fixed deposit account. Your deposit is rejected");
    }

@Override
public void withdraw(float withdrawAmount) {
    System.out.println("This is a fixed deposit account. Your withdrawl is rejected");
}

}
