import java.io.File;
import java.util.Scanner;

public class FileInfo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a file name: ");
        String fileName = scanner.nextLine();
        
        File file = new File(fileName);    
        if (!file.exists()) {
            System.out.println("The file does not exist.");
            return;
        }

        
        System.out.println("File Name: " + file.getName());
        System.out.println("Absolute Path: " + file.getAbsolutePath());
        System.out.println("Readable: " + file.canRead());
        System.out.println("Writable: " + file.canWrite());
        System.out.println("File Type: " + getFileType(file));
        System.out.println("File Length: " + file.length() + " bytes");
    }

    private static String getFileType(File file) {
        String fileName = file.getName();
        int dotIndex = fileName.lastIndexOf('.');
        
        if (dotIndex > 0 && dotIndex < fileName.length() - 1) {
            return fileName.substring(dotIndex + 1).toUpperCase(); 
        } else {
            return "No extension"; 
        }
    }
}

