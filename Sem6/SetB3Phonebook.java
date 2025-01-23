import java.io.*;
import java.util.*;
class SetB3Phonebook{
	public static void main(String args[]){
		try{
			FileInputStream fin=new FileInputStream("MyPhone.txt");
			Scanner sc=new Scanner(fin).useDelimiter("\t");
			Hashtable<String,String> ht=new Hashtable<String,String>();
			String[] starray;
			String a,str;
			System.out.println("Name \t Phone Number");
			while(sc.hasNext()){
				a=sc.nextLine();
				starray=a.split("\t");
				ht.put(starray[0],starray[1]);
				System.out.println(starray[0]+"\t"+starray[1]);
			}
			Scanner s=new Scanner(System.in);
			System.out.println("Enter the name as given in PhoneBook");
			str=s.next();
			if(ht.containsKey(str)){
				System.out.println("Phone no is:"+ht.get(str));
			}else{
				System.out.println("Name is not matched");
			}
		}
		catch(Exception e){
			System.out.println(e);
		}
	}
}