import java.util.*;
class Slip4_2{
	public static void main(String args[]){ 
		Hashtable<String,Integer> ht=new Hashtable<>();
		int std_code;
		String city_name=null;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of records");
		int n=sc.nextInt();
		for(int i=0;i<n;i++){
			System.out.println("Enter City name:");
			city_name=sc.next();
			System.out.println("enter STD code");
			std_code=sc.nextInt();
			ht.put(city_name,std_code);
		}
		System.out.println("Hash table="+ht);
		System.out.println("Enter city name to be search");
		String search_nm=sc.next();
		if(ht.containsKey(search_nm))
			System.out.println("Std code of city "+search_nm+" is "+ht.get(search_nm));
		else
			System.out.println("City not found");
		System.out.println("Enter city name to remove :");
		String removeCity=sc.next();
		ht.remove(removeCity);
		System.out.println("After Removing City " + removeCity+" data is "+ht);
		sc.close();
	}
}

