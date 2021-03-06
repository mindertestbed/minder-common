package minderengine;

/**
 * Represents a client object that is called when needed by the minder server
 *
 * @author yerlibilgin
 */
public interface IMinderClient {

  /**
   * Method for invoking a slot method
   *
   * @param session
   * @param slotName
   * @param args
   * @return
   */
  public Object callSlot(TestSession session, String slotName, Object[] args);

  /**
   * The client method for starting a test on the adapter side.
   * The session id is used for
   *
   * @param startTestObject the session id of the test designer user that started this test.
   */
  public void startTest(StartTestObject startTestObject);

  /**
   * The client method that is called by the server when a test is finished.
   */
  public void finishTest(FinishTestObject startTestObject);

  public SUTIdentifiers getSUTIdentifiers();
}
