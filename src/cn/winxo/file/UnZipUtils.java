package cn.winxo.file;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;

public class UnZipUtils {

  public static void unZipFolder(String zipFileString, String outPathString) throws Exception {
    File outDir = new File(outPathString);
    if (!outDir.exists()) {
      outDir.mkdir();
    }
    ZipInputStream inZip = new ZipInputStream(new FileInputStream(zipFileString));
    ZipEntry zipEntry;
    String szName;
    while ((zipEntry = inZip.getNextEntry()) != null) {
      szName = zipEntry.getName();
      if (zipEntry.isDirectory()) {
        // get the folder name of the widget
        szName = szName.substring(0, szName.length() - 1);
        File folder = new File(outPathString + File.separator + szName);
        folder.mkdirs();
      } else {
        File file = new File(outPathString + File.separator + szName);
        file.createNewFile();
        // get the output stream of the file
        FileOutputStream out = new FileOutputStream(file);
        int len;
        byte[] buffer = new byte[1024];
        // read (len) bytes into buffer
        while ((len = inZip.read(buffer)) != -1) {
          // write (len) byte from buffer at the position 0
          out.write(buffer, 0, len);
          out.flush();
        }
        out.close();
      }
    }
    inZip.close();
  }


}
