package day05;
import java.awt.*;
import java.awt.event.*;

@SuppressWarnings("serial")
class MyButton03 extends Button{
	public void paint(Graphics g) {
		Image img = Toolkit.getDefaultToolkit().getImage("src/sc.jpg");
		g.drawImage(img, 10, 10, getWidth()-20, getHeight()-20, this);
	}
}


@SuppressWarnings("serial")
class MyFrame03 extends Frame implements ActionListener{
	MyButton03 mb = new MyButton03();
	
	public void init() {
		this.setLayout(new BorderLayout());
		this.add("Center", mb);
		mb.addActionListener(this);
	}
	public MyFrame03(String title) {
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
		System.exit(0);
		
	}
}
public class Exam_03 {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		MyFrame03 mf = new MyFrame03("그래픽예제");
	}
}
