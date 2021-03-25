package dao.impl2;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.simple.SimpleJdbcTemplate;

import dao2.MemberDAO;
import dto2.MemberDTO;

@SuppressWarnings("unused")
public class MemberDAOImpl extends SimpleJdbcTemplate implements MemberDAO {
	InsertMember insertMember;
	DeleteMember deleteMember;
	MembersQuery membersQuery;
	MemberQuery memberQuery;
	UpdateMember updateMember;
	
	public MemberDAOImpl(DataSource dataSource) {
		
		super(dataSource);
		insertMember = new InsertMember(dataSource);
		deleteMember = new DeleteMember(dataSource);
		membersQuery = new MembersQuery(dataSource);
		memberQuery = new MemberQuery(dataSource);
		updateMember = new UpdateMember(dataSource);
	}

	@Override
	public void insertMember(MemberDTO member) throws DataAccessException {
		
		/*String sql = "insert into spring_member values"
												+ "(seq_member_id.nextval, ?, ?)";
		Object[] values = new Object[]
				{member.getName(), member.getTeam().getId()};
		int res = this.update(sql, values);*/
		
		insertMember.update(new Object[]
							{member.getName(), member.getTeam().getId()});
	}

	@Override
	public void deleteMember(MemberDTO member) throws DataAccessException {
		
		
		int res = deleteMember.update(new Object[]{member.getId()});
		
		//this.update("delete from spring_member where member_id=?", 
		//											member.getId());
	}

	@Override
	public void updateMember(MemberDTO member) throws DataAccessException {
		MemberDTO dto = updateMember.findObject(member);
		

	}

	@Override
	public MemberDTO getMember(Integer id) throws DataAccessException {
		
		MemberDTO dto = memberQuery.findObject(id);
		return dto;
	}

	@Override
	public List<MemberDTO> getMembers(Integer team_id) throws DataAccessException {
		
		List<MemberDTO> list = membersQuery.execute(team_id);
		return list;
		
		/*String sql = "select member_id, member.name as memberName, "
			+"spring_team.team_id, sprint_team.name as teamName "
			+"from spring_member, spring_team where "
			+"spring_member.team_id = spring_team.team_id "
			+ "and team.team_id = ?";
			
		Object[] values = new Object[]{team_id};
		
		RowMapper<MemberDTO> mapper = new RowMapper<MemberDTO>(){

			@Override
			public MemberDTO mapRow(ResultSet rs, int arg1) throws SQLException {
			
				MemberDTO dto = new MemberDTO();
				dto.setId(rs.getInt("member_id"));
				dto.setName(rs.getString("name"));
				TeamDTO team = new TeamDTO();
				team.setId(rs.getInt("team_id"));
				team.setName(rs.getString("teamName"));
				dto.setTeam(team);
				return dto;
			}
		};
		
		List<MemberDTO> list = this.query(sql, mapper, values);
		
		return list;*/
	}

}














