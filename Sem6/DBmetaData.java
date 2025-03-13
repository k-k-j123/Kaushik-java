import java.sql.*;
import java.io.*;
class DBmetaData{
	public static void main(String args[]){
		try{
			Class.forName("org.postgresql.Driver");
			Connection con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/testdb","postgres","123");
			DatabaseMetaData md=con.getMetaData();
			System.out.println("Database MetaData info");
			System.out.println("Product name:"+md.getDatabaseProductName());
			System.out.println("Driver Version name:"+md.getDriverVersion());
			System.out.println("Product Version No:"+md.getDatabaseProductVersion());
			System.out.println("Driver name:"+md.getDriverName());
			System.out.println("Driver minor version:"+md.getDriverMinorVersion());
			System.out.println("username:"+md.getUserName());
			ResultSet rs=md.getColumns(null,null,"Student",null);
			while(rs.next()){
				String name=rs.getString("COLUMN_NAME");
				String type=rs.getString("TYPE_NAME");
				int size=rs.getInt("COLUMN_SIZE");
				System.out.println("Column name:["+name+"]; type:["+type+"]; size:["+size+"]");
				ResultSet rs1=md.getTables(null,null,null,new String[]{"TABLE"});
				while(rs1.next()){
					String tname=rs1.getString("TABLE_NAME");
					System.out.println("Table"+tname);
				}
			}
		}
		catch(Exception e){}
	}
}
