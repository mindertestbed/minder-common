package minderengine;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.HashMap;

/**
 * Exception mechanism of minder environment
 * @author yerlibilgin
 * 
 */
@SuppressWarnings("serial")
public class MinderException extends RuntimeException {
	public static final int E_UNKNOWN_RUNNING = -100;
	public static final int E_SUT_NOT_RUNNING = -101;
	private int errorCode;
	private static HashMap<Integer, String> errorCodeStrMap;

	/**
	 * 
	 * @param errorCode
	 * @param message
	 * @param cause
	 */
	public MinderException(int errorCode, String message, Throwable cause) {
		super(message, cause);
	}

	/**
	 * 
	 * @param errorCode
	 * @param message
	 */
	public MinderException(int errorCode, String message) {
		super(message);
	}

	/**
	 * 
	 * @param errorCode
	 * @param cause
	 */
	public MinderException(int errorCode, Throwable cause) {
		super(cause);
	}

	/**
	 * 
	 * @param errorCode
	 */
	public MinderException(int errorCode) {
		super(errorCodeToString(errorCode));
		this.errorCode = errorCode;
	}

	/**
	 * 
	 * @return
	 */
	public int getErrorCode() {
		return errorCode;
	}

	/**
	 * 
	 * @param errorCode
	 * @return
	 */
	public synchronized static String errorCodeToString(int errorCode) {
		if (errorCodeStrMap == null) {
			Field[] fields = MinderException.class.getDeclaredFields();

			for (Field field : fields) {
				if (Modifier.isStatic(field.getModifiers())
						&& Modifier.isFinal(field.getModifiers())
						&& Modifier.isPublic(field.getModifiers())) {
					try {
						errorCodeStrMap
								.put(field.getInt(null), field.getName());
					} catch (Exception e) {
					}
				}
			}
		}
		return errorCodeStrMap.get(errorCode);
	}
}
