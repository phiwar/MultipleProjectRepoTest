/**
 * Main application class.
 */
public final class Application {

  /**
   * * Private constructor.
   * This class is not meant to be initialized after compile-time.
   */
  private Application() { }
  
  /**
   * Main method. Initializes Counter.
   * @param args The arguments
   */
  public static void main(final String[] args) {
    Counter model = new Counter(1);
    model.inc(2);
    System.out.println(model.getCount());
  }


}
