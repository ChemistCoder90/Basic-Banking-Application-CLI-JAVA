public class BankingOption {
    int Balance=0;
    int previousTransection;
    String customername;
    String customerID;

    void deposite(int amount){
        Balance+=amount;
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
    }
}
