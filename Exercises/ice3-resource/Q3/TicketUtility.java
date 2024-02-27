import java.util.*;

public class TicketUtility{

    public static double calculateAverageTicketPrice(ArrayList<Ticket> ticketList) {

        double totalPrice = 0;

        if (ticketList == null || ticketList.size() == 0) {
            return 0;
        }

        for (int i = 0; i < ticketList.size(); i++) {
            totalPrice += ticketList.get(i).calculatePrice();
        }

        return (double) totalPrice/ticketList.size();

    }
    
}
