import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Test for the ShoreBirds class.
 */
public class ShoreBirdsTest {
  private Birds shoreBird1;

  @Before
  public void setup() {
    shoreBird1 = new ShoreBirds();
  }

  @Test
  public void setCharacteristicTest() {
    shoreBird1.setCharacteristic();
    assertEquals(shoreBird1.getCharacteristic(), "Having the great auk, horned puffin" +
            ", and African Jacana.");
  }
}
