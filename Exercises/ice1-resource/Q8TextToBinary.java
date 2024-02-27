import java.util.*;

//the program handles only positive decimals
public class Q8TextToBinary {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the text message:"); //enter prompt for user
        String msg = scan.nextLine();
        char[] chArr = msg.toCharArray();
        String toPrint = "";

        for (int i = 0; i < chArr.length; i++) {

            String chBin = Integer.toBinaryString((int)chArr[i]);
            while (chBin.length() < 8) {
                chBin = "0" + chBin;
            }
            // System.out.println(chArr[i] + " : " + chBin);
            toPrint += chBin;

        }
        
        System.out.println(toPrint);
        // System.out.println("01010100011010000110100101110011001000000110100101110011001000000110011001110101011011100110111001111001001000000011110100101001");

        scan.close();
    
    }

}