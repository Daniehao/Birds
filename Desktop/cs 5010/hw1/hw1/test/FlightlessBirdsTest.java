import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Test for the FlightlessBirds class.
 */
public class FlightlessBirdsTest {
  private Birds flightlessBird1;

  @Before
  public void setup() {
    flightlessBird1 = new FlightlessBirds();
  }

  @Test
  public void setCharacteristicTest() {
    flightlessBird1.setCharacteristic();
    assertEquals(flightlessBird1.getCharacteristic(), "Living on the ground and have no " +
            "(or undeveloped) wings.");
  }
}
