import java.io.*;
import java.util.Scanner;

public class FileDirectoryChecker {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a file path: ");
        String pathStr = scanner.nextLine();
        
        File dir = new File(pathStr);

        if (!dir.isDirectory()) {
            System.out.println("Error: The specified path is not a directory.");
            return;
        }

        listFilesInDirectory(dir,scanner);
    }

    private static void listFilesInDirectory(File dir,Scanner scanner) {
        File[] files = dir.listFiles();
        if (files == null || files.length == 0) {
            System.out.println("No files found in the directory.");
            return;
        }

        int deletedCount = 0;

        for (File file : files) {
            if (file.isFile()) {
                String fileName = file.getName();
                String extension = getFileExtension(fileName);

                if (extension.equalsIgnoreCase("txt")) {
                    System.out.println("Text file: " + fileName);
                } else {
                    System.out.println("Non-text file: " + fileName + " (Path: " + file.getAbsolutePath() + ")");
                }
            }
        }

        System.out.print("Do you want to delete all text files? (yes/no): ");
        if (scanner.nextLine().equalsIgnoreCase("yes")) {
            for (File file : files) {
                if (file.isFile() && getFileExtension(file.getName()).equalsIgnoreCase("txt")) {
                    if (file.delete()) {
                        deletedCount++;
                    }
                }
            }
            System.out.println(deletedCount + " text files deleted.");
        } else {
            System.out.println("Deletion operation cancelled.");
        }
    }

    private static String getFileExtension(String fileName) {
        int dotIndex = fileName.lastIndexOf('.');
        return (dotIndex == -1) ? "" : fileName.substring(dotIndex + 1);
    }
}

