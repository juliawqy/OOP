import java.util.*;

public class PersonTest {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter details of the first person:");
        System.out.print("Enter first name : ");
        String fname = scan.nextLine();
        System.out.print("Enter last name : ");
        String lname = scan.nextLine();
        System.out.print("Enter age : ");
        int age = scan.nextInt();
        scan.nextLine();

        Person firstPerson = new Person(fname, lname, age);
        System.out.println(firstPerson.toString());
        System.out.println("");

        System.out.println("Enter details of the second person:");
        System.out.print("Enter first name : ");
        fname = scan.nextLine();
        System.out.print("Enter last name : ");
        lname = scan.nextLine();

        Person secPerson = new Person(fname, lname);
        System.out.println(secPerson.toString());
        System.out.println("");

        System.out.print("Enter age of second person: ");
        age = scan.nextInt();
        scan.nextLine();
        System.out.println("");

        secPerson.setAge(age);
        System.out.println("After setting age of otherPerson");
        System.out.println(secPerson.toString());

        scan.close();

    }

}