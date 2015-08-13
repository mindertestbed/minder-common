/**
 * Created by yerlibilgin on 24/07/15.
 */
public class ThreadLocalTest {
  public static void main(String[] args) {
    ThreadLocal<Long> th = new ThreadLocal<>();

    th.set(5L);

    System.out.println(th.get());
    th.remove();
    System.out.println(th.get());
  }
}
