class AirTicket {
    int total_seats = 10;

    // Mutual exclusion using synchronized method
    public synchronized void bookTicket(int seats) {
        System.out.println("Thread started");

        if (total_seats >= seats) {
            System.out.println("Your seats " + seats + " booked successfully.");
            total_seats -= seats;
            System.out.println("Seats left: " + total_seats);
        } else {
            System.out.println("Not enough seats available.");
            System.out.println("Seats left: " + total_seats);
        }

        System.out.println("Thread ended");
    }
}

class AirFareApp extends Thread {
    AirTicket at;   // instance variable, NOT static
    int seats;

    AirFareApp(AirTicket at, int seats) {
        this.at = at;
        this.seats = seats;
    }

    public void run() {
        at.bookTicket(seats);
    }

    public static void main(String[] args) {
        AirTicket at = new AirTicket();

        AirFareApp aa1 = new AirFareApp(at, 1);
        AirFareApp aa2 = new AirFareApp(at, 3);

        aa1.start();
        aa2.start();
    }
}
