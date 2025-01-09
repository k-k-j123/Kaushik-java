import java.util.*;
import java.io.*;
class Slip19_1{
	public static void main(String args[]){
		Scanner s=new Scanner(System.in);
		System.out.println("Enter how mnay numbers you want to enter:");
		int n=s.nextInt();
		LinkedList l=new LinkedList();
		for(int i=0;i<n;i++){
			System.out.println("Enter a number:");
			l.add(s.nextInt());
		}
		System.out.println("Elements of linked list are:"+l);
		System.out.println("Negative number are:");
		Iterator i=l.iterator();
		while(i.hasNext()){
			int no=((Integer)i.next()).intValue();
			if(no<0)
				System.out.println(no);
		}
	}
}
