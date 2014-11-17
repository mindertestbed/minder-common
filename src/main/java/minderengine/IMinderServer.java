package minderengine;

import java.util.HashMap;

/**
 * Represents the xoolan server interface, used for communicating with the minder server
 * @author yerlibilgin
 *
 */
public interface IMinderServer {
  
  /**
   * called when a client first connects and provides information about its services
   */
  public void hello(HashMap<String, MethodContainer> hashMap);
  
  /**
   * called on the server when a client emits a signal
   */
  public Object signalEmitted(String signalName, Object [] args);
}

