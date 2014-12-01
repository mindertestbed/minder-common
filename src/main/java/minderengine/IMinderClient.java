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
	public Object callSlot(long sessionId, String slotName, Object[] args);
}
