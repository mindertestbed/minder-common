package minderengine;

import java.lang.reflect.Method;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

/**
 * Class for association of a adapter with a signal handler.
 *
 * @author yerlibilgin
 */
public class MinderUtils {
  /**
   * Associates a adapter to a SignalHandler
   *
   * @param clazz         The adapter class that is to be associated
   * @param signalHandler The signal handler to be associated to the adapter
   * @return the adapter associated to the desired signal handler.
   */
  public static Adapter createAdapter(Class<Adapter> clazz,
                                      ISignalHandler signalHandler) {
    return (Adapter) Enhancer.create(clazz, new Interceptor(signalHandler));
  }

  /**
   * Class that implements the MethodInterceptor class of cglib.
   *
   * @author yerlibilgin
   */
  public static class Interceptor implements MethodInterceptor {
    private ISignalHandler signalHandler;

    /**
     * @param signalHandler
     */
    public Interceptor(ISignalHandler signalHandler) {
      this.signalHandler = signalHandler;
    }

    /**
     * Method that overrides the intercept method of cglib. If the method is
     * abstract and if it has a @Signal annotation, it calls the
     * corresponding method to handle the signal.
     *
     * @param obj
     * @param method
     * @param args
     * @param proxy
     * @return
     * @throws Throwable
     */
    @Override
    public Object intercept(Object obj, Method method, Object[] args,
                            MethodProxy proxy) throws Throwable {

      if (method.isAnnotationPresent(Signal.class)) {
        // this is a signal. implement it
        return signalHandler.handleSignal(obj, method, args);
      } else {
        // perform a regular call
        return proxy.invokeSuper(obj, args);
      }
    }
  }
}
