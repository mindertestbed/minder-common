package minderengine;

import java.io.Serializable;

/**
 * Author: yerlibilgin
 * Date: 17/11/15.
 */
public class SUTIdentifier implements Serializable {
  private String sutName;

  public String getSutName() {
    return sutName;
  }

  public void setSutName(String sutName) {
    this.sutName = sutName;
  }

  @Override
  public String toString() {
    return sutName;
  }
}
