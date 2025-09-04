package OOPs.StaticKeyword;

public class BankAccount {

    String holderName;
    int accountNumber;

    // static variable → shared by all objects
    static int nextAccountNumber = 1000;

    // constructor assigns a unique account number
    BankAccount(String holderName){
        this.holderName = holderName;
        this.accountNumber = nextAccountNumber++;
    }

    void display(){
        System.out.println("Account Holder: " + holderName + ", Account Number: " + accountNumber);
    }

    // static method → shows how many accounts are created
    static void totalAccount(){
        System.out.println("Total accounts created: " + (nextAccountNumber - 1000));
    }

}
