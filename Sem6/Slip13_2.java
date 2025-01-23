import java.util.Random;
class Slip13_2 implements Runnable{
	private String t_name;
	private int sleep_time;
	public Slip13_2(String name){
		t_name=name;
		Random rand=new Random();
		sleep_time=rand.nextInt(5000);
	}
	public void run(){
		System.out.println(t_name+" Created\n");
		try{
			Thread.sleep(sleep_time);
			System.out.println(t_name+" Sleeps for "+sleep_time+" milliseconds.\n");
		}
		catch(Exception e){System.out.println("Exception:"+e);}
		System.out.println(t_name+" dead\n");
	}

	public static void main(String args[]){
		Thread t1=new Thread(new Slip13_2("Thread 1....."));
		Thread t2=new Thread(new Slip13_2("Thread 2....."));
		t1.start();
		t2.start();
		try{
			t1.join();
			t2.join();
		}
		catch(Exception e){
			System.out.println("Exception:"+e);
		}
		System.out.println("Main thread finish.");
	}
}