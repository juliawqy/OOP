import java.util.*;

public class Q4 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number:");
        String numStr = scan.nextLine();
        int num = Integer.parseInt(String.valueOf(numStr));

        if (num <= 0) {
            System.out.println("No positive number is entered");
        }
        else {
            int product = 1;
            String[] strArr = {numStr};

            do {

                product *= num;

                System.out.println("Enter number:");
                numStr = scan.nextLine();
                num = Integer.parseInt(String.valueOf(numStr));
                if (num > 0) {
                    strArr = Arrays.copyOf(strArr, strArr.length + 1);
                    strArr[strArr.length-1] = numStr;
                }
            }
            while (num > 0);

            String toPrint = "";
            int counter = 0;

            System.out.println(Arrays.toString(strArr));
            
            do {
                toPrint += strArr[counter] + " x ";
                counter++;
            }
            while (counter < strArr.length - 1);

            toPrint += strArr[strArr.length-1] + " = " + product;

            System.out.println(toPrint);
            scan.close();

        }
        
    }

}

/* NOTE TO SELF

    to append to an array, make a copy of the array with length +1, then replace last element
    strArr = Arrays.copyOf(strArr, strArr.length + 1);
    strArr[strArr.length-1] = numStr;

    in java arrays have fixed sizes which cannot be dynamically changed after, hence this bs

    or use ArrayList class (need to import from java.util)
        //create an ArrayList
        ArrayList<String> arrayList = new ArrayList<>();
        
        // Add elements to the ArrayList using the add() method
        arrayList.add("I am Element 1");

        // Display the elements in the ArrayList
        System.out.println("ArrayList elements: " + arrayList);

        // Convert ArrayList to an array
        String[] array = arrayList.toArray(new String[0]);

*/