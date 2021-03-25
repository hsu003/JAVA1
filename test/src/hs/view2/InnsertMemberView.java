package view2;

import dao.impl.TeamDAOImpl;
import dto.MemberDTO;
import view.AbsView;
import view.Utils;

public class InnsertMemberView extends AbsView {
	
	private TeamDAOImpl teamDAO;

	public void setTeamDAO(TeamDAOImpl teamDAO) {
		this.teamDAO = teamDAO;
	}

	@Override
	public void show() {
		final String memberName = "ÆÀ¿ø ÀÌ¸§";
		String name = getKeyInputString(memberName);
		
		if(!Utils.isEmpty(name, memberName)){
			return;
		}if(!Utils.isSmallLength(name, memberName, 10)){
			return;
		}
		MemberDTO member = new MemberDTO();
		member.setName(name);
		showTeamField(member);

	}
	
	public void showTeamField(MemberDTO member){
		final String teamId = "ÆÀ ID";
		String id = getKeyInputString(teamId);
		
		if(!Utils.isEmpty(id, teamId)){
			return;
		}
		if(!Utils.isNumeric(id, teamId)){
			return;
		}
		
		TeamDTO team = new TeamD();
		}
}
