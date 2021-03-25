package dto2;

public class MemberDTO {
	private Integer id;
	private String name;
	private TeamDTO team;  //플렌징 키가 설정 되어 있기 때문 팀 DTO에서 받아와야 한다.
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public TeamDTO getTeam() {
		return team;
	}
	public void setTeam(TeamDTO team) {
		this.team = team;
	}
	
	
	
	
}
