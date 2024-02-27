
public class CashRegister {

    private int purchase; //in CENTS
    private int payment; //in CENTS

    public CashRegister() {
        this.purchase = 0;
        this.payment = 0;
    }

    public void registerPurchase(double amount) {
        this.purchase += amount*100;
    }

    public void makePayment(int dollars, int cents) {
        this.payment += dollars*100 + cents;
    }

    public double getPurchaseAmt() {
        return (double) this.purchase/100;
    }

    public double giveChange() {
        return (double) (this.payment-this.purchase)/100;
    }
    
}
