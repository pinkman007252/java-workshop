package tem.bin;

import java.io.File;

public class FileHandling {
    public static void main(String[] args) {

        File file = new File("C:\\path\\to\\your\\directory"); 

        if (file.isDirectory()) {
            System.out.println("The file is a directory.");
            File[] files = file.listFiles(); 
            if (files != null) {
                System.out.println("Files in the directory:");
                for (File f : files) {
                    System.out.println(f.getName());
                }
            }
        } else {
            System.out.println("The file is not a directory.");
        }
    }
}
