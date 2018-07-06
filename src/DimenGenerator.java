public class DimenGenerator {

  /**
   * 设计稿尺寸(根据自己设计师的设计稿的宽度填入)
   */
  private static final int DESIGN_WIDTH = 1080;

  /**
   * 适配Android 3.2以上   大部分手机的sw值集中在  300-460之间
   */
  private static final int MIN_WIDTH_DP = 320;
  private static final int MAX_WIDTH_DP = 400;
  private static final int STEP = 10;
  private static final String buildDir = "./out/res/";

  public static void main(String[] args) {
    for (int i = MIN_WIDTH_DP; i <= MAX_WIDTH_DP; i += STEP) {
      MakeUtils.makeAll(DESIGN_WIDTH, i, buildDir);
    }

  }

}
