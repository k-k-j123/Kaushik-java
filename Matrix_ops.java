import java.util.*;
public class Matrix_ops{
	public static int[][] Addition(int a[][],int b[][]){
		int c[][]=new int[3][3];
		for(int i=0;i<a.length;i++){
			for(int j=0;j<b.length;j++){
				c[i][j]=a[i][j]+b[i][j];
			}
		}
		return c;
	}
	public static int[][] Substraction(int a[][],int b[][]){
		int c[][]=new int[3][3];
		for(int i=0;i<a.length;i++){
			for(int j=0;j<b.length;j++){
				c[i][j]=a[i][j]-b[i][j];
			}
		}
		return c;
	}
	public static int[][] Multiplication(int a[][],int b[][]){
		int c[][]=new int[3][3];
		for(int i=0;i<a.length;i++){
			for(int j=0;j<b[0].length;j++){
				c[i][j]=0;
				for(int k=0;k<a[0].length;k++){
					c[i][j]+=a[i][k]*b[k][j];
				}
			}
		}
		return c;
	}
	public static int[][] Transpose(int a[][]){
		int c[][]=new int[3][3];
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a.length;j++){
				c[i][j]=a[j][i];
			}
		}
		return c;
	}
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int a[][]={{5,6,7},{8,9,10},{3,1,2}};
		int b[][]={{1,2,3},{4,5,6},{7,8,9}};
		int c[][]=new int[3][3];
		System.out.println("A= "+Arrays.deepToString(a));
		System.out.println("B= "+Arrays.deepToString(b));
		int choice;
		do{
			System.out.println("\nChoose matrix operation");
			System.out.println("---------------------------");
			System.out.println("1. Addition");
			System.out.println("2. Substraction");
			System.out.println("3. Multiplication");
			System.out.println("4. Transpose");
			System.out.println("5. Exit");
			System.out.println("Enter your choice");
			choice=sc.nextInt();
			switch(choice){
				case 1:
				c=Addition(a,b);
				System.out.println("Sum of matrix:");
				System.out.println(Arrays.deepToString(c));
				break;
				case 2:
				c=Substraction(a,b);
				System.out.println("Substraction of matrix:");
				System.out.println(Arrays.deepToString(c));
				break;
				case 3:
				c=Multiplication(a,b);
				System.out.println("Multiplication of matrix:");
				System.out.println(Arrays.deepToString(c));
				break;
				case 4:
				c=Transpose(a);
				System.out.println("Transpose of 1st matrix:");
				System.out.println(Arrays.deepToString(c));
				c=Transpose(b);
				System.out.println("Transpose of 2nd matrix:");
				System.out.println(Arrays.deepToString(c));
				break;
			}

		}while(choice!=5);
	}
}