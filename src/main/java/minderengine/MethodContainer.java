package minderengine;

import java.io.Serializable;
import java.lang.reflect.Method;
import java.util.Date;
import java.util.HashMap;

/**
 * Class that serves the purpose of saving the resolved methods of a wrapped system.
 * Contains the method itself and a key generated according to the slot-specific signature
 *
 * @author yerlibilgin
 */
public class MethodContainer implements Serializable {
  public final String methodKey;
  public final boolean isSignal;

  /**
   * This method is not sent to (and is not needed by) the server. Besides, java.lang.Method is not serializable :-(
   */
  transient public final Method method;

  /**
   * MethodContainer constructor
   *
   * @param method
   */
  public MethodContainer(Method method) {
    this.methodKey = generateMethodKey(method);
    this.method = method;

    //check the type of the method. Make sure that it is a signal or a slot.
    if (method.isAnnotationPresent(Signal.class)) isSignal = true;
    else if (method.isAnnotationPresent(Slot.class)) isSignal = false;
    else throw new IllegalArgumentException(method.getName() + " is neither a signal, nor a slot");
  }

  /**
   * Method for generating a key of a method
   *
   * @param method input method
   * @return the slot-specific signature as key of the method
   */
  public static String generateMethodKey(Method method) {
    StringBuilder sb = new StringBuilder();
    sb.append(method.getName()).append("(");

    Class<?>[] types = method.getParameterTypes();
    if (types.length > 0) {
      for (Class<?> clazz : types) {
        sb.append(clazz.getCanonicalName()).append(',');
      }
      sb.deleteCharAt(sb.length() - 1);
    }
    sb.append(')');
    return sb.toString();
  }
}
