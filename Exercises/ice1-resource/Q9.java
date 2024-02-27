public class Q9 {

    public static void main(String[] args) {
        char c = 'a';
        int age = 9;

        // fragment A
        if (c == 'a' && ++age == 10){ //c is mapped to a AND age+1 = 10
            age++;
            System.out.println("A is true"); //yes
        }
        System.out.println("A: " + age); //now is 11

        c = 'a';
        age = 9;

        // fragment B
        if (c == 'a' & ++age == 10){ //c is mapped to a AND age+1 = 10
            age++;
            System.out.println("B is true"); //yes
        }
        System.out.println("B: " + age); //now is 11

        c = 'a';
        age = 9;

        // fragment C
        // if (++age == 10 && c != 'a') {
        if (c != 'a' && ++age == 10){ //c is not mapped to a (false) AND age+1 = 10
            age++;
            System.out.println("C is true"); //no
        }
        System.out.println("C: " + age); //9 => when checking c != 'a' it already return FALSE so it doesnt check the behind anymore since it is AND so age DOES NOT +1
        //BUT if it is done as (++age == 10 && c != 'a') it WILL +1 to age and then check c is not mapped to a so not entering the loop but age is now 10 omfg
        //BUT if is "&" instead of "&&" it will check BOTH and order doesn't matter and age is always 10

        c = 'a';
        age = 9;

        // fragment D
        if (c != 'a' || ++age == 10){ //c is not mapped to a (false) OR age+1 = 10
            age++;
            System.out.println("D is true"); //yes
        }
        System.out.println("D: " + age); //11

        c = 'a';
        age = 9;

        // fragment E
        // if (++age == 10 || c == 'a'){
        if (c == 'a' || ++age == 10){ //c is mapped to a OR age+1 = 10
            age++;
            System.out.println("E is true"); //yes
        }
        System.out.println("E: " + age); //10 => again like fragment c it checks c is mapped to a first which is true, will auto enter loop without need to check for age+1=10 since it is OR
        //BUT if done (++age == 10 || c == 'a') age will +1 and then enter loop without checking c is mapped to a so now age is 11 fking crazy
        //BUT if is "|" instead of "||" it will check BOTH so order doesn't matter and age is always 11

        c = 'a';
        age = 9;
        
        // fragment F
        if (c != 'a' | ++age == 10){ //c not mapped to a (false) OR age+1 = 10
            age++;
            System.out.println("F is true"); //yes
        }
        System.out.println("F: " + age); //11

        c = 'a';
        age = 9;
        
        // fragment G
        if (c != 'a' ^ ++age == 10){ //c not mapped to a (false) XOR age+1 = 10
            age++;
            System.out.println("G is true"); //yes
        }
        System.out.println("G: " + age); //11

        c = 'a';
        age = 9;
        
        // fragment H
        if (c == 'a' ^ ++age == 10){ //c mapped to a XOR age+1 = 10
            age++;
            System.out.println("H is true"); //no
        }
        System.out.println("H: " + age); //10

    }
}

/* NOTE TO SELF

    boolean short circuits (||, &&) only check until enough to determine whether to enter the loop
        i.e. if using || and the 1st condition is true will not check subsequent conditions
             if using && and the 1st condition is false will not check subsequent conditions
    boolean normal logical operators will check the entire condition

    in java int/int returns int also

*/