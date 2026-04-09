import java.util.Scanner;

public class BankingOption {
    int Balance=0;
    int previousTransection;
    String customername="Emon";
    String customerID="1025";
    Scanner scan= new Scanner(System.in);

    void deposite(int amount){
        Balance+=amount;
        previousTransection=amount;
    }
    void withdraw(int amount){
        if(amount<=Balance){
            Balance-=amount;
            previousTransection=-amount;
            System.out.println("You have withdrawed "+amount+"$ successfully.");
        }
        else{
            System.out.println("You have not enough amount to withdraw.");
        }
    }
    void previousTransectionCal(){
        if(previousTransection>0) System.out.println("Deposited: "+ previousTransection);
        else if(previousTransection<0) System.out.println("Withdrawed: "+ Math.abs(previousTransection));
        else System.out.println("No transection till now.");
    }
    void showMenu(){
        System.out.println("Hello," + customername);
        System.out.println("Your ID Is "+ customerID);
        System.out.println("Choose an Option:");
        System.out.println("A: Check Balance");
        System.out.println("B: Deposite");
        System.out.println("C: Withdraw");
        System.out.println("D: Previous Transection");
        System.out.println("E: Exit");
        char input;
        do{
            System.out.print("PLease Select an option: ");
            input= scan.next().charAt(0);
            switch (input) {
                case 'A':
                    System.out.println("Your Balance Is: "+ Balance);
                    System.out.println("\n");
                    break;
                case 'B':
                    System.out.println("PLease enter an amount to deposite: ");
                    int dip=scan.nextInt();
                    deposite(dip);
                    System.out.println("You have deposited "+dip+"$ successfully.");
                    System.out.println("\n");
                    break;
                case 'C':
                    System.out.println("PLease enter an amount to withdraw: ");
                    int wit=scan.nextInt();
                    withdraw(wit);
                    System.out.println("\n");
                    break;
                case 'D':
                    previousTransectionCal();
                    System.out.println("\n");
                    break;
                case 'E':
                    System.out.println("Thanks for banking with us. :)");
            
                default:
                    System.out.println("PLease select valid option.");
                    System.out.println("\n");
                    break;
            }
        }
        while(input!='E');
    }
}
