package minderengine;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Represents a method that acts as a signal. Signals are asynchronous,i.e. are
 * expected to be received within a time limit. Defined by TDs as abstract
 * methods by using the @Signal annotation.
 * 
 * @author yerlibilgin
 * 
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ ElementType.METHOD })
public @interface Signal {

	/**
	 * Connection type enumeration value, SYNC or ASYNC
	 * 
	 */
	public static enum ConnectionType {
		SYNC, ASYNC
	}

	/**
	 * @return the ConnectionType value, ASYNC by default
	 */
	ConnectionType value() default ConnectionType.ASYNC;
}
