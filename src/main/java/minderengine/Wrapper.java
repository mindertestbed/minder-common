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
   * Method for getting the label of a wrapped object. *
   *
   * @return the label of the wrapped object in the minder environment.
   *
   * @deprecated since version 0.0.5 and is not used by the server anymore. The actual name is the one provided
   * during a wrapper registration.
   */
  @Deprecated
  public String getLabel() {
    return "Wrapper";
  }


  /**
   *
   * @param signalIdentifier the name given to the signal via @Signal annotation.
   *                         for example: <code>@Signal(name="mySignal")</code> <br>
   *                         Then <code>reportErrorForSignal("mySignal")</code>
   *
   * @param errorMessage error string
   */
  public abstract void reportErrorForSignal(String signalIdentifier, String errorMessage);
}
