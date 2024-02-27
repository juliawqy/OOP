public class AdvancedBookingTicket extends Ticket {

    private int numDaysInAdvance;
    private double ogPrice;

    public AdvancedBookingTicket(String title, int numDaysInAdvance) {
        super(title);
        this.numDaysInAdvance = numDaysInAdvance;
        this.ogPrice = super.calculatePrice();
    }

    public double calculatePrice() {
        double newPrice = this.ogPrice;

        for (int i = 0; i < this.numDaysInAdvance; i++) {

            if (newPrice > ((double) ogPrice/2)) {
                newPrice -= 0.5;
            }

        }

        if (newPrice < ((double) ogPrice/2)) {
            return (double) ogPrice/2;
        }

        return newPrice;

    }
    
}

/* NOTE TO SELF

    USE SUPER. instead of this. to call super method

*/