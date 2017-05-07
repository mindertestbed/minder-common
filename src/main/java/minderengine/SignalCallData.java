package minderengine;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.concurrent.atomic.AtomicLong;

/**
 * This class represents a signal data that carries a regular remote invocation.
 */
public class SignalCallData extends SignalData {
  /**
   * The actual signal arguments that were provided as parameters to the signal being emitted.
   */
  public byte[][] args;

  public SignalCallData(Object[] args) {
    if (args != null) {
      if (args.length == 0)
        this.args = new byte[0][];
      else {
        this.args = new byte[args.length][];
        for (int i = 0; i < args.length; ++i) {
          try {
            ByteArrayOutputStream out = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(out);
            oos.writeObject(args[i]);
            oos.close();
            this.args[i] = out.toByteArray();
          } catch (IOException e) {
            e.printStackTrace();
          }
        }
      }
    }
  }
}
