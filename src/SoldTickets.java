import java.util.ArrayList;
import java.util.List;

public class SoldTickets {

    private List<Interface> tickets;

    public SoldTickets() {
        tickets = new ArrayList<>();
    }

    public void addTicket(Interface ticket) {
        tickets.add(ticket);
    }

    public void printTickets() {
        for (Interface ticket : tickets) {
            System.out.println(ticket.toString);
        }
    }
}
