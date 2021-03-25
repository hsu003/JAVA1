package day04;
import java.awt.*;

@SuppressWarnings("serial")
class MyFrame13 extends Frame{
	private TextArea ta = new TextArea();
	private TextField tf = new TextField();
	private Button bt = new Button("전송");
	
	private Panel p = new Panel();
	
	public void init() {
		this.setLayout(new BorderLayout());//전체 layout 설정
		this.add("Center", ta);
		this.add("South", p);
		p.setLayout(new BorderLayout());//south영역의 layout 설정
		p.add("Center", tf);
		p.add("East", bt);
	}
	
	public MyFrame13(String title) {
		super(title);
		
		this.init();
		super.setSize(400, 300);
		Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
		int xpos = (int)(screen.getWidth()/2 - this.getWidth()/2);
		int ypos = (int)(screen.getHeight()/2 - this.getHeight()/2);
		this.setLocation(xpos, ypos);
		this.setResizable(false);
		this.setVisible(true);
	}
}

public class Exam_13 {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		MyFrame13 mf = new MyFrame13("awt연습");
	}
}













