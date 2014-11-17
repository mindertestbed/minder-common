package minderengine;

import java.lang.reflect.Method;

public interface ISignalHandler {
  public Object handleSignal(Object obj, Method signalMethod, Object []args);
}
