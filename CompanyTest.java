package company.passangersource;
C)import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
public class CompanyTest {
@Test
    public void testScheduleVehicle_SuccessfulScheduling() {
        Company company = new Company();
        Passenger passenger = new Passenger();
        Location pickupLocation = new Location();
        Location destinationLocation = new Location();
        boolean schedulingResult = company.scheduleVehicle();
        assertTrue(schedulingResult, "Vehicle scheduling should be successful");
    }
@Test
    public void testScheduleVehicle_UnsuccessfulScheduling() {
        Company company = new Company();
        company.setNoAvailableVehicles(true);
        Passenger passenger = new Passenger();
        Location pickupLocation = new Location();
        Location destinationLocation = new Location();
        boolean schedulingResult = company.scheduleVehicle();
        assertFalse(schedulingResult, "Vehicle scheduling should be unsuccessful");
    }
}