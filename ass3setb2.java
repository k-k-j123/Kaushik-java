import java.util.Scanner;
interface ProductInterface{
}
class Product implements ProductInterface{
    static int objectCount=0;
    int pid;
    String pname;
    int cost;
    int qty;

    public Product(){
        this.pid=0;
        this.pname="";
        this.cost=0;
        this.qty=0;
        objectCount++;
    }
    public Product(int pid,String pname,int cost,int qty){
        this.pid=pid;
        this.pname=pname;
        this.cost=cost;
        this.qty=qty;
        objectCount++;
    }
    public static void p(String s){
        System.out.println(s);
    }
    public void display(){
        p("Product Id:"+pid);
        p("Product name:"+pname);
        p("Product cost:"+cost);
        p("Product qty:"+qty);
        p("=================");
    }
}

public class ass3setb2 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        Product.p("enter number of objects");
        int n=sc.nextInt();
        Product p[]=new Product[n];
        System.out.println("enter product details");
        for(int i=0;i<n;i++){
            System.out.println("enter pid:");
            int pid=sc.nextInt();
            System.out.println("enter product name:");
            String pname=sc.next();
            System.out.println("enter product cost:");
            int cost=sc.nextInt();
            System.out.println("Enter product quantity:");
            int qty=sc.nextInt();
            
            p[i]=new Product(pid,pname,cost,qty);
        }
        System.out.println("Number of Objects:"+Product.objectCount);
        System.out.println("\nProduct details are:\n=================");
        for(int i=0;i<n;i++){
            p[i].display();
        }
    }
}
