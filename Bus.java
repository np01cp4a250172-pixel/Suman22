package week12;

    public class Bus {
    private String numberPlate;
    private String color;
    private String route;
    private String customerName;
    private boolean availableStatus;
    private int rate;

    // Constructor
    public Bus(String numberPlate, String color, String route,
               String customerName, boolean availableStatus, int rate) {
        this.numberPlate = numberPlate;
        this.color = color;
        this.route = route;
        this.customerName = customerName;
        this.availableStatus = availableStatus;
        this.rate = rate;
    }

    // Getter methods
    public String getColor() {
        return color;
    }

    public int getRate() {
        return rate;
    }

    // Display description of bus
    public void display() {
        System.out.println("Number Plate : " + numberPlate);
        System.out.println("Color        : " + color);
        System.out.println("Route        : " + route);
        System.out.println("Customer     : " + customerName);
        System.out.println("Available    : " + availableStatus);
        System.out.println("Rate         : " + rate);
        System.out.println("-----------------------------");
    }
}
