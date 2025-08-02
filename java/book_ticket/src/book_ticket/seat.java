
package book_ticket;

public class seat {
    private int seatNumber;
    private boolean isbooked=false;
    public seat(int seatNumber) {
        this.seatNumber = seatNumber;
    }

    public void setSeatNumber(int seatNumber) {
        this.seatNumber = seatNumber;
    }

    public int getSeatNumber() {
        return seatNumber;
    }
  

}
