import java.util.*;
import java.io.*;

public class ProductTest {
  public static void main(String[] args){
    ArrayList<Product> products = new ArrayList<>();
    products.add(new Product("apple", 3, 1.2));
    products.add(new Product("orange", 5, 3.2));
    products.add(new Product("pear", 2, 1.1));
  
    save(products,"data\\product.csv");
  }

  public static void save(ArrayList<Product> productList, String pathAndFileName){
    //TODO: goes through products and saves each Product as a line in file
    //format: name,quantity,price

    String insert;

    File file = new File(pathAndFileName);

    if (!file.exists()) {

      try {
        file.createNewFile();
      }

      catch (IOException e) {
        System.out.println(e.getMessage());
      }
      
    }

    try (BufferedWriter writer = new BufferedWriter(new FileWriter(pathAndFileName))) {

      for (Product row : productList) {

        insert = row.getName() + "," + row.getQuantity() + "," + row.getPrice();
        writer.write(insert);
        writer.newLine();
  
      }

    }

    catch (IOException e) {
      System.out.println(e.getMessage());
    }

  }
}
