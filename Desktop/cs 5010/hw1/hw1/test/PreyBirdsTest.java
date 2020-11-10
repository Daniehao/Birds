import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Test for the PreyBirds class.
 */
public class PreyBirdsTest {
  private Birds preyBird1;

  @Before
  public void setup() {
    preyBird1 = new PreyBirds();
  }

  @Test
  public void setCharacteristicTest() {
    preyBird1.setCharacteristic();
    assertEquals(preyBird1.getCharacteristic(), "Having sharp, hooked beaks with " +
            "visible nostrils.");
  }
}
