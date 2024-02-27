import java.io.*;
import java.util.*;

public class compute {

    //ok so like add arraylist but keep pushing the the start hooray or j parse thru n add to the start

    public static void main(String[] args) {
     
        Scanner inputScanner = new Scanner(System.in);
        System.out.print("Enter filename> ");
        String filePath = inputScanner.nextLine();

        while (true) {

            try {

                File file = new File(filePath);
                Scanner fileRead = new Scanner(file);

                String toPrint = "";
                String[] row;

                while (fileRead.hasNext()) {

                    row = fileRead.nextLine().split(",");

                    for (int i = 0; i < row.length-1; i++) {

                        toPrint = "," + row[i] + toPrint;

                    }

                    toPrint = row[row.length-1] + toPrint;
                    System.out.println(toPrint);
                    toPrint = "";
                    
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
