package day04;

import java.awt.*;
import java.awt.event.*;
@SuppressWarnings("serial")
class MyFrame17 extends Frame implements MouseListener, MouseMotionListener{
	Button bt = new Button("종료");
	Label lb = new Label("위치:");
	
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
		System.out.println("마우스클릭을 했네요!!");
	}
	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("마우스를 누르기 시작했네요!!");
	}
	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("마우스를 떼었네요");
	}
	@Override
	public void mouseEntered(MouseEvent e) {
		bt.setLabel("마우스가 버튼위에 있네요!!");
		
	}
	@Override
	public void mouseExited(MouseEvent e) {
		bt.setLabel("종료");
		
	}
	@SuppressWarnings("unused")
	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		int x = e.getX();
		int y = e.getY();
		lb.setText("위치는 : x ="+ x +", y ="+y);
		
	}
	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}
public class Exam_17 {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		MyFrame17 mf = new MyFrame17("이벤트");
	}
}
