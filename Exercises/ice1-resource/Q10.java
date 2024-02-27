public class Q10 {
    public static void main(String[] args) {

        for (int i = 0; i < 3; i++){
            System.out.println("A");
            for (int j = 0; j < 3; j++){
                System.out.println("B");
                if (i == 1 || j == 1){ //breaks the loop when i or j = 1
                    // break;
                    continue;
                }
                System.out.println("i: " + i + ", j: " + j);
            }
            System.out.println("C");
        }       
    }
}

//break: A B i: 0, j: 0 B C A B C A B i: 2, j: 0 B C
//continue: A B i: 0, j: 0 B B i: 0, j: 2 C A B B B C A B i: 2, j: 0 B B i: 2, j: 2 C

/*NOTE TO SELF

    continue continues with next iteration
    break stops current and subsequent iterations

*/