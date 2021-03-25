package sungjuk;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Student implements Serializable{
	private String name;
	private int kor;
	private int eng;
	private int tot;
	private int rank;
	public Student(String name, int kor, int eng) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.tot = kor + eng;
		this.rank = 1;
	}
	
	public void setKor(int kor) {
		this.kor = kor;
		this.tot = kor + eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
		this.tot = kor + eng;
	}

	public String getName() {
		return name;
	}
	public int getKor() {
		return kor;
	}
	public int getEng() {
		return eng;
	}
	public int getTot() {
		return tot;
	}
	public int getRank() {
		return rank;
	}
	
	public void clearRank() {
		rank = 1;
	}
	public void plusRank() {
		rank++;
	}
	public void disp() {
		System.out.println(name+"님의 총점은 " + tot +
						"점이고, 순위는 " + rank + "등 입니다.");
	}
}


