package dto2;

public class MemberDTO {
	private Integer id;
	private String name;
	private TeamDTO team;  //�÷�¡ Ű�� ���� �Ǿ� �ֱ� ���� �� DTO���� �޾ƿ;� �Ѵ�.
	
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
