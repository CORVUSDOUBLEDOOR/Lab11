package Lab11_EX1;

import java.util.InputMismatchException;
import java.util.Scanner;
public class Lab11_EX1 {
    public static void main(String[] args) {
        int [] number ={1,2,3};
        Scanner kb = new Scanner(System.in);
        try {
            System.out.print("Enter index of array : ");
            int n = kb.nextInt();
            System.out.println(number[n]);
        }catch (ArrayIndexOutOfBoundsException ae){
            System.out.println("Array index is out of bound.");
        }catch (InputMismatchException ip){
            System.out.println("Your input mismatch.");
        }
    }
}
