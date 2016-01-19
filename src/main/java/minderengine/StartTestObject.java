package minderengine;

import java.io.Serializable;
import java.util.Properties;

/**
 * Author: yerlibilgin
 * Date: 17/11/15.
 */
public class StartTestObject implements Serializable {
  private TestSession session;
  private Properties properties;

  public TestSession getSession() {
    return session;
  }

  public void setSession(TestSession session) {
    this.session = session;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;

    StartTestObject that = (StartTestObject) o;

    if (session != null ? !session.equals(that.session) : that.session != null) return false;
    return properties != null ? properties.equals(that.properties) : that.properties == null;

  }

  @Override
  public int hashCode() {
    int result = session != null ? session.hashCode() : 0;
    result = 31 * result + (properties != null ? properties.hashCode() : 0);
    return result;
  }

  public Properties getProperties() {
    return properties;
  }

  public void setProperties(Properties properties) {
    this.properties = properties;
  }
}
