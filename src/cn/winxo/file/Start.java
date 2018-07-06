package cn.winxo.file;

public class Start {

  public static void main(String[] args) {
    try {
      UnZipUtils.unZipFolder("", "test");
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

}
