import java.util.Scanner;
import java.util.Arrays;
class sortCity{
	public static void main(String args[]){
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter number of cities");
		int n=sc.nextInt();
		String[] cities=new String[n];
		for(int i=0;i<n;i++){
			System.out.print("Enter city: ");
			cities[i]=sc.next();
		}
		Arrays.sort(cities);
		System.out.println("Sorted citites");
		for(int i=0;i<n;i++){
			System.out.println(cities[i]);
		}
		sc.close();
	}
}
