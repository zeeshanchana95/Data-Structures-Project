import java.io.File;
import java.util.Arrays;

public class FileSortExample3 {
   public static void main(String[] args) {
      File dir = new File("C:\\Users\\user\\Desktop\\New folder (2)");

      File[] files = dir.listFiles();

      Arrays.sort(files, (f1, f2) -> {
         return new Long(f1.length()).compareTo(new Long(f2.length()));
      });

      for (File file : files) {
         if (!file.isHidden()) {
            if (!file.isDirectory()) {
               file.list(null);
            }
         }
      }
   }
}