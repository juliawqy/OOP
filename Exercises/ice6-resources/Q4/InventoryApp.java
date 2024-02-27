import java.io.*;
import java.util.*;

public class InventoryApp {

    public static void stockTaking(String fileNameAndPath) {

        File file = new File(fileNameAndPath);

        if (file.exists() && file.isFile()) {

            try {

                BufferedReader reader = new BufferedReader(new FileReader(fileNameAndPath));

                String[] row;
                String line;
                int totalProd = 0;
                double totalVal = 0.0;

                while ((line = reader.readLine()) != null) {
                    row = line.split(",");
                    System.out.printf("There are %s %s, each cost $%.2f \n", row[0], row[1], Double.parseDouble(row[2]));
                    totalProd += Integer.parseInt(row[0]);
                    totalVal += Double.parseDouble(row[2])*totalProd;
                }

                System.out.printf("There are %d products with a total value of $%.2f to be sold.\n", totalProd, totalVal);

            }

            catch (IOException e) {

            }

        }

    }

    public static void main(String[] args) {
        stockTaking("product.csv");
    }
    
}
