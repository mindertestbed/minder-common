package minderengine;

import java.io.Serializable;

/**
 * Author: yerlibilgin
 * Date: 17/11/15.
 */
public class StartTestObject implements Serializable{
  private TestSession session;

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

    return !(session != null ? !session.equals(that.session) : that.session != null);

  }

  @Override
  public int hashCode() {
    return session != null ? session.hashCode() : 0;
  }
}
