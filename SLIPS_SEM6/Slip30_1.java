class Nsynchro{
	synchronized void disp(){
		try{
			System.out.println("Come on");
			System.out.println("Students");
			System.out.println("Enjoy");
			Thread.sleep(2000);
		}catch(Exception e){}
		System.out.println("book");
		System.out.println("Reading");
	}
}
class Test implements Runnable{
	Thread d;
	Nsynchro ob1;
	public Test(Nsynchro o1){
		ob1=o1;
		d=new Thread(this);
		d.start();
	}
	public void run(){
		ob1.disp();
	}
}
class Slip30_1{
	public static void main(String args[]){
		Nsynchro ob2=new Nsynchro();
		Test ob3=new Test(ob2);
		Test ob4=new Test(ob2);
	}
}