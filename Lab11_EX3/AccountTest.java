package Lab11_EX3;
import java.util.InputMismatchException;
import java.util.Scanner;
public class AccountTest {
    public static void main(String[] args) throws NegativeBalance{
        Scanner kb = new Scanner(System.in);
        double initBalance = 0;
        try {
            System.out.print("Enter intial balance : ");
            initBalance = kb.nextDouble();
            if(initBalance < 0){
                throw new NegativeBalance(initBalance);
            }else{
                BankAccount acc = new BankAccount(initBalance);
                System.out.println(acc);
            }
        }catch(InputMismatchException IE){
            System.out.println("Your input invalid.");
        }catch (NegativeBalance NB){
        }
    }
}
