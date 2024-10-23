import java.util.Scanner;
interface productdetail{}
public class Product implements productdetail{
	static int cnt;
	int pid,qty;
	String pname;
	double pcost;
	public Product(int pid,String pname,double pcost,int qty){
		cnt++;
		this.pid=pid;
		this.pname=pname;
		this.pcost=pcost;
		this.qty=qty;
	}
	public Product(){
		cnt++;
		this.pid=0;
		this.pname="";
		this.pcost=0;
		this.qty=0;
	}
	public String toString(){
		return pid+"\t"+pname+"\t"+pcost+"\t"+qty;
	}
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter total no of product");
		int n=sc.nextInt();
		Product[] p=new Product[n];
		for(int i=0;i<n;i++){
			System.out.println("\nenter product id");
			int id=sc.nextInt();
			System.out.println("enter product name");
			String na=sc.next();
			System.out.println("enter product cost");
			double c=sc.nextDouble();
			System.out.println("Enter quantity");
			int q=sc.nextInt();

			p[i]=new Product(id,na,c,q);
		}
		System.out.println("product details are");
		for(int i=0;i<n;i++){
			System.out.println(p[i]);
		}
	}
}

