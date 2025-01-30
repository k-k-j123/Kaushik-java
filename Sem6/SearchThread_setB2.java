import java.io.*;
public class SearchThread_setB2 extends Thread {
    File f1;
    String fname;
    static String str;
    String line;
    LineNumberReader reader = null;

    SearchThread_setB2(String fname) {
        this.fname = fname;
        f1 = new File(fname);
    }

    public void run() {
        try (FileReader fr = new FileReader(f1)) {
            reader = new LineNumberReader(fr);
            while ((line = reader.readLine()) != null) {
                if (line.indexOf(str) != -1) {
                    System.out.println("String found in " + fname + " at line " + reader.getLineNumber());
                    return;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter string to search");
        str = br.readLine();

        FilenameFilter filter = new FilenameFilter() {
            public boolean accept(File file, String name) {
                return name.endsWith(".txt");
            }
        };

        File dir1 = new File(".");
        File[] files = dir1.listFiles(filter);

        if (files.length == 0) {
            System.out.println("No files available with this extension");
        } else {
            Thread[] threads = new Thread[files.length];
            for (int i = 0; i < files.length; i++) {
                threads[i] = new SearchThread_setB2(files[i].getName());
                threads[i].start();
            }

            for (int i = 0; i < files.length; i++) {
                try {
                    threads[i].join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
