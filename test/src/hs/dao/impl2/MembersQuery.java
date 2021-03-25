package dao.impl2;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;

import javax.sql.DataSource;

import org.springframework.jdbc.core.SqlParameter;
import org.springframework.jdbc.object.MappingSqlQuery;

import dto2.MemberDTO;
import dto2.TeamDTO;

public class MembersQuery extends MappingSqlQuery<MemberDTO> {

	static String sql = "select member_id, spring_member.name as memberName, "
			+"spring_team.team_id, spring_team.name as teamName "
			+"from spring_member, spring_team where "
			+"spring_member.team_id = spring_team.team_id "
			+ "and spring_team.team_id = ?";
	
	public MembersQuery(DataSource dataSource){
		super(dataSource, sql);
		super.declareParameter(new SqlParameter("team_id", Types.INTEGER));
		compile();
	}
	
	@Override
	protected MemberDTO mapRow(ResultSet rs, int arg1) throws SQLException {
		//member_id, memberName, team_id, teamName
		MemberDTO dto = new MemberDTO();
		dto.setId(rs.getInt("member_id"));
		dto.setName(rs.getString("memberName"));
		TeamDTO team = new TeamDTO();
		team.setId(rs.getInt("team_id"));
		team.setName(rs.getString("teamName"));
		dto.setTeam(team);
		return dto;
	}

}
