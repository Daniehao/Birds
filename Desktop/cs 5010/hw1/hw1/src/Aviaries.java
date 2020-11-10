import java.util.ArrayList;
import java.util.List;

/**
 * The class for birds' aviaries. Flightless birds, birds of prey, and waterfowl birds are put in
 * separate aviaries.
 */
public class Aviaries {
  private String aviaryName;
  private int currNum;
  private List<String> birdsList;
  private List<String> text;

  /**
   * Constructor for Aviaries.
   *
   * @param bird The bird object
   */
  public Aviaries(Birds bird) {
    birdsList = new ArrayList<>();
    text = new ArrayList<>();
    setAviaryName(bird);
  }

  /**
   * Add a bird into the current Aviary.
   *
   * @param bird The bird object.
   */
  public void addBird(Birds bird) {
    birdsList.add(bird.toString());
    currNum += 1;
    text.add(bird.getCharacteristic());
  }

  /**
   * Set the name of aviary by FlightlessBirds, PreyBirds, WaterFowl, and Other.
   *
   * @param bird The bird object.
   */
  public void setAviaryName(Birds bird) {
    String birdClassName = bird.getClass().toString().substring(6);
    if (!birdClassName.equals("FlightlessBirds") && !birdClassName.equals("PreyBirds")
            && !birdClassName.equals("WaterFowl")) {
      birdClassName = "Other";
    }
    this.aviaryName = birdClassName;
  }

  /**
   * Get the number of birds in the current aviary.
   *
   * @return The number of birds in the aviary.
   */
  public int getCurrNum() {
    return currNum;
  }

  /**
   * Get the list of birds by their address.
   *
   * @return The list of address of the birds.
   */
  public List<String> getBirdsList() {
    return birdsList;
  }

  /**
   * Get the name of the current aviary.
   *
   * @return The name of aviary.
   */
  public String getAviaryName() {
    return aviaryName;
  }

  /**
   * Get the combination of all the birds' description in the current aviary.
   *
   * @return All birds' description in the current aviary.
   */
  public String getText() {
    String textOfAviary = "";
    for (String eachText : text) {
      textOfAviary = textOfAviary + eachText;
    }
    return textOfAviary;
  }
}
