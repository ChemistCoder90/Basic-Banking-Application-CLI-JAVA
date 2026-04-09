import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scan=new Scanner(System.in);
    BankingOption obj1= new BankingOption();
    obj1.showMenu();
    scan.close();

  }
}