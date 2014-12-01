package minderengine;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Represents a slot method that is called in response to a particular signal.
 * Implemented by TDs by using the @Slot annotation. May additionally be called
 * directly (not in response to a signal)
 * 
 * @author yerlibilgin
 * 
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ ElementType.METHOD })
public @interface Slot {

}
