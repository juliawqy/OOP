import java.util.*;

public class CashRegisterTest {
    
    public static void main(String[] args) {
        
        CashRegister cashReg = new CashRegister();
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the price of the first item: $");
        double firstItem = scan.nextDouble();
        scan.nextLine();
        cashReg.registerPurchase(firstItem);

        System.out.print("Enter the price of the second item: $");
        double secondItem = scan.nextDouble();
        scan.nextLine();
        cashReg.registerPurchase(secondItem);
        System.out.println();

        System.out.print("Enter dollars received from customer: ");
        int dollars = scan.nextInt();
        scan.nextLine();
        System.out.print("Enter cents received from customer: ");
        int cents = scan.nextInt();
        scan.nextLine();
        cashReg.makePayment(dollars, cents);
        System.out.println();

        System.out.println("Total cost of purchase: $" + cashReg.getPurchaseAmt());
        System.out.println("Change due: $" + cashReg.giveChange());

    }

}
