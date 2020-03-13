package snippet;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;

import com.mysql.cj.jdbc.result.ResultSetMetaData;

public class Jdbc {
	
	//208.77.7.255
	//"jdbc:mysql://"+dbIp+":3306/"+strDB+"","root","bala3913"
	//"jdbc:mysql://localhost:3306/company","root","bala3913"
	//"jdbc:mysql://192.168.1.51:3306/location","wsadmin","worksmart"
//	public String UserName="root";
//	public String Password="bala3913";

	public String UserName="wsadmin";
	public String Password="worksmart";
	
	
	public Connection DBConnection(String dbIp,String strDB) throws Exception{
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String strDburl="jdbc:mysql://"+dbIp+":3306/"+strDB;
			System.out.println(strDburl);
			Connection con=DriverManager.getConnection("jdbc:mysql://10.30.48.134:3306/livepbx",UserName,Password);  
					System.out.println("Connection Succes....");  
					return con;
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return null; 
	}
	
	public ResultSet resultSet(Connection  con) throws Exception{
	
		try {
			Statement stmt=con.createStatement();  
			ResultSet rs=stmt.executeQuery("select * from location");
			return rs;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		return null;
	}
	

	public static void main(String[] args) {
		
		//"jdbc:mysql://localhost:3306/company","root","bala3913"
		try{  
			Jdbc jd=new Jdbc();
			ResultSet rs=jd.resultSet(jd.DBConnection("192.168.1.51", "location"));
			
			
			int ColoumCount=rs.getMetaData().getColumnCount();
//			while(rs.next())
			HashMap<String, HashMap<String,Integer>> ColumnData=new HashMap<String,HashMap<String,Integer>>();
				for(int i=1;i<ColoumCount;i++){
					String strColumnName=rs.getMetaData().getColumnName(i);
					String strDatatype=rs.getMetaData().getColumnTypeName(i);
					int ColumZize=rs.getMetaData().getColumnDisplaySize(i);
					HashMap<String , Integer> columtypes=new HashMap<String,Integer>();
					columtypes.put(strDatatype, ColumZize);
					ColumnData.put(strColumnName, columtypes);
				}
				System.out.println("----------->\n"+ColumnData);
//			System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));
//				System.out.println(rs.getInt(1));
//			con.close();  
			}catch(Exception e){ 
				System.out.println(e);
				}  
			}  

	}

