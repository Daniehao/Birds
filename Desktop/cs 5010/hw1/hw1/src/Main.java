/**
 * A demo to test all methods in Conservatory and Aviaries classes.
 */
public class Main {
  /**
   * Main method for Main class and it prints the result for the two demos.
   *
   * @param args The input args for main
   */
  public static void main(String[] args) {
    Birds parrotBird1 = new Parrot();
    parrotBird1.setType("gray parrot");
    parrotBird1.setExtinct(false);
    parrotBird1.setWings(2);
    parrotBird1.setFavoriteWord("Hi");
    parrotBird1.setPreferredFood();
    parrotBird1.addPreferredFood("fruit");
    parrotBird1.addPreferredFood("insects");
    parrotBird1.setCloseToWater(false);
    parrotBird1.setTotalNumWords(100);

    Birds preyBird1 = new PreyBirds();
    preyBird1.setType("eagles");
    preyBird1.setExtinct(false);
    preyBird1.setWings(2);
    preyBird1.setPreferredFood();
    preyBird1.addPreferredFood("small mammals");
    preyBird1.addPreferredFood("buds");
    preyBird1.setCloseToWater(false);

    Birds flightLessBird1 = new FlightlessBirds();
    flightLessBird1.setType("kiwis");
    flightLessBird1.setExtinct(false);
    flightLessBird1.setWings(2);
    flightLessBird1.setPreferredFood();
    flightLessBird1.addPreferredFood("insects");
    flightLessBird1.addPreferredFood("nuts");
    flightLessBird1.setCloseToWater(false);

    Birds waterFowl1 = new WaterFowl();
    waterFowl1.setType("ducks");
    waterFowl1.setExtinct(false);
    waterFowl1.setWings(2);
    waterFowl1.setPreferredFood();
    waterFowl1.addPreferredFood("insects");
    waterFowl1.addPreferredFood("fish");
    waterFowl1.addPreferredFood("aquatic invertebrates");
    waterFowl1.setCloseToWater(true);

    Birds owl1 = new Owl();
    owl1.setType("blackowl");
    owl1.setExtinct(false);
    owl1.setWings(2);
    owl1.setPreferredFood();
    owl1.addPreferredFood("eggs");
    owl1.addPreferredFood("small mammals");
    owl1.setCloseToWater(false);

    //DEMO 1
    Conservatory conservatory1 = new Conservatory();
    conservatory1.addRescue(owl1);
    conservatory1.addRescue(parrotBird1);
    conservatory1.addRescue(preyBird1);
    conservatory1.addRescue(waterFowl1);
    conservatory1.addRescue(flightLessBird1);
    System.out.println("Food Map: ");
    System.out.println(conservatory1.getFoodMap());
    System.out.println();
    System.out.println("The description of birds in aviary 0: ");
    System.out.println(conservatory1.getBirdDescription(conservatory1.getAviariesList().get(0)));
    System.out.println("The description of birds in aviary 1: ");
    System.out.println(conservatory1.getBirdDescription(conservatory1.getAviariesList().get(1)));
    System.out.println("The description of birds in aviary 2: ");
    System.out.println(conservatory1.getBirdDescription(conservatory1.getAviariesList().get(2)));
    System.out.println();
    System.out.println("The aviary index of waterFowl1: ");
    System.out.println(conservatory1.getBirdAviary(waterFowl1));
    System.out.println("The aviary index of preyBird1: ");
    System.out.println(conservatory1.getBirdAviary(preyBird1));
    System.out.println("The aviary index of owl1: ");
    System.out.println(conservatory1.getBirdAviary(owl1));
    System.out.println();
    System.out.println("The map of bird type and the aviary index list: ");
    System.out.println(conservatory1.getTypeMap());
    System.out.println();
    System.out.println("The birds included in each aviary: ");
    System.out.println(conservatory1.getAviariesLocationBirds());
    System.out.println();
    System.out.println();
    System.out.println();

    //DEMO 2
    Conservatory conservatory2 = new Conservatory();
    conservatory2.addRescue(owl1);
    conservatory2.addRescue(flightLessBird1);
    System.out.println("Food Map: ");
    System.out.println(conservatory2.getFoodMap());
    System.out.println();
    System.out.println("The description of birds in aviary 0: ");
    System.out.println(conservatory2.getBirdDescription(conservatory1.getAviariesList().get(0)));
    System.out.println("The description of birds in aviary 1: ");
    System.out.println(conservatory2.getBirdDescription(conservatory1.getAviariesList().get(1)));
    System.out.println();
    System.out.println("The aviary index of flightLessBird1: ");
    System.out.println(conservatory2.getBirdAviary(flightLessBird1));
    System.out.println("The aviary index of owl1: ");
    System.out.println(conservatory2.getBirdAviary(owl1));
    System.out.println();
    System.out.println("The map of bird type and the aviary index list: ");
    System.out.println(conservatory2.getTypeMap());
    System.out.println();
    System.out.println("The birds included in each aviary: ");
    System.out.println(conservatory2.getAviariesLocationBirds());
  }
}
