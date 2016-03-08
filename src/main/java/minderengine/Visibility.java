package minderengine;

/**
 * @author: yerlibilgin
 *
 */
public enum Visibility {
  /**
   * Everyone registered user can see
   */
  PUBLIC,
  /**
   * Only users of the same role can see
   */
  PROTECTED,
  /**
   * Only the owner can see
   */
  PRIVATE
}
