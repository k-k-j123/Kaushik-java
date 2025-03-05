import java.util.Random;
class NumberGenerator extends Thread{
    public void run(){
        Random rand=new Random();
        while(true){
            try{
                Thread.sleep(1000);
            }catch(InterruptedException e){
                System.out.println(e);
            }
            int num=rand.nextInt(100);
            if(num%2==0){
                System.out.println("Even Number: "+num);
                SquareCalculator sc=new SquareCalculator(num);
                sc.start();
            }else{
                System.out.println("Odd Number: "+num);
                CubeCalculator cc=new CubeCalculator(num);
                cc.start();
            }
        }
    }
}
class SquareCalculator extends Thread{
    int num;
    SquareCalculator(int num){
        this.num=num;
    }
    public void run(){
        System.out.println("Square of "+num+" is: "+num*num);
    }
}
class CubeCalculator extends Thread{
    int num;
    CubeCalculator(int num){
        this.num=num;
    }
    public void run(){
        System.out.println("Cube of "+num+" is: "+num*num*num);
    }
}
class slip7_1{
    public static void main(String[] args){
        NumberGenerator ng=new NumberGenerator();
        ng.start();
    }
}