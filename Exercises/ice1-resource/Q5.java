import java.util.Scanner;

public class Q5 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter size:");
        String numStr = scan.nextLine();
        int num = Integer.parseInt(String.valueOf(numStr));

        //printing the results
        q5a(num);
        q5b(num);
        q5c(num);

        scan.close();
        
    }

    static void q5a(int num) {

        String toReturn = "";

        for (int i = 0; i < num; i++) {
            if (i >= 26) {
                toReturn += (char)(i%26+97) + " "; 
            }
            else {
                toReturn += (char)(i+97) + " ";
            }
        }

        System.out.println(toReturn);

    }

    static void q5b(int num) {

        String toReturn = "";

        for (int i = 0; i < num; i++) {
            String intStr = String.valueOf(i+1) + String.valueOf(i+2) + String.valueOf(i+3);
            toReturn += intStr + " ";
        }

        System.out.println(toReturn);

    }

    static void q5c(int num) {

        String intStr = "";

        for (int i = 1; i < num+1; i++) {
            intStr += i;
            System.out.println(intStr);
        }        

    }

}

/*NOTE TO SELF

    char x = 'a';
    int y = 97; 

    System.out.println((int)x); prints 97
    System.out.println((char)y); prints 'a'

    static means method belongs to class q5 instead of its instances (to invoke method without creating instance)
    void means no return value
    if have return value, replace void with data type of expected return value ie String, int etc.

*/