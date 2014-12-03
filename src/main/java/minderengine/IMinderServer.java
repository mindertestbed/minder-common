package minderengine;

import java.util.HashMap;

/**
 * Represents the xoolan server interface, used for communicating with the
 * minder server
 * 
 * @author yerlibilgin
 * 
 */
public interface IMinderServer {

	/**
	 * Method called when a client connects for the first time and provides
	 * information about its services
	 * 
	 * @param hashMap
	 *            hashmap of the services provided by the client
	 */
	public void hello(String uid, HashMap<String, MethodContainer> hashMap);

	/**
	 * Method to get information about the test designer that runs the tests
	 * 
	 * @param sessionId
	 * @return
	 */
	public UserDTO getUserInfo(String sessionId);

	/**
	 * Method called on the server when a client emits a signal
	 * 
	 * @param signalName
	 * @param signalData
	 * @return
	 */
	public Object signalEmitted(String sessionId, String uid, String signalName, SignalData signalData);
}
