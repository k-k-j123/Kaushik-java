import java.util.*;
class Person{
	String fname,lname,mname;

	public Person(String fname,String mname,String lname){
		this.fname=fname;
		this.mname=mname;
		this.lname=lname;
	}

	public String toString(){
		String fnamefirst=fname.substring(0,1);
		String fremainingletters=fname.substring(1,fname.length());
		fnamefirst=fnamefirst.toUpperCase();
		fname=fnamefirst+fremainingletters;

		String mnamefirst=mname.substring(0,1);
		String mremainingletters=mname.substring(1,mname.length());
		mnamefirst=mnamefirst.toUpperCase();
		mname=mnamefirst+mremainingletters;
		
		String lnamefirst=lname.substring(0,1);
		String lremainingletters=lname.substring(1,lname.length());
		lnamefirst=lnamefirst.toUpperCase();
		lname=lnamefirst+lremainingletters;

		return lname+" "+fname+" "+mname;
	}

	public static void main(String args[]){
		Scanner s=new Scanner(System.in);
		System.out.println("enter firstname, Middlename, and Lastname of a person");
		String f=s.next();
		String m=s.next();
		String l=s.next();
		Person p=new Person(f,m,l);
		System.out.println(p);
		s.close();
	}
}


