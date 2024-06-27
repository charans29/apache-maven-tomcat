package helloworldserver ;
import java.sql.* ;
import javax.servlet.* ;
import javax.servlet.http.* ;

public class StartupServlet
    extends HttpServlet
{
	public void init()
			throws ServletException
	{
		try
		{
			Class.forName("org.postgresql.Driver") ;
			try
			(
				Connection connection = DriverManager.getConnection ("jdbc:postgresql://localhost/DB1","Test","maven") ;
			)
			{
				System.out.println("()()()()() Done connection to DB1! [][][][][][]") ;
			}
		}
		catch (Exception exception)
		{
			exception.printStackTrace() ;
			System.out.println("Not Done yyyyyy....!") ;
		}
	}
}
