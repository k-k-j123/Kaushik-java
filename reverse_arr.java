import java.util.*;
class reverse_arr{
	public static void main(String[] args){
		int n,res,temp,i,j=0;
		Scanner s=new Scanner(System.in);
		System.out.print("enter the number of elements in the array");
		n=s.nextInt();
		int array[]=new int[n];
		// int rev[]=new int[n];
		System.out.println("Enter "+n+" elements");
		for(i=0;i<n;i++){
				array[i]=s.nextInt();
			}
		// System.out.println("Reverse of array is:");
		// for(i=n;i>0;i--,j++){
		// 	rev[j]=array[i-1];
		// 	System.out.println(rev[j]);}			
		i=0;j=n-1;
		while(i<j){
			temp=array[i];
			array[i]=array[j];
			array[j]=temp;
			j--;
			i++;
		}
		System.out.println("Reversed array is");
		for(int value:array){
			System.out.println(value);
		}
	}
}
