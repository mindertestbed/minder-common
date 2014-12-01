package minderengine;

import java.lang.reflect.Method;
import java.util.Date;
import java.util.HashMap;

/**
 * Class that serves the purpose of saving the resolved methods of a wrapped system.
 * Contains the method itsef and a key generated according to the slot-specific signature
 * @author yerlibilgin
 * 
 */
public class MethodContainer {
	public final String methodKey;
	public final Method method;

	/**
	 * MethodContainer constructor
	 * @param method
	 */
	public MethodContainer(Method method) {
		this.methodKey = generateMethodKey(method);
		this.method = method;
	}

	/**
	 * Method for generating a key of a method
	 * @param method input method
	 * @return the slot-specific signature as key of the method
	 */
	public static String generateMethodKey(Method method) {
		StringBuilder sb = new StringBuilder();

		sb.append(method.getName()).append(".(");
		Class<?>[] types = method.getParameterTypes();
		for (Class<?> clazz : types) {
			sb.append(clazz.getCanonicalName()).append(',');
		}

		sb.deleteCharAt(sb.length() - 1);
		sb.append(')');
		return sb.toString();
	}
}
