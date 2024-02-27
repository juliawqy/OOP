public class Q12 {
    public static void main (String[] args){
        Shape s = Shape.CIRCLE;
        switch (s){
            case RECTANGLE: 
                System.out.println("it has 4 edges");
                break;
            case CIRCLE: 
                System.out.println("its round");
                break;
            case TRIANGLE : 
                System.out.println("it has 3 edges");
        } 
    } 
}

/*NOTE TO SELF

    use enum to define fixed set of named constants so they are in caps 
    enums can have methods and fields to have like additional data and descriptions

*/
