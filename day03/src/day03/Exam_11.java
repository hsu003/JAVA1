package day03;

class ȭ���{
	public void ����(���� who) {
		//����ȭ : �ϳ��� �����尡 ����� �Ѵٸ� �ٸ�������� ������� ���ؿ�
		synchronized(this) {
			System.out.println(who.getWho()+"���� ȭ��ǿ� ���Ծ��!!");
			try {
				Thread.sleep(5000);
			}catch(Exception e) {}
			System.out.println(who.getWho()+"���� ȭ��ǿ��� �������ϴ�.");
		}
	}
}


//���� ����ȭ : �޼ҵ忡 synchronized�� �Ἥ ����ϴ� ��
//���� ����ȭ : ����ȭ ��ų ������ �����ؼ� synchronized(this)�� ���� ���


class ���� extends Thread{
	String who;
	ȭ��� wr;
	public ����(String who, ȭ��� wr) {
		this.who = who;
		this.wr = wr;
	}
	public void run() {
		wr.����(this);
	}
	public String getWho() {
		return who;
	}
}
public class Exam_11 {
	public static void main(String[] args) {
		ȭ��� wr = new ȭ���();
		���� aa = new ����("�ƺ�", wr);
		���� bb = new ����("����", wr);
		���� cc = new ����("��", wr);
		���� dd = new ����("������", wr);
		
		aa.start();
		bb.start();
		cc.start();
		dd.start();
		
		
	}
}








