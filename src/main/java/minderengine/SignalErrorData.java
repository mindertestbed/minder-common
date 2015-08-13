package minderengine;

import java.io.Serializable;
import java.util.concurrent.atomic.AtomicLong;

/**
 * This class represents a singal error (Not a regular remote invocation)
 */
public class SignalErrorData extends SignalData{

  public final SignalFailedException signalFailedException;

  public SignalErrorData(SignalFailedException signalFailedException){
    this.signalFailedException = signalFailedException;
  }
}
