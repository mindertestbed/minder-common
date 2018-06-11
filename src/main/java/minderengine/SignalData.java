package minderengine;

import java.io.Serializable;
import java.util.Comparator;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/**
 * This class represents the data (parameter values) of a signal or an error when a signal is emitted.
 * <br>
 * It contains an important field. The signal number that is used to ensure a correct sequence
 * for signal handling on the server side.
 *
 * The children of this class are responsible of carrying either signal params, or error
 *
 * Created by yerlibilgin on 02/12/14.
 */
public class SignalData implements Serializable, Comparable<SignalData> {
  /**
   * The sequence number of this signal instance. This has to be unique for the minder-client instance
   * that it has been created.
   * <br>
   * It is important to note that this value does not have to be unique for different minder-clients.
   * Because the server will differentiate between signal instances of that kind using the uid of the adapter.
   */
  public final long seqNum;

  /**
   * The signal sequence number generator.
   *
   * @TODO: We should serialize this value to make sure that the server does not get the same numbers
   * after a crash recovery.
   */
  private static final AtomicLong atomicSequenceNumberGenerator = new AtomicLong(0);

  public SignalData(){
    //assign the next sequence number to this instance.
    this.seqNum = atomicSequenceNumberGenerator.getAndIncrement();
  }

  @Override
  public int compareTo(SignalData o) {
    return (int) (this.seqNum - o.seqNum);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;

    SignalData that = (SignalData) o;

    if (seqNum != that.seqNum) return false;

    return true;
  }

  @Override
  public int hashCode() {
    return (int) (seqNum ^ (seqNum >>> 32));
  }
}
