package minderengine;

import java.lang.reflect.Method;

public class MethodContainer {
  public final String methodKey;
  public final Method method;

  public MethodContainer(Method method) {
    this.methodKey = generateMethodKey(method);
    this.method = method;
  }

  public static String generateMethodKey(Method method) {
    StringBuilder sb = new StringBuilder();
    
    sb.append(method.getName()).append(".(");
    Class<?>[] types = method.getParameterTypes();
    for (Class<?> clazz : types) {
      sb.append(clazz.getSimpleName()).append(',');
    }
    
    sb.deleteCharAt(sb.length()-1);
    sb.append(')');
    return null;
  }
}
