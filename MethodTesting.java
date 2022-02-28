import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
import org.junit.jupiter.api.Test;

@SuppressWarnings("unused")
class MethodTesting {
private static final double DELTA = .0000001;
  @Test
  public void test() {
  Method m = new Method();
  ArrayList<Double> list = new ArrayList<>();
  
  list.add(1.0);
  list.add(2.0);
  list.add(3.0);
  list.add(4.0);
  list.add(5.0);
  
  double actual = m.sum(list);
  double expected = 15.0;
  assertEquals(expected, actual, DELTA);
  }
}
