package day07;
import java.sql.*;
public class Exam_02 {

	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");//오라클 찾는 경로
			System.out.println("드라이버 검색 성공!!");
		}catch(ClassNotFoundException e) {
			System.out.println("드라이버 검색 실패!!");
		}
		Connection con = null;
		try {
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "javaweb";
			String pass = "javaweb";
			con = DriverManager.getConnection(url,user,pass);
			//주소, 아이디, 패스워드 순으로 입력
			System.out.println("오라클 연결 성공!!");
		}catch(SQLException e) {
			System.out.println("오라클 연결 실패!!");
		}
		PreparedStatement ps;
		try {
			String sql = "insert into test values(?,?)";
			ps = con.prepareStatement(sql);
			ps.setString(1, "홍길동");
			ps.setString(2, "123-1234");
			int res = ps.executeUpdate(); //오라클이 자바에게 반환 해주는 값.
			if(res>0) {
				System.out.println("홍길동을 입력하였습니다.");
			}else {
				System.out.println("홍길동 입력 실패!!");
			}
			//insert, delete, updated를 실행 -> 실행된 행의 수가 반환
			//executeUpdate() 메소드를 사용하고, 결과는 int 형으로 받는다.
			//select를 실행 -> 결과반환
			//executQuery() 메소드를 사용하고, 결과는 ResultSet으로 받는다.
		}catch(SQLException e) {
			System.err.println("홍길동 입력 도중 오류 발생!!");
			e.printStackTrace();
		}
		
	}

}
