package dao.impl2;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;

import javax.sql.DataSource;

import org.springframework.jdbc.core.SqlParameter;
import org.springframework.jdbc.object.MappingSqlQuery;

import dto2.MemberDTO;
import dto2.TeamDTO;

public class UpdateMember extends MappingSqlQuery<MemberDTO> {

	static String sql = "update spring_team.team_id from spring_member, spring_team where "
			+"spring_member.team_id = spring_team.team_id "
			+ "and spring_team.team_id = ?";
	
	public UpdateMember(DataSource dataSource){
		super(dataSource, sql);
		super.declareParameter(new SqlParameter("team_id", Types.INTEGER));
		compile();
	}
	
	@Override
	protected MemberDTO mapRow(ResultSet rs, int arg1) throws SQLException {
		//member_id, memberName, team_id, teamName
		MemberDTO dto = new MemberDTO();
		dto.setId(rs.getInt("member_id"));
		dto.setName(rs.getString("member_name"));
		TeamDTO team = new TeamDTO();
		team.setId(rs.getInt("team_id"));
		team.setName(rs.getString("team_name"));
		dto.setTeam(team);
		return dto;
	}

}
