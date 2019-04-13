public class Rental {
    //ids or objects ?
    private String clientID;
    private String carID;
    private Point start;
    private Point end;
    private double distance;
    private double price;

    public Rental(String client, String car, Point start, Point end, double distance, double price) {
        this.clientID = client;
        this.carID = car;
        this.start = start;
        this.end = end;
        this.distance = distance;
        this.price = price;
    }

    public Rental(Rental rental) {
        this.clientID = rental.getClientID();
        this.carID = rental.getCarID();
        this.start = rental.getStart();
        this.end = rental.getEnd();
        this.distance = rental.getDistance();
        this.price = rental.getPrice();
    }

    public Point getStart() {
        return this.start;
    }

    public double getDistance() {
        return this.distance;
    }

    public Point getEnd() {
        return this.end;
    }

    public double getPrice() {
        return this.price;
    }

    public String getCarID() {
        return this.carID;
    }

    public String getClientID() {
        return this.clientID;
    }

    public Rental clone() {
        return new Rental(this);
    }
}
