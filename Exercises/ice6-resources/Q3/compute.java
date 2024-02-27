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

                int rowSum = 0;
                String[] row;

                while (fileRead.hasNext()) {

                    row = fileRead.nextLine().split(",");

                    for (int i = 0; i < row.length; i++) {

                        rowSum += Integer.parseInt(row[i]);

                    }

                    System.out.println(rowSum);
                    rowSum = 0;
                    
                }

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
