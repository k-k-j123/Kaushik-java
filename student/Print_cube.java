//slip16_1
//@functionalInterface
import java.util.Scanner;
interface PrintCubeNumber
{
	public void print(int num1);
}
public class Print_cube
{
	public static void main(String args[])
	{
		PrintCubeNumber p=n->System.out.println("Cube is:"+n*n*n);
		Scanner sc=new Scanner(System.in);
		int no;
		System.out.println("enter any number:");
		no=sc.nextInt();
		p.print(no);
	}
}

