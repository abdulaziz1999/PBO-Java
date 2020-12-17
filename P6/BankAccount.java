public class BankAccount{
    // membuat property account name to class BankAccountt
    double balance;
    String AccountName;

    //membuat modify constructor to initialize
    public BankAccount(){
        this.balance=0;
    }

    //membuat parameterized constructor (Overload constructor with string argument AccountName)
    public BankAccount(double amount, String namaNasabah){
        this.balance=amount;
        this.AccountName=namaNasabah;

    }

    // membuat method transfer, void 2 argument → amount(double), dest
    void transfer(){
        System.out.println("Jumlah Nominal Transfer: "+balance+" Akun Tujuan: "+AccountName);
    }

    public static void main (String args[]){
        BankAccount obj1 = new BankAccount(4000,"Sharla");
        BankAccount obj2 = new BankAccount(5000, "Abdul Aziz");
        obj1.transfer();
        obj2.transfer();
    }

}