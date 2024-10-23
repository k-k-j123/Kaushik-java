interface PrintNumber{
	public void print(int num1);
}
public class Print_square{
	public static void main(String args[]){
		PrintNumber p=n->System.out.println("Square is:"+n*n);
		p.print(25);
	}
}
