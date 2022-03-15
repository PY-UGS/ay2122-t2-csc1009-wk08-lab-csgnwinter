import java.util.Scanner;

public class BankDemoTest {
    public static void main(String[] args) {
        boolean isRunning = true;
        int accNum = 102;       //Change this to change the account number
        double startBal = 100;     //Change this to change starting balance of account
        CheckingAccount myAccount = new CheckingAccount(accNum, startBal);
        while(isRunning){
            System.out.println();
            System.out.println("Welcome to Bank Demo Test");
            System.out.println("What would you like to do?");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Quit");
            System.out.print("Option: ");
            Scanner inp = new Scanner(System.in);
            int choice = inp.nextInt();

            if (choice==3){
                isRunning = false;
            }

            else if (choice == 1){
                System.out.print("How much would you like to deposit?: ");
                double dep = inp.nextDouble();
                try {
                    myAccount.deposit(dep);
                } catch (IllegalDepositException e) {
                    // TODO Auto-generated catch block
                    System.out.println("Sorry, but deposit amount has to be more than 0!");
                }
            }

            else if (choice == 2){
                System.out.print("How much would you like to withdraw?: ");
                double withdraw = inp.nextDouble();
                try {
                    myAccount.withdraw(withdraw);
                } catch (InsufficientFundsException e) {
                    // TODO Auto-generated catch block
                    double shortBy = withdraw-myAccount.getBalance();
                    System.out.println("Sorry, but your account is short by $"+shortBy);
                }
            }
            
        }

        }
    
}
