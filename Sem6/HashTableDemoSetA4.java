import java.util.Map.Entry;
import java.util.*;
class HashTableDemoSetA4{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter no of students");
		int n=sc.nextInt();
		Hashtable<String,Long> contact=new Hashtable<String,Long>();
		for(int i=0;i<n;i++){
			System.out.println("Enter Students name:");
			String name=sc.next();
			System.out.println("Enter student mob no");
			long no=sc.nextLong();
			contact.put(name,no);
		}
		System.out.println("Map ="+contact);
		Set s1=contact.entrySet();
		Iterator i=s1.iterator();
		System.out.println("Name 	Contact Number");
		while(i.hasNext()){
			Map.Entry me=(Entry) i.next();
			System.out.println(""+me.getKey()+"\t"+me.getValue());
		}
	}
}
