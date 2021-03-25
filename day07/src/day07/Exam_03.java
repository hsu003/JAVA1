package day07;
import java.sql.*;
public class Exam_03 {

	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("����̹� �˻� ����!!");
		}catch(ClassNotFoundException e) {
			System.out.println("����̹� �˻� ����!!");
		}
		Connection con = null;
		try {
			String url = "jdbc:oracle:thin:@localhost:1521:xe";//������ �ּ� �ֱ�.
			String user = "javaweb";
			String pass = "javaweb";
			con = DriverManager.getConnection(url,user,pass);
			System.out.println("����Ŭ ���� ����!!");
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
		PreparedStatement ps = null;
		try {
			String sql = "select * from test";
			ps=con.prepareStatement(sql);
			ResultSet rs =ps.executeQuery();
			while(rs.next()) { //Iterator hasNext(),next()
				String name = rs.getString("name");
				String tel = rs.getString(2);
				System.out.println(name + "\t\t" + tel);
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}

}
