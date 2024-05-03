import java.util.Scanner;

// Creating atm class
class ATM{

    float Balance;
    int PIN = 1234;

    // Method to check pin correct or not
    public void checkpin(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your pin : ");
        int enteredpin = sc.nextInt();

        if(enteredpin == PIN){
            menu();
        }
        else{
            System.out.println("Invalid pin");
            checkpin();
        }
    }

    // menu class
    public void menu(){
        System.out.println("1. check A/C Balance");
        System.out.println("2. Withdraw money");
        System.out.println("3. Deposit money");
        System.out.println("4. Exit");
        System.out.println("Enter your choice");
        Scanner sc = new Scanner(System.in);
        int opt = sc.nextInt();

        if (opt == 1){
            checkBalance();
        }
        else if (opt == 2) {
            withdraw();
        }
        else if (opt == 3) {
            deposit();
        }
        else if(opt == 4){
            System.out.println("Thanks for visting us");
            return;
        }
        else{
            System.out.println("enter a valid choice");
            menu();
        }
    }

    // check balance method
    public void checkBalance(){
        System.out.println("your Balance : "+Balance);
        menu();
    }

    // withdraw money method
    public void withdraw(){
        System.out.println("enter the amount you want to withdraw : ");
        Scanner sc = new Scanner(System.in);
        float amount = sc.nextFloat();

        if (amount > Balance){
            System.out.println("Insufficient Balance");
        }
        else {
            Balance = Balance - amount;
            System.out.println("Money withdraw Successfully");
        }
        menu();
    }

    // deposit money method
    public void deposit(){
        System.out.println("enter amount you want to deposit : ");
        Scanner sc = new Scanner(System.in);
        float balance = sc.nextFloat();
        Balance += balance;
        menu();
    }

}

public class Task3 {
    public static void main(String[] args) {
        System.out.println("Welcome to the ATM machine ");
        ATM obj = new ATM();
        obj.checkpin();
    }
}
