package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class checkcode {
	public int check(String userName, String password) {
		int ret=3;
		try{
			Connection con;
			PreparedStatement pst;
			ResultSet rs;
			//��������
			Class.forName("com.mysql.jdbc.Driver");
			//��������
			con=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/excise", "root", "420683");
			//�������
			String sql="select * from t_user where user_name=?";
			pst=con.prepareStatement(sql);
			//ִ�����
			pst.setString(1, userName);
			rs=pst.executeQuery();
			
			//�������
			if(rs.next()){
				String savePassword =rs.getString("password");
				if(savePassword.equals(password)){
					ret=3;
				}
				else{
					ret=2;
				}
			}
			else{
				ret=1;
			}
			//�ͷ���Դ
			con.close();
			pst.close();
			rs.close();
			
		}
		
		catch(Exception e){
			e.printStackTrace();
		}
		return ret;
		
	}

}
