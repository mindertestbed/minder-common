package minderengine;

import java.io.Serializable;
import java.util.concurrent.atomic.AtomicLong;

/**
 * This class represents a signal data that carries a regular remote invocation.
 */
public class SignalCallData extends SignalData {
  /**
   * The actual signal arguments that were provided as parameters to the signal being emitted.
   */
  public final Object[] args;

  public SignalCallData(Object[] args){
    this.args = args;
  }
}
