/*
 * This file is part of minder-common.
 *
 * minder-common is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * Foobar is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with $software.  If not, see <http://www.gnu.org/licenses/>.
 * Copyright (c) 2015.
 *
 *
 */

package minderengine;

import java.io.Serializable;

/**
 * Author: yerlibilgin
 * Date: 17/11/15.
 */
public class AdapterIdentifier implements Serializable {
  private String name;
  private String version;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;

    AdapterIdentifier that = (AdapterIdentifier) o;

    if (name != null ? !name.equals(that.name) : that.name != null) return false;
    return !(version != null ? !version.equals(that.version) : that.version != null);

  }

  @Override
  public int hashCode() {
    int result = name != null ? name.hashCode() : 0;
    result = 31 * result + (version != null ? version.hashCode() : 0);
    return result;
  }

  @Override
  public String toString() {
    if (version == null)
      return name;

    return name + '|' + version;
  }

  /**
   * Parse and return an adapter identifier object from a compound name.
   * Inverse of toString operation
   *
   * @param compoundName
   * @return
   */
  public static AdapterIdentifier parse(String compoundName) {
    final int indexOfBar = compoundName.indexOf('|');

    AdapterIdentifier identifier = new AdapterIdentifier();
    if (indexOfBar == -1) {
      identifier.setName(compoundName);
    } else {
      identifier.setName(compoundName.substring(0, indexOfBar));
      identifier.setVersion(compoundName.substring(indexOfBar + 1));
    }
    return identifier;
  }
}
