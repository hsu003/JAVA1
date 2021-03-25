package day04;

import java.awt.*;
import java.awt.event.*;
@SuppressWarnings({ "serial", "unused" })
class MyFrame16 extends Frame implements ActionListener{
	Button bt = new Button("종료");
	
	public void init() {
		this.setLayout(new BorderLayout());
		this.add("South", bt);
		bt.addActionListener(this);
	}
	public MyFrame16(String title) {
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
		System.exit(0);
		
	}
}
public class Exam_16 {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		MyFrame16 mf = new MyFrame16("이벤트");
	}
}
