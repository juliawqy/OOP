public class Q7 {
    public static void main(String[] args) {
  
        String[] days = {
                "first", "second", "third", "fourth", 
                "fifth", "sixth", "seventh", "eighth", 
                "ninth", "tenth", "eleventh", "twelfth"
                };
        

        for (int day = 0; day < 12; day++) {

            System.out.println("On the " + days[day] + " day of Christmas my true love sent to me");

            switch (day) {

                case 11:
                    System.out.println("Twelve drummers drumming, ");
                
                case 10:
                    System.out.println("Eleven pipers piping, ");
                
                case 9:
                    System.out.println("Ten lords a-leaping, ");
                
                case 8:
                    System.out.println("Nine ladies dancing, ");

                case 7:
                    System.out.println("Eight maids a-milking, ");

                case 6:
                    System.out.println("Seven swans a-swimming, ");
                
                case 5:
                    System.out.println("Six geese a-laying,");
                
                case 4:
                    System.out.println("Five golden rings.");
                
                case 3:
                    System.out.println("Four calling birds, ");

                case 2:
                    System.out.println("Three French hens, ");

                case 1:
                    System.out.println("Two turtle doves, and");

                case 0:
                    System.out.println("A partridge in a pear tree.");
            
                default:
                    break;
            }

            System.out.println("\n");

        }
        
    }
}


/* NOTE TO SELF

    what the fuck

    jesus

    after every case if no break, it will continue with the next case

*/