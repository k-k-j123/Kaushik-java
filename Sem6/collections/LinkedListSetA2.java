import java.util.*;
class LinkedListSetA2{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter how many name you want to enter");
		int n=sc.nextInt();
		LinkedList l1=new LinkedList();
		for(int i=0;i<n;i++){
			System.out.println("Enter name");
			l1.add(sc.next());
		}
		System.out.println("Original contents of l1 "+l1);
	}
}

