package minderengine;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Represents a method that acts as a signal. Signals are
 * asynchronous, you expect to receive them within a time limit
 * @author yerlibilgin
 *
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD})
public @interface Signal {
  public static enum ConnectionType{
    SYNC,
    ASYNC
  }
  
  ConnectionType value() default ConnectionType.ASYNC;
}
