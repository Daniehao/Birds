import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * Test for the WaterFowl class.
 */
public class WaterFowlTest {
  private Birds waterfowl1;

  @Before
  public void setup() {
    waterfowl1 = new WaterFowl();
  }

  @Test
  public void setCharacteristicTest() {
    waterfowl1.setCharacteristic();
    assertEquals(waterfowl1.getCharacteristic(), "Living near water sources (fresh or salt).");
  }

  @Test
  public void setTypeTest() {
    waterfowl1.setType("ducks");
    assertEquals(waterfowl1.getType(), "ducks");
  }

  @Test
  public void setExtinctTest() {
    waterfowl1.setExtinct(false);
    assertEquals(waterfowl1.getIsExtinct(), false);
  }

  @Test
  public void setWingsTest() {
    waterfowl1.setWings(5);
    assertEquals(waterfowl1.getWings(), 5);
  }

  @Test
  public void getPreferredFoodTest() {
    waterfowl1.setPreferredFood();
    waterfowl1.addPreferredFood("fruit");
    waterfowl1.addPreferredFood("fish");
    List<String> foodLst = new ArrayList<>();
    foodLst.add("fruit");
    foodLst.add("fish");
    assertEquals(waterfowl1.getPreferredFood(), foodLst);
  }

  @Test
  public void getCloseToWaterTest() {
    waterfowl1.setCloseToWater(true);
    assertEquals(waterfowl1.getCloseToWater(), true);
  }

  @Test
  public void getTotalNumWordsTest() {
    waterfowl1.setTotalNumWords(0);
    assertEquals(waterfowl1.getTotalNumWords(), 0);
  }

  @Test
  public void getFavoriteWordTest() {
    waterfowl1.setFavoriteWord("");
    assertEquals(waterfowl1.getFavoriteWord(), "");
  }
}
