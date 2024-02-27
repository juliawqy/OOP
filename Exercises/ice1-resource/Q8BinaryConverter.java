import java.util.Scanner;

public class Q8BinaryConverter {

  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    System.out.println("Enter decimal number:"); //enter prompt for user
    String numStr = String.valueOf(scan.nextLine());
    int num = Integer.parseInt(numStr);
    String toPrint = "";

    do {

      toPrint = String.valueOf(num%2) + toPrint;
      num = num/2;

    } while (num > 0);

    System.out.println("Binary equivalent of " + numStr + " is " + toPrint);

    scan.close();
    
  }

}
  