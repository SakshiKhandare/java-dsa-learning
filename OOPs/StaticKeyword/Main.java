package OOPs.StaticKeyword;

public class Main {

    public static void main(String[] args) {

        BankAccount acc1 = new BankAccount("Bob");
        BankAccount acc2 = new BankAccount("Harry");
        BankAccount acc3 = new BankAccount("Yuno");

        acc1.display();
        acc2.display();
        acc3.display();

        // Static method call
        BankAccount.totalAccount();

//        Account Holder: Bob, Account Number: 1000
//        Account Holder: Harry, Account Number: 1001
//        Account Holder: Yuno, Account Number: 1002
//        Total accounts created: 3
    }
}
