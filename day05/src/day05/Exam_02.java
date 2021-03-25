package day05;

import java.awt.*;
import java.awt.event.*;

@SuppressWarnings("serial")
class MyImage02 extends Canvas{
	Image img;
	int xpos = 200;
	int ypos = 200;
	
	public MyImage02() {
		img = Toolkit.getDefaultToolkit().getImage("src/sc.jpg");
	}
	public void paint(Graphics g) {
		g.drawImage(img, 50, 50, xpos, ypos, this);
	}
}



@SuppressWarnings("serial")
class MyFrame02 extends Frame implements ActionListener{
	private Button bt1 = new Button("확대");
	private Button bt2 = new Button("축소");
	private Button bt3 = new Button("원본");
	private Button bt4 = new Button("종료");
	
	private Panel p = new Panel();
	
	private MyImage02 mi = new MyImage02();
		
	public void init() {
		this.setLayout(new BorderLayout());
		this.add("East", p);
		this.add("Center", mi);
		p.setLayout(new GridLayout(4, 1));
		p.add(bt1);	bt1.addActionListener(this);
		p.add(bt2); bt2.addActionListener(this);
		p.add(bt3); bt3.addActionListener(this);
		p.add(bt4); bt4.addActionListener(this);
	}
	
	public MyFrame02(String title) {
		super(title);
		this.init();
		super.setSize(600, 500);
		Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
		int x = (int)(screen.getWidth()/2 - this.getWidth()/2);
		int y = (int)(screen.getHeight()/2 - this.getHeight()/2);
		super.setLocation(x, y);
		super.setResizable(false);
		
		super.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		int xpos = mi.xpos;
		int ypos = mi.ypos;
		if (e.getSource()==bt4) {
			System.exit(0);
		}else if (e.getSource()==bt1) {
			xpos += 30;
			ypos += 30;
			if (xpos > 400) {
				xpos = 400;
				ypos = 400;
			}
		}else if (e.getSource()==bt2) {
			xpos -= 30;
			ypos -= 30;
			if (xpos < 50) {
				xpos = 50;
				ypos = 50;
			}
			
		}else if (e.getSource()==bt3) {
			xpos = 200;
			ypos = 200;
		}
		mi.xpos = xpos;
		mi.ypos = ypos;
		mi.repaint();
		
	}
}
public class Exam_02 {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		MyFrame02 mf = new MyFrame02("그래픽예제");
	}
}

