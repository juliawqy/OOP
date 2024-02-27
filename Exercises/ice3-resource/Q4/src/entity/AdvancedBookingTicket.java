package src.entity;

public class AdvancedBookingTicket extends Ticket {

    private int numDays;
    private double ogPrice;

    public AdvancedBookingTicket(String title, int numDaysInAdvance) {
        super(title);
        this.numDays = numDaysInAdvance;
        this.ogPrice = super.calculatePrice();
    }

    public double calculatePrice() {
        double newPrice = this.ogPrice;

        for (int i = 0; i < this.numDays; i++) {

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
