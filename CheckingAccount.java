public class CheckingAccount {
    private double balance;
    private int account;

    public CheckingAccount(int account, double balance){
        this.account = account;
        this.balance = balance;
    }

    public int getNumber() {
        return account;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) throws IllegalDepositException{
        if (amount<=0){
            throw new IllegalDepositException(amount);
        }
        else{
            this.balance += amount;
            System.out.println("$"+amount+" has been deposited into your account");
            System.out.println("Your account balance is now $"+this.getBalance());
        }
        
    }

    public void withdraw(double amount) throws InsufficientFundsException{

        if (amount>this.balance){
            throw new InsufficientFundsException(amount);
        }
        else {
            this.balance -= amount;
            System.out.println("$"+amount+" has been withdrawn from your account");
            System.out.println("Your account balance is now $"+this.getBalance());
        }
    }

}
