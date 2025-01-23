import java.util.*;
public class MapSetB2{
	public static void main(String args[]){
		HashMap<Integer,String> hm=new HashMap<Integer,String>();
		hm.put(9,"Nine");
		hm.put(4,"Four");
		hm.put(3,"Three");
		hm.put(7,"Seven");
		hm.put(6,"Six");
		display(hm);
		TreeMap tm=new TreeMap(hm);
		display(tm);	
	}

	public static void display(Map hmm){
		Set s= hmm.entrySet();
		Iterator it=s.iterator();
		System.out.println("Key \t value");
		while(it.hasNext()){
			Map.Entry m=(Map.Entry)it.next();
			int key=(Integer)m.getKey();
			String value=(String)m.getValue();
			System.out.println(key+"\t"+value);
		}
	}
}