import java.util.Scanner;

public class Calculator {

  public static void main(String[] args) {
    caluSw();
  }

  /**
   * 根据分辨率和设备尺寸计算sw值
   */
  private static void caluSw() {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter width, height and screen size: (eg. 1080 1920 5)");
    String next = sc.nextLine();
    String[] split = next.split(" ");
    if (split.length == 3) {
      System.out.println(Math.sqrt(Math.pow(Double.parseDouble(split[0]), 2) + Math.pow(
          Double.parseDouble(split[1]), 2)) / Double.parseDouble(split[2]));
    } else {
      System.out.println("格式错误");
    }
  }


}
