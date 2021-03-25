package dao.impl2;

import java.sql.Types;

import javax.sql.DataSource;

import org.springframework.jdbc.core.SqlParameter;
import org.springframework.jdbc.object.SqlUpdate;

public class DeleteMember extends SqlUpdate {
	static String sql = "delete from spring_member where member_id = ?";
	public DeleteMember(DataSource dataSource){
		super(dataSource,sql);
		
		super.declareParameter(new SqlParameter("member_id", Types.INTEGER));
		compile();
	}
}
