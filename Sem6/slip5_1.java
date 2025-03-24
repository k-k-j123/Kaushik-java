import java.util.*;
import java.util.Map.Entry;
class slip5_1 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        Hashtable<String,Long> ht=new Hashtable<>();

        System.out.println("enter number of records");
        int n=sc.nextInt();
        sc.nextLine();
        for(int i=0;i<n;i++){
            System.out.println("Enter name:");
            String s=sc.nextLine();
            System.out.println("enter number:");
            Long num=sc.nextLong();
            sc.nextLine();
            ht.put(s,num);
        }

        Set s1=ht.entrySet();
        Iterator it=s1.iterator();
        while(it.hasNext()){
            Map.Entry me=(Entry) it.next();
            System.out.println("Name:"+me.getKey()+" "+"Number:"+me.getValue());
        }
        sc.close();
    }
}
