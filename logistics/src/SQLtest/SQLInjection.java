package SQLtest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SQLInjection {
	 public static void main(String[] args) throws SQLException {
	 
	        login();//SQL�ᱻƴ�� or
	    }

	public static void login() {
		try {
			Connection con;
			ResultSet rs;
			// ��������
			Class.forName("com.mysql.jdbc.Driver");
			// ��������
			con = DriverManager.getConnection(
					"jdbc:mysql://127.0.0.1:3306/excise", "root", "962464pjn");
			Statement statement = con.createStatement();
			String sql="select * from t_user where user_name='"+"'or' 1=1"+"' and password='"+"'or' 1=1"+"'";
			rs=statement.executeQuery(sql);
            while (rs.next()){
                System.out.println(rs.getString("user_name")+"\t "+rs.getString("password"));
            }
          //�ͷ���Դ
			con.close();
			rs.close();

		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
