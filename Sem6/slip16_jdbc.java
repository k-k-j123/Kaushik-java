import java.sql.*;
import java.util,*;
class slip16_jdbc{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		try{
			Class.forName("org.postgresql.Driver");
			Connection con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/testdb","postgres","123");
			System.out.println("Enter how many records you want to insert");
			int n=sc.nextInt();
			for(int i=0;i<n;i++){
				System.out.println("Enter the teacher "+(i+1)+" details");
				System.out.println("Enter teacher id");
				int tno=sc.nextInt();
				System.out.println("Enter teacher name");
				String name=sc.next();
				System.out.println("Enter teacher subject");
				String subject=sc.next();
				PreparedStatement ps=con.prepareStatement("insert into teacher values (?,?,?)");
				ps.setInt(1,tno);
				ps.setString(2,name);
				ps.setString(3,subject);
				ps.executeUpdate();
			}
			Statement t=con.createStatement();
			ResultSet rs=t.executeUpdate("select * from teacher where subject='java'");
			while(rs.next()){
				System.out.println("Teacher Number:"+rs.getInt(1)+"Teacher Name:"+rs.getString(2)"Subject:"+rs.getString(3));
			}
		}catch(Exception e){System.out.println(e);}
	}
}

