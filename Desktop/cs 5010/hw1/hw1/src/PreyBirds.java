/**
 * Class for PreyBirds.
 */
public class PreyBirds extends AbstractBirds {
  /**
   * Constructor for Prey birds.
   */
  public PreyBirds() {
    setCharacteristic();
  }

  /**
   * Set the characteristic of prey birds.
   */
  @Override
  public void setCharacteristic() {
    this.characteristic = "Having sharp, hooked beaks with visible nostrils.";
  }
}
