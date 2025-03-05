/*
Assigement-3:-set-B
Q)1. Write a menu driven program to perform the following operations on mobile table.
1. Insert        2. Modify      3. Delete       4. Search        5. View All 6. Exit
*/

import java.sql.*;
import java.util.*;

public class SetB1 {
    public static void main(String[] args) {
        Connection con;
        ResultSet rs;
        Statement t;
        PreparedStatement ps;
        Scanner s = new Scanner(System.in);
        try {
            Class.forName("org.postgresql.Driver");

            System.out.println("Driver loaded");

            con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/testdb",
                    "postgres", "123");
            do {
                System.out.println("\n1.Insert\n2.Modify\n3.Delete\n4.Search\n5.View all\n6.Exit");
                System.out.println("Enter the choice");
                int ch = s.nextInt();
                switch (ch) {
                    case 1:
                        System.out.println("Enter Model_Number");
                        int mno = s.nextInt();
                        System.out.println("Enter Model Name");
                        String name = s.next();
                        System.out.println("Enter Model Color");
                        String color = s.next();
                        System.out.println("Enter Sim Type");
                        String sim = s.next();
                        System.out.println("Enter Network Type");
                        String network = s.next();
                        System.out.println("Enter Battery Capacity");
                        String battery = s.next();
                        System.out.println("Enter Internal Storage");
                        String int_storage = s.next();
                        System.out.println("RAM");
                        String ram = s.next();
                        System.out.println("Processor Type");
                        String processor = s.next();
                        ps = con.prepareStatement("insert into mobile values(?,?,?,?,?,?,?,?,?)");
                        ps.setInt(1, mno);
                        ps.setString(2, name);
                        ps.setString(3, color);
                        ps.setString(4, sim);
                        ps.setString(5, network);
                        ps.setString(6, battery);
                        ps.setString(7, int_storage);
                        ps.setString(8, ram);
                        ps.setString(9, processor);
                        ps.executeUpdate();
                        break;
                    case 2:
                        System.out.println("Enter the model no to update record");
                        int no = s.nextInt();
                        System.out.println("Enter Model Name");
                        String name1 = s.next();
                        System.out.println("Enter Model Color");
                        String color1 = s.next();
                        System.out.println("Enter Sim Type");
                        String sim1 = s.next();
                        System.out.println("Enter Network Type");
                        String network1 = s.next();
                        System.out.println("Enter Battery Capacity");
                        String battery1 = s.next();
                        System.out.println("Enter Internal Storage");
                        String int_storage1 = s.next();
                        System.out.println("RAM");
                        String ram1 = s.next();
                        System.out.println("Processor Type");
                        String processor1 = s.next();
                        ps = con.prepareStatement("update mobile set Model_Name=?, Model_Color=?,Sim_Type=?,NetworkType=?,BatteryCapacity=?,InternalStorage=?,RAM=?, ProcessorType=? where Model_Number=?");
                        ps.setInt(9, no);
                        ps.setString(1, name1);
                        ps.setString(2, color1);
                        ps.setString(3, sim1);
                        ps.setString(4, network1);
                        ps.setString(5, battery1);
                        ps.setString(6, int_storage1);
                        ps.setString(7,ram1);
                        ps.setString(8, name1);
                        ps.setString(9, processor1);
                        ps.executeUpdate();
                        break;
                    case 3:
                        System.out.println("Enter the model no to delete record");
                        int mno2 = s.nextInt();
                        t = con.createStatement();
                        t.executeUpdate("delete from mobile where Model_Number=" + mno2);
                        break;

                    case 4:
                        System.out.println("Enter the model no to search record");
                        int mno3 = s.nextInt();
                        t = con.createStatement();
                        rs = t.executeQuery("select * from mobile where Model_Number=" + mno3);

                        System.out.println(
                                "Model Number	Model Name 	Model Color		Sim Type	Network Type		Battery Capacity	Internal Storage		RAM	Processor Type");
                        while (rs.next()) {
                            System.out.println(rs.getInt(1) + "\t" + rs.getString(2) + "\t" + rs.getString(3) + "\t"
                                    + rs.getString(4) + "\t" + rs.getString(5) + "\t" + rs.getString(6) + "\t"
                                    + rs.getString(7) + "\t" + rs.getString(8) + "\t" + rs.getString(9));

                        }
                        break;
                    case 5:
                        t = con.createStatement();
                        rs = t.executeQuery("select * from mobile");

                        System.out.println(
                                "Model Number	Model Name 	Model Color		Sim Type	Network Type		Battery Capacity	Internal Storage		RAM	Processor Type");
                        while (rs.next()) {
                            System.out.println(rs.getInt(1) + "\t" + rs.getString(2) + "\t" + rs.getString(3) + "\t"
                                    + rs.getString(4) + "\t" + rs.getString(5) + "\t" + rs.getString(6) + "\t"
                                    + rs.getString(7) + "\t" + rs.getString(8) + "\t" + rs.getString(9));
                        }
                        break;
                    case 6:
                        System.exit(0);
                        break;
                }
            } while (true);
        } catch (Exception e) {
            System.out.println(e);
        }
        s.close();
    }
}
