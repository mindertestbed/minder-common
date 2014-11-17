package minderengine;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

public class MinderUtils {
  public static Wrapper createWrapper(Class<?> clazz, ISignalHandler signalHandler) {
    return (Wrapper) Enhancer.create(clazz, new Interceptor(signalHandler));
  }

  public static class Interceptor implements MethodInterceptor {
    private ISignalHandler signalHandler;

    public Interceptor(ISignalHandler signalHandler) {
      this.signalHandler = signalHandler;
    }

    @Override
    public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable {
      if (Modifier.isAbstract(method.getModifiers()) && method.isAnnotationPresent(Signal.class)) {
        // this is a signal. implement it
        return signalHandler.handleSignal(obj, method, args);
      } else {
        // perform a regular call
        return method.invoke(obj, args);
      }
    }
  }
}
