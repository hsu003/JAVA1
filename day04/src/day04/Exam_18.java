package day04;
import java.awt.*;
import java.awt.event.*;
@SuppressWarnings("serial")
class MyFrame18 extends Frame implements ActionListener{
	Button bt1 = new Button("���ʹ�ư");
	Button bt2 = new Button("�����ʹ�ư");
	Label lb = new Label("��ư�� ��������!!");	
	
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
			lb.setText("���ʹ�ư�� �����̽��ϴ�.");
		}else if(e.getSource() == bt2) {
			lb.setText("�����ʹ�ư�� �����̽��ϴ�.");
		}
	}
}
public class Exam_18 {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		MyFrame18 mf = new MyFrame18("�̺�Ʈ");
	}
}
