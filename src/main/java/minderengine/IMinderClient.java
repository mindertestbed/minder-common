package minderengine;

/**
 * Represents a client object that is called when needed by the minder server
 * @author yerlibilgin
 */
public interface IMinderClient {
  /**
   * user for invoking a slot method
   */
  public Object callSlot(long sessionId, String slotName, Object [] args);
}
