import java.io.*;
import java.util.Scanner;

public class slip14_1 extends Thread {
    File file;
    static String searchStr;

    slip14_1(String fileName) {
        this.file = new File(fileName);
    }

    public void run() {
        try (LineNumberReader reader = new LineNumberReader(new FileReader(file))) {
            String line;
            while ((line = reader.readLine()) != null) {
                if (line.contains(searchStr)) {
                    System.out.println("String found in " + file.getName() + " at line " + reader.getLineNumber());
                    return;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter string to search:");
        searchStr = scanner.nextLine();

        File[] files = new File(".").listFiles((dir, name) -> name.endsWith(".txt"));

        if (files == null || files.length == 0) {
            System.out.println("No .txt files found.");
        } else {
            for (File file : files) {
                slip14_1 thread = new slip14_1(file.getName());
                thread.start();
                try {
                    thread.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
        scanner.close();
    }
}