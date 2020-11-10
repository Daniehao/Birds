import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Test for the Owl class.
 */
public class OwlTest {
  private Birds owl1;

  @Before
  public void setup() {
    owl1 = new Owl();
  }

  @Test
  public void setCharacteristicTest() {
    owl1.setCharacteristic();
    assertEquals(owl1.getCharacteristic(), "Having the facial disks that frame the eyes and"
            + " bill.");
  }
}
