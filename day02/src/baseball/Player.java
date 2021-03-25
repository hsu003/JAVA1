package baseball;

public class Player {
	private String teamName;
	private String name;
	private int salary;
	private String position;
	
	public Player(String teamName, String name, int salary, String position) {
		this.teamName = teamName;
		this.name = name;
		this.salary = salary;
		this.position = position;
	}
	public String getTeamName() {
		return teamName;
	}
	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public String getName() {
		return name;
	}
	public void disp() {
		System.out.println(name+"님의 연봉은 " + 
				salary+"원이고, 포지션은 " + position +" 입니다.");
	}
}











