public class AdvanceTicket implements Interface {
    private final double advancePrice = 120;
    private final double discountPercent = 0.15;

    private int daysBeforeEvent;
    private String ticketID;

    public AdvanceTicket(String ticketID, int daysBeforeEvent) {
        this.ticketID = ticketID;
        this.daysBeforeEvent = daysBeforeEvent;
    }

    @Override
    public double getPrice() {
        if (daysBeforeEvent <= 10) {
            return advancePrice;
        } else {
            return advancePrice - (advancePrice * discountPercent);
        }
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
