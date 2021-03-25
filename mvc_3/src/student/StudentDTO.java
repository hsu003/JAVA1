package student;

//DTO : Data Transfer Object
//1. table에 있는 컬럼을 private 멤버필드로 만들어 준다
//2. 만든 멤버필드의 setter,getter메소드를 모두 만들어 준다
public class StudentDTO {
	private String id;
	private String name;
	private String cname;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
}
