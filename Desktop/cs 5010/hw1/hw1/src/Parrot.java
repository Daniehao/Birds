/**
 * Class for Parrot.
 */
public class Parrot extends AbstractBirds {
  /**
   * Constructor for Parrot.
   */
  public Parrot() {
    setCharacteristic();
  }

  /**
   * Set the characteristic of Parrot.
   */
  @Override
  public void setCharacteristic() {
    characteristic = "Having a short, curved beak and are known for their intelligence and ability"
            + "to mimic sounds.";
  }
}
