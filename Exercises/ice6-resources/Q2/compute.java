import java.io.*;
import java.util.*;

public class compute {

    public static void main(String[] args) {
     
        Scanner inputScanner = new Scanner(System.in);
        System.out.print("Enter filename> ");
        String filePath = inputScanner.nextLine();

        while (true) {

            try {

                File file = new File(filePath);
                Scanner fileRead = new Scanner(file);

                int sum = 0;

                while (fileRead.hasNext()) {
                    sum += fileRead.nextInt();
                    fileRead.nextLine();
                }

                System.out.println("The sum is " + sum);
                fileRead.close();
                break;

            }

            catch (FileNotFoundException e) {
                System.err.println(filePath + " is not valid");
                inputScanner = new Scanner(System.in);
                System.out.print("Enter filename> ");
                filePath = inputScanner.nextLine();
            }

        }

        inputScanner.close();
        
    }
    
}
