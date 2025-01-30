class Print extends Thread{
    String msg;
    int n;
    public Print(int n, String msg){
        this.msg=msg;
        this.n=n;
    }

    public void run(){
        for(int i=0;i<n;i++){
            System.out.println(msg);
        }
    }
}
public class Ass2SetA1 {
    public static void main(String args[]) throws Exception{
        Print t1=new Print(10,"COVID19");
        Print t2=new Print(20,"LOCKDOWN2020");
        Print t3=new Print(30,"VACCINATED2021");
        
        t1.start();
        t2.start();
        t3.start();
    }
}
