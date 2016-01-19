package minderengine;

/**
 * The base wrapper class of minder-common.
 * <br>
 * TDs will extend this class in order to integrate their systems to the minder
 * environment.
 * <br>
 * Using this class, any module, built-in function will be represented as an
 * active object belonging to the minder environment.
 * <br>
 * TDs are not expected to know SCALA, this class will be implemented in Java.
 *
 * @author yerlibilgin
 */

public abstract class Wrapper {

  /**
   * The possible exception that might have occurred during a signal call,
   * if this is set, it will be consumed by the next signal call
   * and that signal call will be treated as an error. Thus, please
   * handle with care!.
   *
   * It is thread safe. Thus different threads might use different reports simultaneously.
   */
  private ThreadLocal<SignalFailedException> signalFailedException = new ThreadLocal<>();

  /**
   * Constructor of the base wrapper class
   */
  public Wrapper() {
  }

  /**
   * Overridden in case of need to start up a wrapped object prior to a test
   */
  public void startTest() {

  }

  /**
   * Since 0.4 - added parameter support for future scalability
   */
  public void startTest(StartTestObject startTestObject) {

  }

  /**
   * Provides information about the user that started the current test.
   * An invocation of this method is only valid between start() and stop() methods.
   * <br>
   * This is a special signal that the wrapped SUT may call whenever it wants to.
   * It is a special signal that returns a value.
   *
   * @return test user information data transfer object
   */
  @Signal
  public abstract UserDTO getCurrentTestUserInfo();

  /**
   * Overridden in case of a need to stop any wrapped object before finalizing
   * the test
   */
  public void finishTest() {

  }

  /**
   * Added for future scalability (ability to add paraemters)
   * @param finishTestObject
   */
  public void finishTest(FinishTestObject finishTestObject) {

  }

  /**
   * The wrappers that implement this method are responsible to report
   * the name(s) of the actual System(s) that are being tested. This is used
   * for reporting. For example, the wrapper name might be
   * IBM_B2BWrapper, but the actual SUT name might be "IBM B2B Advanced Communications Gateway"
   * @return The identifier of the actual system under test.
   * @since 0.4.2
   */
  public abstract SUTIdentifiers getSUTIdentifiers();


  /**
   * This method is used for reporting errors on the signals.
   *
   * for example, if we have a signal <code>triggerServer(...)</code>
   *
   * we do the following:
   * <code>
   *   beginSignalError(exception);
   *   triggerServer(...)
   * </code>
   *
   * The beginSignalError call ensures that the next signal call will not be
   * a regular call, instead, it will send an error report (exception)
   * to the server informing that the signal call encountered an error.
   * The parameters of the signal are not important in this case,
   * so put in anything you want (null, -1, -1L, false....)
   *
   * @param signalFailedException
   * the exception that will be reported to the server.
   * @since 0.0.8
   */
  public void beginReportSignalError(SignalFailedException signalFailedException){
    this.signalFailedException.set(signalFailedException);
  }


  /**
   * Returns the exception (if any) then resets its value.
   *
   * The minder-client is responsible of calling this everytime when it will call a signal.
   *
   * @return the exception if any
   */
  public SignalFailedException consumeError(){
    SignalFailedException exception = this.signalFailedException.get();
    this.signalFailedException.remove();
    return exception;
  }
  
  /**
   * Provides gitb specific informations of the gitb compatible wrapper.
   * If wrapper is not gitb compatible, it will not necessary to return any information.
   * <br>
   * 
   * The default implementation returns null, and the clients don't have to implement this method.
   * @return gitb endpont data transfer object
   */
  public GitbEndpointDTO getGitbEndpointMetadata(){
    return null;
  }
}
