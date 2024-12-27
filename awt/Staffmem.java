import java.util.Scanner;
abstract class staff{
    protected int id;
    protected String name;
    staff(int id,String name){
        this.id=id;
        this.name=name;
    }
}
class OfficeStaff extends staff{
    String dept;

    public OfficeStaff(int id,String name,String dept) {
        super(id, name);
        this.dept=dept;
    }
    
    public String toString(){
        return "id: "+id+" name: "+name+" dept: "+dept;
    }
}
class slip1_2{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of staff:");
        int n=sc.nextInt();
        OfficeStaff os[]=new OfficeStaff[n];
        System.out.println("Enter details of staff");
        for(int i=0;i<n;i++){
            System.out.println("Enter id:");
            int id=sc.nextInt();
            System.out.println("Enter name");
            String s=sc.next();
            System.out.println("Enter dept");
            String d=sc.next();
            os[i]=new OfficeStaff(id,s,d);
        }

        System.out.println("Details of staff are\n");
        for(int i=0;i<n;i++){
            System.out.println(os[i]);
        }
    }
}