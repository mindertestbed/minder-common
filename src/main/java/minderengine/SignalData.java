package minderengine;

import java.io.Serializable;
import java.util.Comparator;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/**
 * This class represents the data (parameter values) of a signal when it is emitted.
 * <br>
 * It contains two important fields. One is a signal number that is used to ensure a correct sequence
 * for signal handling on the server side. The other is the actual signal parameters that have been
 * emitted.
 * <br>
 * Created by yerlibilgin on 02/12/14.
 */
public class SignalData implements Serializable, Comparable<SignalData> {
  /**
   * The sequence number of this signal instance. This has to be unique for the minder-client instance
   * that it has been created.
   * <br>
   * It is important to note that this value does not have to be unique for different minder-clients.
   * Because the server will differentiate between signal instances of that kind using the uid of the wrapper.
   */
  public final long seqNum;

  /**
   * The actual signal arguments that were provided as parameters to the signal being emitted.
   */
  public final Object[] args;

  /**
   * The signal sequence number generator.
   *
   * @TODO: We should serialize this value to make sure that the server does not get the same numbers
   * after a crash recovery.
   */
  private static final AtomicLong atomicSequenceNumberGenerator = new AtomicLong(0);

  public SignalData(Object[] args){
    this.args = args;
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
