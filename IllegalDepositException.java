

public class IllegalDepositException extends Exception {
    private double amount;
    public IllegalDepositException(double amount){
        this.amount = amount;

    }
    public double getAmount(){
        return this.amount;
    }
}
