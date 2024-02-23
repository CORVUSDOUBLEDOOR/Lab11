package Lab11_EX2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class SalesReport {
    public static void main(String[] args) throws FileNotFoundException {
        int months = 0;
        double oneMonth;
        double totalSales = 0.0;
        double averageSales;
        Scanner kb = new Scanner(System.in);
        try {
            String filename = kb.nextLine();
            File file = new File(filename);
            Scanner inputFile = new Scanner(file);
            while (inputFile.hasNext()) {
                try{
                    oneMonth = inputFile.nextDouble();
                }catch (InputMismatchException IE) {
                    throw new InputMismatchException();
                }
                totalSales += oneMonth;
                months++;
            }
            inputFile.close();
            averageSales = totalSales / months;
            System.out.println("Number of months : " + months);
            System.out.println("Total Sales : " + totalSales);
            System.out.println("Average Sales : " + averageSales);
        }catch (FileNotFoundException FE){
            System.out.println("file is not exist.");
        }catch (InputMismatchException IE){
            System.out.println("Your input mismatch.");
        }
    }
}
