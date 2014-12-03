package minderengine;

/**
 * 
 * The base wrapper class of minder-common.
 * 
 * TDs will extend this class in order to integrate their systems to the minder
 * environment.
 * 
 * Using this class, any module, built-in function will be represented as an
 * active object belonging to the minder environment.
 * 
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
	 *
	 * Minder-client is responsible for filling this method in runtime to provide the
	 * active session user.
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
	 */
	public String getLabel() {
		return "Wrapper";
	}
}
