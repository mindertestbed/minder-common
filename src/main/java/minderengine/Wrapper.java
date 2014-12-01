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
	 * Overridden in case of need to start up a wrapped object before usage
	 */
	public void start() {

	}

	/**
	 * Overridden in case of a need to stop any wrapped object before finalizing
	 * the test
	 */
	public void stop() {

	}

	/**
	 * A shortcut, convenience method for restarting a wrapped object. Defaults
	 * to stop() followed by start(). Subject to change.
	 */
	public void restart() {
		stop();
		start();
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
