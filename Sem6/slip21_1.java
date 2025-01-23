import java.util.*;
import java.io.*;
class slip12_1{
	public static void main(String args[]) throws IOException{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter how many elemnts you want to enter:");
		int n=s.nextInt();
		LinkedList l=new LinkedList();
		System.out.println("Enter subject names");
		for(int i=0;i<n;i++){
			l.add(s.next());
		}
		System.out.println("Subject list is:");
		Iterator i=l.iterator();
		while(i.hasNext()){
			System.out.println(i.next());
			}
	}
}

