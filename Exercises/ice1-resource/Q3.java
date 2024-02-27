import java.util.*;

public class Q3 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter sentence:");
        String str = scan.nextLine();
        String[] strArr = str.split("\\s+");

        int counter = strArr.length; //.length vs .length()
        counter -= 1;
        String toReturn = "";

        do {
            toReturn += strArr[counter] + " ";
            counter--;
        }
        while (counter > -1);

        System.out.println(toReturn);
        scan.close();

    }


}

/* NOTE TO SELF

    .length is a property that can be used for int[], double[], String[] (arrays la basically)
    .length() is a method that is used for String, StringBuilder (idk what this is) (but basically class Objects)
    .size() is a method used for collections like ArrayList, LinkedList etc.

*/