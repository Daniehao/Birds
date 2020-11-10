import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Test for the Parrot class.
 */
public class ParrotTest {
  private Birds parrotBird1;

  @Before
  public void setup() {
    parrotBird1 = new Parrot();
  }

  @Test
  public void setCharacteristicTest() {
    parrotBird1.setCharacteristic();
    assertEquals(parrotBird1.getCharacteristic(), "Having a short, curved beak and are known "
            + "for their intelligence and ability" + "to mimic sounds.");
  }

  @Test
  public void getTotalNumWordsTest() {
    parrotBird1.setTotalNumWords(100);
    assertEquals(parrotBird1.getTotalNumWords(), 100);
  }

  @Test
  public void getFavoriteWordTest() {
    parrotBird1.setFavoriteWord("Hi");
    assertEquals(parrotBird1.getFavoriteWord(), "Hi");
  }
}
