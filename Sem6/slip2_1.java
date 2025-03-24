import java.util.*;
class slip2_1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of friends: ");
        int n=sc.nextInt();
        sc.nextLine(); // consume leftover newline
        TreeSet<String> ts=new TreeSet<>();
        for(int i=0;i<n;i++){
            System.out.print("Enter the name: ");
            String name=sc.nextLine();
            ts.add(name);
        }
        System.out.println(ts);
        sc.close();
    }
}
