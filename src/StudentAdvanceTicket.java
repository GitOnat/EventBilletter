public class StudentAdvanceTicket implements Interface{
    private final double studentAdvancePrice = 90;
    private final double discountPercent = 0.15;

    private int daysBeforeEvent;
    private String ticketID;
    private String studentID;

    public StudentAdvanceTicket(String ticketID, int daysBeforeEvent, String studentID) {
        this.ticketID = ticketID;
        this.daysBeforeEvent = daysBeforeEvent;
        this.studentID = studentID;
    }

    @Override
    public double getPrice() {
        if (daysBeforeEvent <= 10) {
            return studentAdvancePrice;
        } else {
            return studentAdvancePrice - (studentAdvancePrice * discountPercent);
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
