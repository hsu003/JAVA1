package day04;
import java.awt.*;

import java.awt.*;

@SuppressWarnings({ "unused", "serial" })
class MyFrame14 extends Frame{
	private Label lb = new Label("전화기예제", Label.CENTER);
	private Button[] bt = new Button[12];
	private Panel p = new Panel();
	private String[] str = new String[] {"*", "0", "#"};	
	public void init() {
		this.setLayout(new BorderLayout());
		Font font = new Font("", Font.BOLD, 30);
		lb.setFont(font);
		this.add("North", lb);
		this.add("Center", p);
		p.setLayout(new GridLayout(4,3));
		for(int i=0; i<bt.length; ++i) {
			if (i>=9) {
				bt[i] = new Button(str[i-9]);
			}else {
				bt[i] = new Button(String.valueOf(i+1));
			}
			p.add(bt[i]);
		}
		
	}
	public MyFrame14(String title) {
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
}
public class Exam_14 {
	public static void main(String[] args) {
		new MyFrame14("전화기예제");
	}
}
