package day04;

import java.awt.*;
import java.awt.event.*;
@SuppressWarnings("serial")
class MyFrame17 extends Frame implements MouseListener, MouseMotionListener{
	Button bt = new Button("����");
	Label lb = new Label("��ġ:");
	
	public void init() {
		this.setLayout(new BorderLayout());
		this.add("North", lb);
		this.add("South", bt);
		bt.addMouseListener(this);
		this.addMouseMotionListener(this);
	}
	public MyFrame17(String title) {
		super(title);
		this.init();
		super.setSize(400, 300);
		Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
		int x = (int)(screen.getWidth()/2 - this.getWidth()/2);
		int y = (int)(screen.getHeight()/2 - this.getHeight()/2);
		super.setLocation(x, y);
		super.setResizable(false);
		
		super.setVisible(true);
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("���콺Ŭ���� �߳׿�!!");
	}
	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("���콺�� ������ �����߳׿�!!");
	}
	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("���콺�� �����׿�");
	}
	@Override
	public void mouseEntered(MouseEvent e) {
		bt.setLabel("���콺�� ��ư���� �ֳ׿�!!");
		
	}
	@Override
	public void mouseExited(MouseEvent e) {
		bt.setLabel("����");
		
	}
	@SuppressWarnings("unused")
	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		int x = e.getX();
		int y = e.getY();
		lb.setText("��ġ�� : x ="+ x +", y ="+y);
		
	}
	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}
public class Exam_17 {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		MyFrame17 mf = new MyFrame17("�̺�Ʈ");
	}
}
