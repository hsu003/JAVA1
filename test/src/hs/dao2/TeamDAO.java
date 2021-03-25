package dao2;

import java.util.List;

import org.springframework.dao.DataAccessException;

import dto2.TeamDTO;

public interface TeamDAO {
	List<TeamDTO> getTeamList () throws DataAccessException;
	TeamDTO getTeam(Integer id) throws DataAccessException;
}
