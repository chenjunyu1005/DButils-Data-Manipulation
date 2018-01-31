package tools;


import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

import org.apache.commons.dbcp.BasicDataSource;

public class JDBCUtils {
	public JDBCUtils(){}
	public static BasicDataSource dataSource = new BasicDataSource();
	private static String driverClass;
	private static String url;
	private static String username;
	private static String password;
	
	
static{
	try {
		ReadConfig();
	     dataSource.setDriverClassName(driverClass);
	     dataSource.setUrl(url);
	     dataSource.setUsername(username);
	     dataSource.setPassword(password);
	     dataSource.setMaxActive(10);
	     dataSource.setMaxIdle(5);
	     dataSource.setMinIdle(5);
	     dataSource.setInitialSize(10);
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();

}
}
private static void ReadConfig() throws IOException{
	InputStream is =JDBCUtils.class.getClassLoader().getResourceAsStream("database.properties");
	
	Properties pro =new Properties();
	pro.load(is);
	driverClass =pro.getProperty("driverClass");
	 url =pro.getProperty("url");
	 username =pro.getProperty("username");
     password =pro.getProperty("password");
	
}
public static BasicDataSource getconect(){
	return dataSource ;
}
public static void close(Connection con , Statement st,ResultSet rs){
	if(con!=null){
		try {
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
		if(st!=null){
			try {
				st.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
			if(rs!=null){
				try {
					rs.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	}


}
}
