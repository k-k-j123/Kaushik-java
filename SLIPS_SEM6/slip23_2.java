import java.util.*;

public class slip23_2 {
    public static void main(String[] args) {
        // Check for command line arguments
        if (args.length == 0) {
            System.out.println("Please provide student names as command-line arguments.");
            return;
        }

        // Create list from arguments (removed redundant loop)
        List<String> studentNames = new ArrayList<>(Arrays.asList(args));

        // Display student names using Iterator
        System.out.println("\nDisplaying student names using Iterator:");
        Iterator<String> it = studentNames.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        // Display names using ListIterator (forward)
        System.out.println("\nStudent names using ListIterator (forward direction):");
        ListIterator<String> lt = studentNames.listIterator();
        while (lt.hasNext()) {
            System.out.println(lt.next());
        }

        // Display names using ListIterator (backward)
        System.out.println("\nStudent names using ListIterator (backward direction):");
        while (lt.hasPrevious()) {
            System.out.println(lt.previous());
        }
    }
}