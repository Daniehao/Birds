/**
 * Class for Flightless Birds.
 */
public class FlightlessBirds extends AbstractBirds {
  /**
   * Constructor for FlightlessBirds.
   */
  public FlightlessBirds() {
    setCharacteristic();
  }

  /**
   * Set the characteristic of flightless birds.
   */
  @Override
  public void setCharacteristic() {
    this.characteristic = "Living on the ground and have no (or undeveloped) wings.";
  }
}
