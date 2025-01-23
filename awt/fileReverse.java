import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class fileReverse {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the path of the text file: ");
        String filePath = scanner.nextLine();

        StringBuffer content = new StringBuffer();
        Scanner fileReader = new Scanner(new File(filePath));

        while (fileReader.hasNextLine()) {
            content.append(fileReader.nextLine()).append("\n");
        }

        StringBuffer reversedContent = content.reverse();
        for (int i = 0; i < reversedContent.length(); i++) {
            char c = reversedContent.charAt(i);
            if (Character.isUpperCase(c)) {
                reversedContent.setCharAt(i, Character.toLowerCase(c));
            } else if (Character.isLowerCase(c)) {
                reversedContent.setCharAt(i, Character.toUpperCase(c));
            }
        }

        System.out.println("Reversed and case-changed content:\n");
        System.out.println(reversedContent);

        fileReader.close();
        scanner.close();
    }
}

