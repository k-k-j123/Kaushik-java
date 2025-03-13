import java.sql.*;
import java.util.*;
class jdbc_slip7{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		try{
			Class.forName("org.postgresql.Driver");
			Connection con=DriverManager.getConnection("jdbc:postgresql://localhost/testdb","postgres","123");
			System.out.println("Enter how many records you want to insert");
			int n=sc.nextInt();
			for(int i=0;i<n;i++){
				System.out.println("Enter the product "+(i+1)+" details");
				System.out.println("Enter Product id");
				int pno=sc.nextInt();
				System.out.println("Enter Product name");
				String name=sc.next();
				System.out.println("Enter Product price");
				int pr=sc.nextInt();
				PreparedStatement ps=con.prepareStatement("insert into product values(?,?,?)");
				ps.setInt(1,pno);
				ps.setString(2,name);
				ps.setInt(3,pr);
				ps.executeUpdate();
			}
			Statement t=con.createStatement();
			ResultSet rs=t.executeQuery("select * from product");
			System.out.println("Product number\tProduct Name\tProduct Price");
			while(rs.next()){
				System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getInt(3));
			}
		}catch(Exception e){
			System.out.println(e);
		}
	}
}
