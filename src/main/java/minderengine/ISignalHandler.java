package minderengine;

import java.lang.reflect.Method;

/**
 * Base class for Signal Handlers.
 * 
 * @author yerlibilgin
 * 
 */
public interface ISignalHandler {
	/**
	 * Method used to implement a signal handler
	 * 
	 * @param obj
	 * @param signalMethod
	 * @param args
	 * @return
	 */
	public Object handleSignal(Object obj, Method signalMethod, Object[] args);
}
