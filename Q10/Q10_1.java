import java.sql.*;

public class Q10_1
{
    public static void main(String[] args)
    {
        try
        {
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver"); // Load the JDBC driver
            Connection con = DriverManager.getConnection("jdbc:ucanaccess://C:/Users/AAA/IdeaProjects/work/src/db2.mdb");//Connect to the databse
            System.out.println("資料庫連線測試成功！");
            Statement stmt=con.createStatement();
            int cnt=stmt.executeUpdate("insert into students values('94610060','新同學','M','彰化')");

            ResultSet rs=stmt.executeQuery("select * from students where stud_addr='彰化' and stud_sex='M'");
            while(rs.next())
            {
                String stud_no=rs.getString(1);
                String stud_name=rs.getString(2);
                String stud_sex=rs.getString("stud_sex");
                String stud_addr=rs.getString("stud_addr");
                System.out.println(stud_no+","+stud_name+","+stud_sex+","+stud_addr);
            }
        }
        catch(ClassNotFoundException e)
        {
            System.out.println("找不到驅動程式類別");
            e.printStackTrace();
        }
        catch(SQLException e)
        {
            e.printStackTrace();
        }
    }
}