import java.io.*;
abstract class order
{
	protected int id;
	protected String desc;
	order(int i,String d)
	{
		id=i;
		desc=d;
	}
	public void display()
	{
		System.out.println("Id:"+id+" Description:"+desc);
	}
}
class Purchase_order extends order
{
	String c_name,v_name;
	Purchase_order(int id,String desc,String c,String v)
	{
		super(id,desc);
		c_name=c;
		v_name=v;
	}
	public void display(){
		super.display();
		System.out.println("Customer name:"+c_name+" Vendor_name:"+v_name);
	}
}
class Sales_Order extends order
{
	String c_name,v_name;
	Sales_Order(int id,String desc,String c,String v){
		super(id,desc);
		c_name=c;
		v_name=v;
	}
	public void display(){
		super.display();
		System.out.println("Customer name:"+c_name+" Vendor name:"+v_name);
	}
}
class ass3setB_1{
	public static void main(String args[])throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		Purchase_order[] po=new Purchase_order[3];
		Sales_Order[] so=new Sales_Order[3];
		System.out.println("\nEnter Purchase Order Details");
		for(int i=0;i<3;i++){
			System.out.println("enter id");
			int id=Integer.parseInt(br.readLine());
			System.out.println("enter customer_name:");
			String c=br.readLine();
			System.out.println("enter vendor name:");
			String v=br.readLine();
			System.out.println("enter description:");
			String d=br.readLine();

			po[i]=new Purchase_order(id,d,c,v);
		}
		System.out.println("enter sales order details");
		for(int i=0;i<3;i++){
			System.out.println("enter id");
			int id=Integer.parseInt(br.readLine());
			System.out.println("enter customer_name:");
			String c=br.readLine();
			System.out.println("enter vendor name:");
			String v=br.readLine();
			System.out.println("enter description:");
			String d=br.readLine();

			so[i]=new Sales_Order(id,d,c,v);
		}
		System.out.println("\nPurchse Order details are\n");
		for(int i=0;i<3;i++){
			po[i].display();
		}
		System.out.println("\nSales order details are\n");
		for(int i=0;i<3;i++){
			so[i].display();
		}
	}	
}
