import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Test for the Conservatory class.
 */
public class ConservatoryTest {
  private Conservatory c1;
  private Birds parrotBird1;
  private Birds preyBird1;
  private Birds flightLessBird1;
  private Birds flightLessBird2;
  private Birds waterFowl1;
  private Birds owl1;

  @Before
  public void setup() {
    c1 = new Conservatory();
    parrotBird1 = new Parrot();
    parrotBird1.setType("gray parrot");
    parrotBird1.setExtinct(false);
    parrotBird1.setWings(2);
    parrotBird1.setFavoriteWord("Hi");
    parrotBird1.setPreferredFood();
    parrotBird1.addPreferredFood("fruit");
    parrotBird1.addPreferredFood("insects");
    parrotBird1.setCloseToWater(false);
    parrotBird1.setTotalNumWords(100);

    preyBird1 = new PreyBirds();
    preyBird1.setType("eagles");
    preyBird1.setExtinct(false);
    preyBird1.setWings(2);
    preyBird1.setPreferredFood();
    preyBird1.addPreferredFood("small mammals");
    preyBird1.addPreferredFood("buds");
    preyBird1.setCloseToWater(false);

    flightLessBird1 = new FlightlessBirds();
    flightLessBird1.setType("kiwis");
    flightLessBird1.setExtinct(false);
    flightLessBird1.setWings(2);
    flightLessBird1.setPreferredFood();
    flightLessBird1.addPreferredFood("insects");
    flightLessBird1.addPreferredFood("nuts");
    flightLessBird1.setCloseToWater(false);

    flightLessBird2 = new FlightlessBirds();
    flightLessBird2.setType("moas");
    flightLessBird2.setExtinct(true);
    flightLessBird2.setWings(2);
    flightLessBird2.setPreferredFood();
    flightLessBird2.addPreferredFood("insects");
    flightLessBird2.addPreferredFood("nuts");
    flightLessBird2.setCloseToWater(false);

    waterFowl1 = new WaterFowl();
    waterFowl1.setType("ducks");
    waterFowl1.setExtinct(false);
    waterFowl1.setWings(2);
    waterFowl1.setPreferredFood();
    waterFowl1.addPreferredFood("insects");
    waterFowl1.addPreferredFood("fish");
    waterFowl1.addPreferredFood("aquatic invertebrates");
    waterFowl1.setCloseToWater(true);

    owl1 = new Owl();
    owl1.setType("blackowl");
    owl1.setExtinct(false);
    owl1.setWings(2);
    owl1.setPreferredFood();
    owl1.addPreferredFood("eggs");
    owl1.addPreferredFood("small mammals");
    owl1.setCloseToWater(false);
  }

  @Test
  public void addRescueTest() {
    c1.addRescue(parrotBird1);
    c1.addRescue(owl1);
    c1.addRescue(waterFowl1);
    c1.addRescue(preyBird1);
    c1.addRescue(flightLessBird1);
    System.out.println(c1.getTypeMap());
    System.out.println(c1.getBirdAviary(flightLessBird1));
    System.out.println(c1.getFoodMap());
    System.out.println(c1.getAviariesLocationBirds());
    assertEquals("The blackowl are in: [0].The ducks are in: [1].The eagles are in: [2]."
            + "The gray parrot are in: [0].The kiwis are in: [3].", c1.getTypeMap());
    assertEquals("This bird is in Aviary: 3.", c1.getBirdAviary(flightLessBird1));
    assertEquals("For aviary index 0, the birds are [" + parrotBird1.toString() + ", "+ owl1.toString() + "]. " +
            "For aviary index 1, the birds are ["+waterFowl1.toString()+"]. For aviary index 2, the birds " +
            "are [" + preyBird1.toString() + "]. For aviary index 3, the birds are" +
            " [" + flightLessBird1.toString() + "]. ", c1.getAviariesLocationBirds());
  }

  @Test
  public void constructorTest() {
    Conservatory c2;
    try {
      c2 = new Conservatory();
    } catch (Exception e) {
      Assert.fail(e.getMessage());
    }
  }

  @Test
  public void createAviaryTest() {
    c1.createAviary(parrotBird1);
    c1.createAviary(owl1);
    c1.createAviary(waterFowl1);
    assertEquals(c1.getBirdAviary(parrotBird1), "This bird is in Aviary: 0.");
    assertEquals(c1.getBirdAviary(owl1), "This bird is in Aviary: 1.");
    assertEquals(c1.getBirdAviary(waterFowl1), "This bird is in Aviary: 2.");
  }

  @Test
  public void getTypeMapTest() {
    c1.createAviary(parrotBird1);
    c1.createAviary(owl1);
    c1.createAviary(waterFowl1);
    c1.createAviary(preyBird1);
    c1.createAviary(flightLessBird1);
    c1.createAviary(flightLessBird2);
    assertEquals("The blackowl are in: [1].The ducks are in: [2].The eagles are in: [3]."
                    + "The gray parrot are in: [0].The kiwis are in: [4].The moas are in: [5]."
            , c1.getTypeMap());
  }

  @Test
  public void getBirdAviaryTest() {
    assertEquals("This bird is not in current aviaries.", c1.getBirdAviary(waterFowl1));
  }

  @Test
  public void getBirdAviaryTest2() {
    c1.createAviary(parrotBird1);
    c1.createAviary(owl1);
    c1.createAviary(waterFowl1);
    assertEquals("This bird is in Aviary: 2.", c1.getBirdAviary(waterFowl1));
  }

  @Test
  public void addFoodMapTest() {
    c1.addFoodMap(parrotBird1);
    assertEquals("fruit quantity is: 1; insects quantity is: 1; ", c1.getFoodMap());
  }

  @Test
  public void getAviariesListTest() {
    c1.createAviary(parrotBird1);
    c1.createAviary(waterFowl1);
    c1.createAviary(preyBird1);
    c1.createAviary(flightLessBird1);
    assertEquals("Other", c1.getAviariesList().get(0).getAviaryName());
    assertEquals("WaterFowl", c1.getAviariesList().get(1).getAviaryName());
    assertEquals("PreyBirds", c1.getAviariesList().get(2).getAviaryName());
    assertEquals("FlightlessBirds", c1.getAviariesList().get(3).getAviaryName());
  }

  @Test
  public void getBirdDescriptionTest() {
    c1.createAviary(parrotBird1);
    c1.createAviary(owl1);
    assertEquals("Having the facial disks that frame the eyes and bill."
            , c1.getBirdDescription(c1.getAviariesList().get(1)));
  }

  @Test(expected = IllegalArgumentException.class)
  public void addRescueInvalidTest1() {
    c1.createAviary(parrotBird1);
    c1.createAviary(owl1);
    c1.createAviary(waterFowl1);
    c1.createAviary(preyBird1);
    c1.createAviary(flightLessBird1);
    c1.createAviary(flightLessBird2);
    c1.createAviary(parrotBird1);
    c1.createAviary(owl1);
    c1.createAviary(waterFowl1);
    c1.createAviary(preyBird1);
    c1.createAviary(flightLessBird1);
    c1.createAviary(flightLessBird2);
    c1.createAviary(parrotBird1);
    c1.createAviary(owl1);
    c1.createAviary(waterFowl1);
    c1.createAviary(preyBird1);
    c1.createAviary(flightLessBird1);
    c1.createAviary(flightLessBird2);
    c1.createAviary(parrotBird1);
    c1.createAviary(owl1);
    c1.addRescue(waterFowl1);
  }

  @Test(expected = IllegalArgumentException.class)
  public void addRescueInvalidTest2() {
    c1.addRescue(flightLessBird2);
  }

}
