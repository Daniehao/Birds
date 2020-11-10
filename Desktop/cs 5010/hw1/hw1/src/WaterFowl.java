/**
 * Class for WaterFowl.
 */
public class WaterFowl extends AbstractBirds {
  /**
   * Constructor for WaterFowl.
   */
  public WaterFowl() {
    setCharacteristic();
  }

  /**
   * Set the characteristic of WaterFowl birds.
   */
  @Override
  public void setCharacteristic() {
    this.characteristic = "Living near water sources (fresh or salt).";
  }
}