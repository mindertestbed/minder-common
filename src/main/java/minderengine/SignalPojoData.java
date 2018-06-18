package minderengine;

/**
 * This class represents a signal data that carries a regular java object
 */
public class SignalPojoData extends SignalData {
  /**
   * The actual signal arguments that were provided as parameters to the signal being emitted.
   */
  public final Object payload;

  public SignalPojoData(Object payload) {
    this.payload = payload;
  }
}
