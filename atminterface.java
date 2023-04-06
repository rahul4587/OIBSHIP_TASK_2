import java.util.*;

public class atminterface {
    public static void main(String args[] )
    { 
        int balance = 100000, withdraw, deposit;
        String memo = "";
        Scanner sc = new Scanner(System.in);
        while(true)
        {
            System.out.println("Interface Is Here :");
            System.out.println("Choose 1 for Withdraw.... ");
            System.out.println("Choose 2 for Deposit... ");
            System.out.println("Choose 3 for Check Balance... ");
            System.out.println("Choose 4 for Transaction History...");
            System.out.println("Choose 5 for QUIT !!");
            System.out.print("Choose the Operation You Want To Perform: ");
            int n = sc.nextInt();
            switch(n)
            {
                case 1:
                System.out.print("Enter Money To Be Withdrawn: ");
                withdraw = sc.nextInt();
                if(balance >= withdraw)
                {
                    balance = balance - withdraw;
                    memo = memo + "[withdrawal of " + withdraw +"]";
                    System.out.println("Please Collect Your Money");
                }
                else
                {
                    System.out.println("Insufficient Balance !!!");
                }
                System.out.println("");
                break;
 
                case 2:
                System.out.print("Enter Money To Be Deposited: ");
                deposit = sc.nextInt();
                balance = balance + deposit;
                memo = memo + "[deposit of " + deposit +"]";
                System.out.println("Your Money Has Been Successfully Deposited");
                System.out.println("");
                break;
 
                case 3:
                System.out.println("Balance : "+balance);
                System.out.println("");
                break;

                case 4:
                System.out.println("Transaction History :"+memo);
                System.out.println("");
 
                case 5:
                System.exit(0);
            }
        }
    }
}
