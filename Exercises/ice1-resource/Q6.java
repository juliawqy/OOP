import java.util.*;

public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first string:");
        String input1 = sc.nextLine();
        System.out.print("Enter the second string:");
        String input2 = sc.nextLine();
        System.out.println();

        if (matchStrings(input1, input2)) {
            System.out.println("There is an alignment as shown above.");
        } else {
            System.out.println("No alignment can be found.");
        }

        sc.close();
    }

    // This method returns true if str2 can be aligned with str1 
    // and false otherwise. If there is an alignment, this method 
    // also prints out the alignment. See the sample runs of the 
    // program for exact output of this method.
    public static boolean matchStrings(String str1, String str2) {
        // Modify the code below to return the correct value.

        char[] chArr = str2.toCharArray();
        char[] str1Arr = str1.toCharArray();
        String str1Temp = str1;
        int charRemoved = 0;

        ArrayList <Integer> flagArr = new ArrayList<>();

        for (int i = 0; i < chArr.length; i++) {
            int checker = str1Temp.indexOf(chArr[i]);
            if (checker == -1) {
                return false;
            }
            else {
                charRemoved += checker;
                flagArr.add(charRemoved++); 
                //need to add post incre ++ cuz value of checker only accounts for ch removed before target ch, after removing target ch need +1 to charRemoved
                str1Temp = str1Temp.substring(checker+1, str1Temp.length());
            }
            // System.out.println(str1Temp);
            // System.out.println(flagArr);
        }

        String toPrint = "";

        for (int j = 0; j < str1.length(); j++) {
            if (flagArr.contains(j)) {
                toPrint += str1Arr[j];
            }
            else {
                toPrint += " ";
            }
        }

        // System.out.println(str1);
        System.out.println(toPrint);
        return true;

    }

}

/* NOTE TO SELF

    ArrayList referencetype cannot be primitive data types
    so cannot int but can use object Integer

    strings in java are immutable, once made cannot be modified

    no easy way to find index of ch in a char[] so use arraylist or smth

    if just simply finding indexOf it will keep returning index of 1st occurance

    make temp string and modify that by cutting it everytime to prevent ^problem, but remember to add back index of removed characters

    actually indexOf can specify startindex lmao 

*/