public class Q1 {

    public static int sumOfDigits(int number) {
        
        if (number < 0) {
            number = -number;
        }
        
        String s = Integer.toString(number);
        // char[] chArr = s.toCharArray();
        
        int counter = 0;
        int toReturn = 0;


        do {
            // toReturn += Integer.parseInt(String.valueOf(chArr[counter])); //get value of string instead of address
            toReturn += Integer.parseInt(String.valueOf(s.charAt(counter)));
            counter++;
        } while (counter < s.length());
        

        char test = '1';
        System.out.println((int) test);
        String test2 = "1";
        System.out.println(Integer.parseInt(test2));

        return toReturn;       

    }
    public static void main(String[] args) {
        System.out.println("Test 1");
        int result = sumOfDigits(123);
        System.out.println("Expected:6");
        System.out.println("Actual  :" + result);
        System.out.println();

        System.out.println("Test 2");
        result = sumOfDigits(-354);
        System.out.println("Expected:12");
        System.out.println("Actual  :" + result);
        System.out.println();
    }
}


/*NOTE TO SELF

    need to split string into ch arr to access each ch by ch
    if done by changing String s.charAt(counter) directly into int, it gives the regex value of the ch i.e. 'a' = 97, 'b' = 98 

    OH NO OK SO LIKE use charat if simply looking for a ch at an index, if looking to edit the string convert to char[] then change that then convert back to string cuz java string is immutable
    if looking for ch in string use contains i think

    Integer.parseInt(String.valueOf(chArr[counter])); 
    => String.valueOf to change ch from char to String
    => Integer.parseInt to change String to int

*/