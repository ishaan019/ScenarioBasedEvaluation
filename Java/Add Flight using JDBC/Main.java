public class Main {
    public static void main(String[] args) throws Exception {
        Flight flight = new Flight(100, "NYC", "LA", 100, 100.0);
        FlightManagement flightManagement = new FlightManagement();
       

        if (flightManagement.addFlight(flight) == true) {
            System.out.println("Flight details added successfully");
        } else {
            System.out.println("Addition not done");
        }
    }
}
