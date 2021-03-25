package view2;

import java.util.List;

import dao.impl2.TeamDAOImpl;
import dto2.TeamDTO;

public class SelectTeamView extends AbsView {
	
	TeamDAOImpl teamDAO;
	
	public void setTeamDAO(TeamDAOImpl teamDAO) {
		this.teamDAO = teamDAO;
	}

	@Override
	public void show() {
		showTeamList(teamDAO.getTeamList());
		msg("EnterÅ°¸¦ ´©¸£¼¼¿ä");
		getEnter();
	}

	protected void showTeamList(List<TeamDTO> teamList){
		System.out.println("********************");
		System.out.println(">>>> ÆÀ °ü¸®");
		System.out.println("================");
		System.out.println("ÆÀID\t\t\tÆÀ¸í");
		System.out.println("----------------------------");
		for(TeamDTO dto : teamList){
			System.out.println(dto.getId()+"\t\t\t"+dto.getName());
		}
	}
}
