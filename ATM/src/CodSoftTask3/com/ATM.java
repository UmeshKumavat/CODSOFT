package CodSoftTask3.com;

import java.util.HashMap;
import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        ATOperation atm = new ATOperation();
    }
}
class BankAccount{
    float bank_balance;

}
class ATOperation {  // this class is for atm interface & operations
    Scanner sc = new Scanner(System.in);
    HashMap<Integer, BankAccount> map = new HashMap<>(); //here we are using hashmap for storing corresponding object

    ATOperation(){
        System.out.println("*****************************************************");
        System.out.println(" WELCOME TO THE ATM MACHINE... ");
        operation();
    }

    public void operation(){
        System.out.println("*****************************************************");

        System.out.print("ENTER YOUR PIN CODE: ");
        int pincode = sc.nextInt();
        if(map.containsKey(pincode) == true){
            BankAccount obj = map.get(pincode);
            menu(obj);
        }
        else {
            System.out.println("*****************************************************");
            System.out.println("PLEASE CREATE ACCOUNT FIRST");
            System.out.print("SET YOUR PIN CODE: ");
            int pin = sc.nextInt();
            BankAccount obj = new BankAccount();
            map.put(pin,obj);
            menu(obj);
        }

    }
    public void menu(BankAccount obj){
        Scanner sc = new Scanner(System.in);
        System.out.println("*****************************************************");
        System.out.println("ENTER YOUR CHOICE: ");
        System.out.println("1].DEPOSIT MONEY");
        System.out.println("2].WITHDRAW MONEY");
        System.out.println("3].CHECK BANK BALANCE");
        System.out.println("4].CHECK ANOTHER ACCOUNT");
        System.out.println("5].EXIT");

        int x = sc.nextInt();
        if(x==1){
            depositMoney(obj);
        }
        else if (x==2) {
            withdrawMoney(obj);
        }
        else if (x==3) {
            checkBalance(obj);
        }
        else if(x==4){
            operation();
        }
        else if(x==5){
            System.out.println("THANK YOU FOR VISITING OUR ATM...");
        }
        else {
            System.out.println("PLEASE ENTER VALID CHOICE");
            menu(obj);
        }
    }

    public void checkBalance(BankAccount obj){
        System.out.println("*****************************************************");
        System.out.println("BALANCE: "+obj.bank_balance);
        menu(obj);
    }
    public void depositMoney(BankAccount obj){
        Scanner sc = new Scanner(System.in);
        System.out.println("*****************************************************");
        System.out.print("ENTER YOUR AMOUNT: ");
        float user_amount = sc.nextFloat();
        obj.bank_balance= obj.bank_balance+user_amount;
        System.out.println("AMOUNT DEPOSITED SUCCESSFULLY...");
        menu(obj);

    }
    public void withdrawMoney(BankAccount obj){
        Scanner sc = new Scanner(System.in);
        System.out.println("*****************************************************");
        System.out.print("ENTER YOUR AMOUNT: ");
        float user_amount = sc.nextInt();
        if(user_amount> obj.bank_balance){
            System.out.println("*****************************************************");
            System.out.println("INSUFFICIENT BALANCE");
            menu(obj);
        }
        else {
            obj.bank_balance= obj.bank_balance-user_amount;
            System.out.println("*****************************************************");
            System.out.println("AMOUNT WITHDRAWAL SUCCESSFULLY...");
            menu(obj);
        }
    }


}

