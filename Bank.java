

//CLASSESS

public class Bank{
    private String owner;
    private double balance;
// constructor(initilaize the object)
    public Bank(String owner,double balance){
        this.owner = owner;
        this.balance = balance;

    }

    public void deposit(double amount){
        balance = balance + amount;
        System.out.println("Deposit:" + amount+"New Balance: "+ balance);

    }

    public void withdraw(double amount){
        if (balance > amount){
            balance = balance - amount;
            System.out.println("withdraw: "+ amount + "New Balance: "+ balance);
        }else{
            System.out.println("insufficient funds"); 
        }
    }

    //public static void details(){
        //System.out.println("Owner: " + owner + " Balance: " + balance + " Bank Name: " + Bankname);

    c

    public static void main(String[] args) {
        Bank kofi_Account = new Bank("kofi",10000);
        Bank Michaelson = new Bank("Michaelson",2000000);

        kofi_Account.deposit(4000);
    }
}
