package day05;
import java.awt.*;
import java.awt.event.*;

@SuppressWarnings("serial")
class MyFrame01 extends Frame implements ActionListener{
	Button bt = new Button("버튼");
	int co = 0;
	public void update(Graphics g) {
        paint(g);
	}
	public void paint(Graphics g){
		/*g.drawLine(50, 50, 100, 100);  //직선, 앞에2개 시작좌표, 뒤에 2개 끝좌표
		g.drawRect(50, 50, 100, 100);  //직사각형, 앞에 2개 시작좌표, 3번 좌로 이동, 4번 우로 이동
		g.setColor(Color.YELLOW);
		g.fillRect(200, 50, 100, 100);
		g.setColor(Color.blue);
		g.fillOval(50, 50, 100, 100);
		g.drawOval(200, 50, 100, 100);
		int[] x = new int[] {60,180,120};
		int[] y = new int[] {60,90,120};
		*/
		Image img = Toolkit.getDefaultToolkit().getImage("src/sc.jpg");
		g.drawImage(img, 50, 50, 300, 200, this);
	
	/*	g.setColor(Color.red);
		g.drawPolygon(x,y,3);
		g.drawPolyline(x, y, 3);
		g.setFont(new Font("",Font.ITALIC,30));
		g.drawString("안녕하세요", 50, 200);
		co++;
		System.out.println("co = " + co);
	*/
	}
	
	public void init() {
		this.setLayout(new BorderLayout());
		this.add("South", bt);
		bt.addActionListener(this);
	}

	public MyFrame01(String title) {
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
		repaint();
		
	}
}
public class Exam_01 {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		MyFrame01 mf = new MyFrame01("그래픽예제");
	}
}

