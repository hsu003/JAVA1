package day07;
import java.sql.*;
public class Exam_03 {

	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("드라이버 검색 성공!!");
		}catch(ClassNotFoundException e) {
			System.out.println("드라이버 검색 실패!!");
		}
		Connection con = null;
		try {
			String url = "jdbc:oracle:thin:@localhost:1521:xe";//아이피 주소 넣기.
			String user = "javaweb";
			String pass = "javaweb";
			con = DriverManager.getConnection(url,user,pass);
			System.out.println("오라클 연결 성공!!");
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
