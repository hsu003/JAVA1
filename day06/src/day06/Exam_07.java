package day06;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;

class MyFrame07 extends JFrame{
	private JToolBar jtb = new JToolBar();
	private JButton jbt1 = new JButton("Â¥Àå¸é");
	private JButton jbt2 = new JButton("Â«»Í");
	private JButton jbt3 = new JButton("ÅÁ¼öÀ°");
	private JButton jbt4 = new JButton("°íÃßÀâÃ¤");
	
	Image img1 = Toolkit.getDefaultToolkit().getImage("src/ÀÚÀå.jpg");
	Image img2 = Toolkit.getDefaultToolkit().getImage("src/Â«»Í.jpg");
	Image img3 = Toolkit.getDefaultToolkit().getImage("src/ÅÁ¼öÀ°.jpg");
	Image img4 = Toolkit.getDefaultToolkit().getImage("src/°íÃßÀâÃ¤.jpg");
	private Container con;
	
	
	public void init() {
		con = this.getContentPane();
		con.setLayout(new BorderLayout());
		con.add("North", jtb);
		jtb.add(jbt1);
		jtb.add(jbt2);
		jtb.addSeparator();
		jtb.add(jbt3);
		jtb.add(jbt4);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public MyFrame07(String title) {
		super(title);
		this.init();
		this.setSize(400, 300);
		Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
		int xpos = (int)(screen.getWidth()/2) - this.getWidth()/2;
		int ypos = (int)(screen.getHeight()/2) - this.getHeight()/2;
		this.setLocation(xpos, ypos);
		this.setResizable(false);
		this.setVisible(true);
	}
}



public class Exam_07 {
	public static void main(String[] args) {
		MyFrame07 mf = new MyFrame07("swing");
		
	}
}
