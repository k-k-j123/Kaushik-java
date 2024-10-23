import java.util.Scanner;
class Continent{
	String Continent_name;
	public Continent(String Continent_name){
		this.Continent_name=Continent_name;
	}
}
class Country extends Continent{
	String Country_name;
	public Country(String Continent_name,String Country_name){
		super(Continent_name);
		this.Country_name=Country_name;
	}
}
class State extends Country{
	String State_name;
	public State(String Continent_name,String Country_name,String State_name){
		super(Continent_name,Country_name);
		this.State_name=State_name;
	}
}
class place extends State{
	String place_name;
	public place(String Continent_name,String Country_name,String State_name,String place_name){
		super(Continent_name,Country_name,State_name);
		this.place_name=place_name;
	}

	public String toString(){
		return "\nContinent:"+Continent_name+"\nCountry:"+Country_name+"\nState name:"+State_name+"\nPlace name:"+place_name;
	}
}
class CountryInheritance{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Continent");
		String Cont=sc.next();
		System.out.println("Enter Country");
		String Cou=sc.next();
		System.out.println("Enter State");
		String sta=sc.next();
		System.out.println("Enter place");
		String pla=sc.next();

		place x=new place(Cont,Cou,sta,pla);
		System.out.println(x);
		sc.close();
	}
}


