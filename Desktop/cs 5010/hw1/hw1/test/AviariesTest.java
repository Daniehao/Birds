import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Test for the Aviaries class.
 */
public class AviariesTest {
  private Birds bird1;
  private Birds bird2;
  private Birds bird3;
  private Birds bird4;
  private Birds bird5;
  private Aviaries aviary1;
  private Aviaries aviary2;
  private Aviaries aviary3;
  private Aviaries aviary4;

  @Before
  public void setup() {
    bird1 = new FlightlessBirds();
    bird2 = new PreyBirds();
    bird3 = new WaterFowl();
    bird4 = new Owl();
    bird5 = new FlightlessBirds();
    aviary1 = new Aviaries(bird1);
    aviary2 = new Aviaries(bird2);
    aviary3 = new Aviaries(bird3);
    aviary4 = new Aviaries(bird4);
  }

  @Test
  public void addBirdTest() {
    aviary1.addBird(bird1);
    aviary1.addBird(bird5);
    assertEquals(2, aviary1.getCurrNum());
    assertEquals("[" + bird1.toString() +", "+ bird5.toString() +"]",
            aviary1.getBirdsList().toString());
  }

  @Test
  public void setAviaryNameTest() {
    aviary1.setAviaryName(bird1);
    aviary2.setAviaryName(bird2);
    aviary3.setAviaryName(bird3);
    aviary4.setAviaryName(bird4);
    assertEquals("FlightlessBirds", aviary1.getAviaryName());
    assertEquals("PreyBirds", aviary2.getAviaryName());
    assertEquals("WaterFowl", aviary3.getAviaryName());
    assertEquals("Other", aviary4.getAviaryName());
  }

  @Test
  public void getTextTest() {
    aviary1.addBird(bird5);
    aviary1.addBird(bird1);
    assertEquals(aviary1.getText(), "Living on the ground and have no (or undeveloped) " +
            "wings.Living on the ground and have no (or undeveloped) wings.");
  }
}
