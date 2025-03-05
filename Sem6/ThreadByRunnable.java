class ThreadByRunnable implements Runnable {
    public ThreadByRunnable(){
        Thread t=new Thread(this,"myThread");
        t.start();
    }
    public void run(){
        for(int i=0;i<=30;i++){
            System.out.println("Examination "+i);
            try{
                Thread.sleep(1000);
            }catch(Exception e){}
        }
    }

    public static void main(String args[]){
       new ThreadByRunnable();
    }
}
