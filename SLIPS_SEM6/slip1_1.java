public class slip1_1 extends Thread {
    char ch;

    public void run() {
        for(ch = 'A'; ch <= 'Z'; ch++) {
            System.out.println(ch + " ");
            try {
                Thread.sleep(2000);
            } catch(Exception e) {
                // Handle exception
            }
        }
    }

    public static void main(String args[]) {
        slip1_1 t = new slip1_1();
        t.start();
    }
}
