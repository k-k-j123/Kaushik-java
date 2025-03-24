import java.util.*;
class slip6_1 {
    public static void main(String args[]){
        TreeSet<Integer> ts=new TreeSet<>();
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter number of numbers");
        int n=sc.nextInt();
        sc.nextLine();
        for(int i=0;i<n;i++){
            System.out.println("Enter number");
            int num=sc.nextInt();
            sc.nextLine();
            ts.add(num);
        }
        System.out.println(ts);
        sc.close();
    }
}
