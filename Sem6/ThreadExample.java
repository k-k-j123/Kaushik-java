class ThreadExample extends Thread{
    public void run(){
        for(int i=0;i<=30;i++){
            System.out.println("Examination "+i);
            try{
                Thread.sleep(1000);
            }catch(Exception e){
                e.printStackTrace();
            }
        }
    }

    public static void main(String args[]){
        ThreadExample t1=new ThreadExample();
        t1.start();
    }
}