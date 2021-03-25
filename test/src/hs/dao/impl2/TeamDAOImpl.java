package dao.impl2;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.simple.SimpleJdbcTemplate;

import dao2.TeamDAO;
import dto2.TeamDTO;

public class TeamDAOImpl extends SimpleJdbcTemplate implements TeamDAO {

	public TeamDAOImpl(DataSource dataSource) {
		super(dataSource);

	}

	@Override
	public List<TeamDTO> getTeamList() throws DataAccessException {
		String sql = "select * from spring_tram";
		RowMapper<TeamDTO> mapper = new RowMapper<TeamDTO>() {

			@Override
			public TeamDTO mapRow(ResultSet rs, int arg1) throws SQLException {
				TeamDTO dto = new TeamDTO();
				dto.setId(rs.getInt("team_id"));
				dto.setName(rs.getString("name"));
				return dto;
			}

		};
		List<TeamDTO> teamList = this.query(sql, mapper);
		return teamList;
	}

	@Override
	public TeamDTO getTeam(Integer id) throws DataAccessException {
		String sql = "select * from spring_team where team_id = ?";

		RowMapper<TeamDTO> mapper = new RowMapper<TeamDTO>() {

			@Override
			public TeamDTO mapRow(ResultSet rs, int arg1) throws SQLException {
				TeamDTO dto = new TeamDTO();
				dto.setId(rs.getInt("team_id"));
				dto.setName(rs.getString("name"));
				return dto;
			}

		};
		Object[] values = new Object[] { id };
		TeamDTO dto = this.queryForObject(sql, mapper, values);// .커리를 던져주면오브젝트로 반환 해주는 메소드
		return dto;
	}

}
