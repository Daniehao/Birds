import java.util.ArrayList;
import java.util.List;

/**
 * AbstractBirds includes all of the abstract methods and non-abstract methods that included in the
 * Birds interface.
 */
abstract class AbstractBirds implements Birds {
  String birdType;
  String characteristic;
  Boolean hasExtinct;
  int wings;
  String favoriteWord;
  int totalWords;
  List<String> preferredFood;
  boolean closeToWater;

  /**
   * Set preferred food list.
   */
  public void setPreferredFood() {
    preferredFood = new ArrayList<>();
  }

  /**
   * Get the type.
   *
   * @return The type of the bird.
   */
  public String getType() {
    return birdType;
  }

  /**
   * Get the characteristic.
   *
   * @return The characteristic of the bird.
   */
  public String getCharacteristic() {
    return characteristic;
  }

  /**
   * Get the extinct status.
   *
   * @return Whether the bird extinct or not.
   */
  public boolean getIsExtinct() {
    return hasExtinct;
  }

  /**
   * Get the number of wings.
   *
   * @return The wings' number of the bird.
   */
  public int getWings() {
    return wings;
  }

  /**
   * Get the preferred food list.
   *
   * @return The list of preferred food for the bird.
   */
  public List<String> getPreferredFood() {
    return preferredFood;
  }

  /**
   * Set the bird type.
   *
   * @param type The type of the bird.
   */
  public void setType(String type) {
    birdType = type;
  }

  /**
   * abstract method of set characteristic of bird.
   */
  public abstract void setCharacteristic();

  /**
   * Set the extinct status of the bird.
   *
   * @param hasExtinct The extinct status of the bird.
   */
  public void setExtinct(boolean hasExtinct) {
    this.hasExtinct = hasExtinct;
  }

  /**
   * Set the wings' number.
   *
   * @param wings The bird's wings' number.
   */
  public void setWings(int wings) {
    this.wings = wings;
  }

  /**
   * Set the preferred food list by add preferred food.
   *
   * @param food The preferred food.
   */
  public void addPreferredFood(String food) {
    preferredFood.add(food);
  }

  /**
   * Set the bird is living close to water or not.
   *
   * @param closeToWater The bird is living close to water or not.
   */
  public void setCloseToWater(boolean closeToWater) {
    this.closeToWater = closeToWater;
  }

  /**
   * Get the bird's water living status.
   *
   * @return Whether the bird lives close to water.
   */
  public boolean getCloseToWater() {
    return closeToWater;
  }

  /**
   * Set the total number of words the bird can speak.
   *
   * @param totalNumWords The total number of words the bird could speak.
   */
  public void setTotalNumWords(int totalNumWords) {
    this.totalWords = totalNumWords;
  }

  /**
   * Set the favorite word of the bird.
   *
   * @param word The favorite word of the bird.
   */
  public void setFavoriteWord(String word) {
    this.favoriteWord = word;
  }

  /**
   * Get the total number of words the bird can speak.
   *
   * @return totalWords The total number of words the bird can speak.
   */
  public int getTotalNumWords() {
    return totalWords;
  }

  /**
   * Get the favorite word of the bird.
   *
   * @return The favorite word of the bird.
   */
  public String getFavoriteWord() {
    return favoriteWord;
  }
}
