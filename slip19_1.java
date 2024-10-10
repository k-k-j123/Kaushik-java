import java.util.*;
public class slip19_1{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of matrix");
		int r=sc.nextInt();
		int c=sc.nextInt();
		int[][] m=new int[r][c];
		int sum=0;
		System.out.println("Enter matrix elements");
		for(int i=0;i<r;i++)
			for(int j=0;j<c;j++)
			{
				m[i][j]=sc.nextInt();
				if(i==j){
					sum+=m[i][j];
				}
			}
		System.out.println("the sum of diagoal elements of the matrix is :"+sum);
	}
}

