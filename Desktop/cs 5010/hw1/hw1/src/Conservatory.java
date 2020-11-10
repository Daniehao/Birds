import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/**
 * Class for Conservatory, which includes a series of operations to rescue bird, find birds' food
 * list, get birds' location, and get birds' type with their houses.
 */
public class Conservatory {
  List<Aviaries> aviariesList;
  Map<String, Integer> foodMap;
  int aviariesIndex;
  Map<Birds, Integer> birdsAviariesMap;
  Map<String, List<Integer>> typeMap;

  /**
   * Constructor for Conservatory class.
   */
  public Conservatory() {
    aviariesList = new ArrayList<>();
    foodMap = new HashMap<>();
    aviariesIndex = 0;
    birdsAviariesMap = new HashMap<>();
    typeMap = new HashMap<>();
  }

  /**
   * Rescue a bird and put it check if it can be added into the current conservatory.
   *
   * @param bird The bird object.
   */
  public void addRescue(Birds bird) {
    if (!bird.getIsExtinct() && aviariesList.size() < 20) {
      addBirdInAviaries(bird);
    } else if (aviariesList.size() >= 20) {
      throw new IllegalArgumentException("The aviaries are full.");
    } else {
      throw new IllegalArgumentException("The bird has already extinct.");
    }
  }

  /**
   * Add the bird into the current conservatory.
   *
   * @param bird The bird object.
   */
  public void addBirdInAviaries(Birds bird) {
    String birdClass = bird.getClass().toString().substring(6);
    if (!birdClass.equals("FlightlessBirds") && !birdClass.equals("PreyBirds")
            && !birdClass.equals("WaterFowl")) {
      birdClass = "Other";
    }
    boolean aviaryExist = false;
    for (int i = 0; i < aviariesList.size(); i++) {
      //Use current aviary
      if (aviariesList.get(i).getAviaryName() == birdClass
              && aviariesList.get(i).getCurrNum() < 5) {
        aviaryExist = !aviaryExist;
        addIntoLists(bird, i);
      }
    }
    //create aviary
    if (!aviaryExist) {
      createAviary(bird);
    }
  }

  /**
   * Create a new empty aviary.
   *
   * @param bird The bird object.
   */
  public void createAviary(Birds bird) {
    //temp
    Aviaries aviary = new Aviaries(bird);
    aviariesList.add(new Aviaries(bird));
    addIntoLists(bird, aviariesIndex);
    aviariesIndex++;
  }

  /**
   * Add a bird into the aviaries list.
   *
   * @param bird The bird object.
   * @param i    The index that it should be inserted intp.
   */
  public void addIntoLists(Birds bird, int i) {
    aviariesList.get(i).addBird(bird);
    birdsAviariesMap.put(bird, i);
    addFoodMap(bird);
    if (!typeMap.containsKey(bird.getType())) {
      typeMap.put(bird.getType(), new ArrayList<>());
    }
    typeMap.get(bird.getType()).add(i);
  }

  /**
   * Add a bird into the current food map and update the food quantity.
   *
   * @param bird The bird object.
   */
  public void addFoodMap(Birds bird) {
    List<String> foodList = bird.getPreferredFood();
    int n = foodList.size();
    for (int i = 0; i < n; i++) {
      String food = foodList.get(i);
      if (foodMap.containsKey(food)) {
        foodMap.put(food, foodMap.get(food) + 1);
      } else {
        foodMap.put(food, 1);
      }
    }
  }

  /**
   * Get the food needs to be kept with quantities.
   *
   * @return The string of food with required quantity.
   */
  public String getFoodMap() {
    String foodStr = "";
    for (String food : foodMap.keySet()) {
      foodStr = foodStr + food + " quantity is: " + foodMap.get(food) + "; ";
    }
    return foodStr;
  }

  /**
   * Produce a String that lists all birds in the conservatory in alphabetical order and their
   * location.
   *
   * @return The string that including the bird is living in which conservatory.
   */
  public String getTypeMap() {
    Map<String, List<Integer>> treeMap = new TreeMap<>(typeMap);
    String rst = "";
    for (String str : treeMap.keySet()) {
      rst = rst + "The " + str + " are in: " + treeMap.get(str) + ".";
    }
    return rst;
  }

  /**
   * Get the aviary a bird is in.
   *
   * @param bird The bird object.
   * @return The string of bird with its location.
   */
  public String getBirdAviary(Birds bird) {
    for (Birds birdInMap : birdsAviariesMap.keySet()) {
      if (birdInMap.equals(bird)) {
        return "This bird is in Aviary: " + birdsAviariesMap.get(birdInMap) + ".";
      }
    }
    return "This bird is not in current aviaries.";
  }

  /**
   * Produce text for a given aviary and return with a description of the birds it houses.
   *
   * @param aviary The aviary object.
   * @return The combination string of the aviary's birds' description.
   */
  public String getBirdDescription(Aviaries aviary) {
    return aviary.getText();
  }

  /**
   * Produce a string with all the aviaries by aviary index order and show the birds they house.
   *
   * @return String with aviary index and the birds list in the aviary.
   */
  public String getAviariesLocationBirds() {
    Map<Integer, List<String>> aviaryLocation = new HashMap<>();
    String aviaryLocationStr = "";
    for (int i = 0; i < aviariesList.size(); i++) {
      aviaryLocation.put(i, aviariesList.get(i).getBirdsList());
      aviaryLocationStr = aviaryLocationStr + "For aviary index " + i + ", the birds are "
              + aviariesList.get(i).getBirdsList().toString() + ". ";
    }
    return aviaryLocationStr;
  }

  /**
   * Get the aviaries list.
   *
   * @return List of aviaries by the objects of aviaries.
   */
  public List<Aviaries> getAviariesList() {
    return aviariesList;
  }
}
