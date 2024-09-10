import java.util.ArrayList;
import java.util.Scanner;
class PairSum{
	public static void ps(ArrayList<Integer> arr, int target) {
		int i = 0;
		int j = arr.size() - 1;
		boolean pairFound = false; 
		while (i < j) {
			int a = arr.get(i);
			int b = arr.get(j);
			if (a + b == target) {
				System.out.println("[" + a + "," + b + "]");
				pairFound = true; 
				i++;
				j--;
			} else if (a + b < target) {
				i++;
			} else {
				j--;
			}
		}
		if (!pairFound) { // If no pair is found, print "No result"
			System.out.println("No result");
		}
	}
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		ArrayList<Integer> arr=new ArrayList<>();
		for(int i=0;i<args.length;i++){
			arr.add(Integer.parseInt(args[i]));
		}
		System.out.println(arr);
		int key;
		System.out.println("enter target");
		key=sc.nextInt();
		ps(arr,key);
		sc.close();
	}
}




