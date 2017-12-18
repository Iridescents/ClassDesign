import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MainTest 
{
	public static void main(String[] args) throws SQLException //throws ClassNotFoundException, SQLException{
	{
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			@SuppressWarnings("unused")
			Connection Con = DriverManager.getConnection("jdbc:mysql://loaclhost:3306/homework","root","123");
		}
		catch(ClassNotFoundException e)
		{
			e.printStackTrace();
		}
	}
}
