import java.util.Scanner;
class CovidPatient extends Exception{
	public CovidPatient(){
		System.out.println("Patient is Covid positive");
	}
}
class Patient{
	int age,oxy_level,hrtc;
	String name;
	public Patient(String name,int age,int oxy_level,int hrtc){
		try{
		this.name=name;
		this.age=age;
		this.oxy_level=oxy_level;
		this.hrtc=hrtc;

		if(oxy_level<95 && hrtc>10)
			throw new CovidPatient();
		}catch (CovidPatient e){}
	}
	
	public String toString(){
		return "Name: "+name+" age: "+age+" oxy_level: "+oxy_level+" hrtc: "+hrtc;
	}
}
class Covid{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name");
		String n=sc.next();
		System.out.println("Enter age");
		int age=sc.nextInt();
		System.out.println("enter oxy level");
		int oxy=sc.nextInt();
		System.out.println("enter hrtc");
		int h=sc.nextInt();
		Patient p=new Patient(n,age,oxy,h);
		System.out.println(p);
	}
}
