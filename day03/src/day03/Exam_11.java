package day03;

class 화장실{
	public void 입장(누구 who) {
		//동기화 : 하나의 스레드가 사용을 한다면 다른스레드는 사용하지 못해요
		synchronized(this) {
			System.out.println(who.getWho()+"님이 화장실에 들어왔어요!!");
			try {
				Thread.sleep(5000);
			}catch(Exception e) {}
			System.out.println(who.getWho()+"님이 화장실에서 나갔습니다.");
		}
	}
}


//전역 동기화 : 메소드에 synchronized를 써서 사용하는 것
//지역 동기화 : 동기화 시킬 지역을 선택해서 synchronized(this)로 묶어 사용


class 누구 extends Thread{
	String who;
	화장실 wr;
	public 누구(String who, 화장실 wr) {
		this.who = who;
		this.wr = wr;
	}
	public void run() {
		wr.입장(this);
	}
	public String getWho() {
		return who;
	}
}
public class Exam_11 {
	public static void main(String[] args) {
		화장실 wr = new 화장실();
		누구 aa = new 누구("아빠", wr);
		누구 bb = new 누구("엄마", wr);
		누구 cc = new 누구("나", wr);
		누구 dd = new 누구("여동생", wr);
		
		aa.start();
		bb.start();
		cc.start();
		dd.start();
		
		
	}
}








