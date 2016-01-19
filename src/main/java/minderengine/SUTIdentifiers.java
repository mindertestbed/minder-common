package minderengine;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Author: yerlibilgin
 * Date: 17/11/15.
 */
public class SUTIdentifiers implements Serializable {
  private ArrayList<SUTIdentifier> identifiers;

  public ArrayList<SUTIdentifier> getIdentifiers() {
    if (identifiers == null)
      identifiers = new ArrayList<>();
    return identifiers;
  }
}
