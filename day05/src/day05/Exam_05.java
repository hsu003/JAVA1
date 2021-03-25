package day05;

import java.awt.*;
import java.awt.event.*;

@SuppressWarnings("serial")
class MyButton05 extends Button{
	private Image img;
	public MyButton05(Image img) {
		this.img = img;
	}
	public void setImage(Image img) {
		this.img = img;
	}
	public void paint(Graphics g) {
		g.drawImage(img, 5, 5, getWidth()-10, getHeight()-10, this);
	}
}

@SuppressWarnings("serial")
class MyFrame05 extends Frame implements ActionListener, Runnable{
	private MyButton05[] mb = new MyButton05[9];
	private Label time_lb = new Label("시간 : 10초", Label.CENTER);
	private Label score_lb = new Label("점수 : 0점", Label.CENTER);
	private Button start_bt = new Button("시작");
	
	private Panel center_p = new Panel();
	private Panel east_p = new Panel();
	
	Image img1 = Toolkit.getDefaultToolkit().getImage("src/du1.jpg");
	Image img2 = Toolkit.getDefaultToolkit().getImage("src/du2.jpg");
	
	int ransu = 0;
	int co = 0;
	
	public void init() {
		this.setLayout(new BorderLayout());
		this.add("Center", center_p);
		center_p.setLayout(new GridLayout(3,3));
		for(int i=0; i<mb.length; ++i) {
			mb[i] = new MyButton05(img1);
			mb[i].setEnabled(false);
			center_p.add(mb[i]);
			mb[i].addActionListener(this);
		}
		this.add("East", east_p);
		east_p.setLayout(new GridLayout(3,1));
		east_p.add(time_lb);
		east_p.add(score_lb);
		east_p.add(start_bt);
		start_bt.addActionListener(this);
		
	}

	public MyFrame05(String title) {
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
	public void actionPerformed(ActionEvent e) {
		if (e.getSource()==start_bt) {
			co = 0;
			score_lb.setText("점수 : 0점");
			for(int i=0; i<mb.length; ++i) {
				mb[i].setEnabled(true);
			}
			start_bt.setEnabled(false);
			Thread th = new Thread(this);
			th.start();
			gameStart();
		}
		for(int i=0; i<9; ++i) {
			if (e.getSource()==mb[i]) {
				game(i);
			}
		}
		
	}
	
	protected void game(int i) {
		if (ransu == i) {
			co++;
			score_lb.setText("점수 : "+co+"점");
			gameStart();
		}
	}
	
	protected void gameStart() {
		int ran;
		do {
			ran = (int)(Math.random()*9);
		}while(ran==ransu);
		mb[ransu].setImage(img1);
		mb[ransu].repaint();
		ransu = ran;
		mb[ransu].setImage(img2);
		mb[ransu].repaint();
		
	}

	@Override
	public void run() {
		int time = 10;
		time_lb.setText("시간 : "+time+"초");
		while(time>0) {
			try {
				Thread.sleep(1000);
				time--;
				time_lb.setText("시간 : "+time+"초");
			}catch(InterruptedException e) {}
		}
		for(int i=0; i<mb.length; ++i) {
			mb[i].setEnabled(false);
		}
		start_bt.setEnabled(true);
	}
}
public class Exam_05 {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		MyFrame05 mf = new MyFrame05("그래픽예제");
	}
}
















