package day07;
import java.sql.*;
public class Exam_02 {

	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");//����Ŭ ã�� ���
			System.out.println("����̹� �˻� ����!!");
		}catch(ClassNotFoundException e) {
			System.out.println("����̹� �˻� ����!!");
		}
		Connection con = null;
		try {
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "javaweb";
			String pass = "javaweb";
			con = DriverManager.getConnection(url,user,pass);
			//�ּ�, ���̵�, �н����� ������ �Է�
			System.out.println("����Ŭ ���� ����!!");
		}catch(SQLException e) {
			System.out.println("����Ŭ ���� ����!!");
		}
		PreparedStatement ps;
		try {
			String sql = "insert into test values(?,?)";
			ps = con.prepareStatement(sql);
			ps.setString(1, "ȫ�浿");
			ps.setString(2, "123-1234");
			int res = ps.executeUpdate(); //����Ŭ�� �ڹٿ��� ��ȯ ���ִ� ��.
			if(res>0) {
				System.out.println("ȫ�浿�� �Է��Ͽ����ϴ�.");
			}else {
				System.out.println("ȫ�浿 �Է� ����!!");
			}
			//insert, delete, updated�� ���� -> ����� ���� ���� ��ȯ
			//executeUpdate() �޼ҵ带 ����ϰ�, ����� int ������ �޴´�.
			//select�� ���� -> �����ȯ
			//executQuery() �޼ҵ带 ����ϰ�, ����� ResultSet���� �޴´�.
		}catch(SQLException e) {
			System.err.println("ȫ�浿 �Է� ���� ���� �߻�!!");
			e.printStackTrace();
		}
		
	}

}
