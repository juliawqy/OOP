import java.util.*;

public class Q2 {
 
    public static void main(String[] args) {

        Scanner scan1 = new Scanner(System.in);
        System.out.println("Enter first word:");
        String str1 = scan1.nextLine();
        char[] arr1 = str1.toCharArray();

        Scanner scan2 = new Scanner(System.in);
        System.out.println("Enter second word:");
        String str2 = scan2.nextLine();
        char[] arr2 = str2.toCharArray();

        while (!String.valueOf(arr1[0]).equals(String.valueOf(arr2[0]))) {

            System.out.println("try again");

            scan1 = new Scanner(System.in);
            System.out.println("Enter first word:");
            str1 = scan1.nextLine();
            arr1 = str1.toCharArray();

            scan2 = new Scanner(System.in);
            System.out.println("Enter second word:");
            str2 = scan2.nextLine();
            arr2 = str2.toCharArray();

        }

        System.out.println("Bingo");

        scan1.close();
        scan2.close();
    }

}

/* NOTE TO SELF

    .nextLine() takes entire user input up until before user presses enter key (newline or end of line)
        e.g. user input "hello there"
        printing scan.nextLine() will give "hello there"

    .next() truncates user input to before a whitespace (space, tab or newline)
    => suitable for individual words or tokens 
        e.g. user input "hello there"
        printing scan.next() will give "hello"
    => will leave the remaining input String though, so if asking for another input after call a .nextLine() to "consume" it
        continuing from prev e.g.,
        printing scan.next() will give "there"
    => .hasNext() will check if there is a .next() left to continue (cannot return False, only True if have)
        e.g. user input "hello there"
        after printing 1st scan.next() ("hello"), .hasNext() will return True 
        after printing 2nd scan.next() ("there"), .hasNext() will ...not return True
        usually used in a while loop        
    
*/