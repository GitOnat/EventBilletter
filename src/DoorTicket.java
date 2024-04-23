public class DoorTicket implements Interface{
    private final double doorPrice = 150;
    private String ticketID;

    public DoorTicket(String ticketID) {
        this.ticketID = ticketID;
    }

    @Override
    public double getPrice() {
        return doorPrice;
    }

    @Override
    public String getTicketID() {
        return ticketID;
    }

    @Override
    public String toString() {
        return "";
    }
}
