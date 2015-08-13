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
   * @param sessionId
   * @param slotName
   * @param args
   * @return
   */
  public Object callSlot(String sessionId, String slotName, Object[] args);

  /**
   * The client method for starting a test on the wrapper side.
   * The session id is used for
   *
   * @param sessionId the session id of the test designer user that started this test.
   */
  public void startTest(String sessionId);

  /**
   * The client method that is called by the server when a test is finished.
   */
  public void finishTest();

  public String getSUTName();

}
