import java.util.*;


public class CompanyTest {

    public static void main(String[] args) {

        Company ums = new Company("UMS");

        Employee john = new Employee("John",5, 2500, 'M');
        Spouse kate = new Spouse("Kate", 37);
        john.setSpouse(kate);
        ums.addEmployee(john);

        System.out.println("Total salary(before): $" + ums.getAllEmployeesSalary());
        System.out.println("");

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter ID: "); //enter prompt for user
        int id = scan.nextInt();
        scan.nextLine();
        System.out.println("Enter name: ");
        String name = scan.nextLine();
        System.out.println("Enter salary: ");
        int salary = scan.nextInt();
        scan.nextLine();
        System.out.println("Enter gender: ");
        char gender = scan.nextLine().charAt(0);
        System.out.println("");

        Employee newGuy = new Employee(name, id, salary, gender);
        ums.addEmployee(newGuy);
        System.out.println("Total salary(after addition): $" + ums.getAllEmployeesSalary());
        System.out.println("");

        checkEmployee(ums, 4);
        checkEmployee(ums, 5);

        scan.close();

    }

    public static void checkEmployee(Company comp, int id) {

        Employee empId = comp.getEmployee(id);
        System.out.printf("Name: %s, Salary: $%.2f, Status: ", empId.getName(), empId.getSalary());
        if (empId.getSpouse() != null) {
            System.out.println("Married");
            System.out.println("Spouse's Name: " + empId.getSpouse().getName());
        } else {
            System.out.println("Single");
        }
        System.out.println("");

    }

}

/*  NOTE TO SELF

    only need 1 scanner, can reuse
    when print empty line can j use sout like no need ""

*/