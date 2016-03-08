package minderengine;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Represents a method that acts as a signal. Generally called by the system
 * under test and handled by the server. Signals are asynchronous,i.e. are
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
	 * @return the ConnectionType value, ASYNC by default
	 */
	String name() default "";
	boolean async() default true;
}
