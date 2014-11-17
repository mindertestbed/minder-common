package minderengine

/**
 * The metadata information that lives aside a wrapper.
 * Provides information about the icon, label and description
 * This information can be used to represent the wrapper in UI's.
 *
 * @author yerlibilgin
 *
 */


class UIMetadata {
  /**
   * The label of the owning wrapper
   */
  var label = "Wrapper " + IdFactory.next

  /**
   * the full URL of the icon.
   * default is /icons/wrapper.png
   */
  var iconUrl: String = "/icons/wrapper.png";

  /**
   * Extended information about the owning wrapper
   */
  var description: String = "";
}

object IdFactory {
  /**
   * Current integer value
   */
  private var _next = new scala.actors.threadpool.AtomicInteger(0)

  /**
   * Static function to increment and get the id. But get comes first.
   * so the first returned value is going to be the initial value of _next
   */
  def next = _next.getAndIncrement().intValue;
}
