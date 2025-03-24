class slip15_1 extends Thread {
    public void run() {
        System.out.println("Thread Name: " + getName());
        System.out.println("Thread Priority: " + getPriority());
    }
    public static void main(String[] args) {
        slip15_1 t1 = new slip15_1();
        slip15_1 t2 = new slip15_1();
        t1.setName("FirstThread");
        t2.setName("SecondThread");
        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.MAX_PRIORITY);
        t1.start();
        t2.start();
    }
}