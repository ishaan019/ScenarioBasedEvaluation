import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Properties;


public class FlightManagement {
    public boolean addFlight(Flight flight) throws Exception {
    	  Properties properties = new Properties();
        	Class.forName(properties.getProperty("com.mysql.jdbc.Driver"));
    		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/fisglobal", "root", "root");

            String query = "insert into flight (flightId, source, destination, noofseats, flightfare) values (?, ?, ?, ?, ?);";

            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setInt(1, flight.getFlightId());
            preparedStatement.setString(2, flight.getSource());
            preparedStatement.setString(3, flight.getDestination());
            preparedStatement.setInt(4, flight.getNoOfSeats());
            preparedStatement.setDouble(5, flight.getFlightFare());

            preparedStatement.execute();
            return true;
       
    }
}
