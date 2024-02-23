package Lab11_EX3;

public class BankAccount {
    double balance;
    public BankAccount(double initBalance) throws NegativeBalance{
        balance = initBalance;
    }
    public String toString (){
        return "Your balance : " + balance;
    }
}
