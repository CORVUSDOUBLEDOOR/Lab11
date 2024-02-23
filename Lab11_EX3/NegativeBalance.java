package Lab11_EX3;

public class NegativeBalance extends Exception{
    public NegativeBalance(){
        System.out.println("Error: Negative starting balance.");;
    }
    public NegativeBalance(double balance){
        System.out.println("Error: Negative staring balance: " + balance);
    }
}
