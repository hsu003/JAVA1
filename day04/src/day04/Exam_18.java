package day04;
import java.awt.*;
import java.awt.event.*;
@SuppressWarnings("serial")
class MyFrame18 extends Frame implements ActionListener{
	Button bt1 = new Button("왼쪽버튼");
	Button bt2 = new Button("오른쪽버튼");
	Label lb = new Label("버튼을 누르세요!!");	
	
	Panel p = new Panel();
	
	public void init() {
		this.setLayout(new BorderLayout());
		this.add("Center", p);
		p.setLayout(new GridLayout(1,2));
		p.add(bt1);
		p.add(bt2);
		this.add("South", lb);
		bt1.addActionListener(this);
		bt2.addActionListener(this);
	}
	public MyFrame18(String title) {
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
		if(e.getSource() == bt1) {
			lb.setText("왼쪽버튼을 누르셨습니다.");
		}else if(e.getSource() == bt2) {
			lb.setText("오른쪽버튼을 누르셨습니다.");
		}
	}
}
public class Exam_18 {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		MyFrame18 mf = new MyFrame18("이벤트");
	}
}
