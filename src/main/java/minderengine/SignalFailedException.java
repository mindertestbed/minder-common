package minderengine;

/**
 * Created by yerlibilgin on 24/07/15.
 *
 * This is used for reporting errors instead of regular signal calls.
 * please refer to Wrapper.beginReportSignalError
 *
 * @since 0.0.8
 */
public class SignalFailedException extends RuntimeException {
  public SignalFailedException(String detail) {
    super(detail);
  }

  /**
   * Dangerous, use with care, may cause serialization exceptions as well as server side ClassNotFoundExceptions
   *
   * @param th
   */
  public SignalFailedException(Throwable th) {
    super(th);
  }

  /**
   * Dangerous, use with care, may cause serialization exceptions as well as server side ClassNotFoundExceptions
   *
   * @param th
   */
  public SignalFailedException(String message, Throwable th) {
    super(message, th);
  }
}
