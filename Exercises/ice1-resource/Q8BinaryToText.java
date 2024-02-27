import java.util.*;

public class Q8BinaryToText {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the binary message:"); //enter prompt for user
        String msg = scan.nextLine();
        char[] chArr = msg.toCharArray();
        String toPrint = "";
        String tempStr = "";

        for (int i = 0; i < chArr.length; i++) {

            if (i%8 == 0) {
                tempStr = "";
            } 

            tempStr += chArr[i];

            if (tempStr.length() == 8) {
                int chDec = Integer.parseInt(String.valueOf(tempStr), 2);
                toPrint += (char)chDec;
            }

        }

        System.out.println(toPrint);

        scan.close();
    
    }
 
}