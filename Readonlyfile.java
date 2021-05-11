import java.io.File;
 
import java.io.IOException;

public class FileAttributesDemo {

  public static void main(String[] args) throws IOException {
    
    File file = new File("test.txt");
    if (file.exists()) {
      file.delete();
    }
    file.createNewFile();
    System.out.println("Before. canWrite?" + file.canWrite());

    
    file.setWritable(false);
    System.out.println("After. canWrite?" + file.canWrite());
  }
}
