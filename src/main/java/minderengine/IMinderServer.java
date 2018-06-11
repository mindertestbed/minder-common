package minderengine;

import java.util.Set;

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
	 * @param identifier
	 * Adapter|Version
	 * @param methodSet
	 *            the set of signals and slots provided by the underlying adapter.
	 */
	public void hello(AdapterIdentifier identifier, Set<MethodContainer> methodSet);

	/**
	 * Method to get information about the test designer that runs the tests
	 *
	 * @param session
	 * @return
	 */
	public UserDTO getUserInfo(TestSession session);

	/**
	 * Method called on the server when a client emits a signal
	 *
	 * @param session  The session information attached with the current call.
	 * @param identifier      the adapter identifier
	 * @param signalName   the signal name
	 * @param signalData   the signal data (method arguments)
	 * @return
	 */
	public Object signalEmitted(TestSession session, AdapterIdentifier identifier, String signalName, SignalData signalData);
}
