package minderengine;

import java.io.Serializable;

/**
 * Author: yerlibilgin
 * Date: 17/11/15.
 */
public class TestSession implements Serializable {
  private String session;

  public String getSession() {
    return session;
  }

  public void setSession(String session) {
    this.session = session;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;

    TestSession that = (TestSession) o;

    return !(session != null ? !session.equals(that.session) : that.session != null);

  }

  @Override
  public int hashCode() {
    return session != null ? session.hashCode() : 0;
  }

  @Override
  public String toString() {
    return session;
  }
}
