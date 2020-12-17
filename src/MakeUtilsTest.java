import org.junit.Assert;
import org.junit.Test;

public class MakeUtilsTest {

  @Test
  public void makeAll() {
    float v = MakeUtils.px2dip(1280, 758, 800);
    Assert.assertEquals(1024, v, 2);
  }
}