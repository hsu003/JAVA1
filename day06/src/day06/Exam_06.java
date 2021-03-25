package day06;
import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;

class MyFrame06 extends JFrame{
	private Container con;
	private JButton jbt1 = new JButton("버튼1");
	private JButton jbt2 = new JButton("버튼2");
	private JButton jbt3 = new JButton("버튼3");
	private JButton jbt4 = new JButton("버튼4");
	private JButton jbt5 = new JButton("버튼5");
	private JButton jbt6 = new JButton("버튼6");
	private JButton jbt7 = new JButton("버튼7");
	private JButton jbt8 = new JButton("버튼8");
	
	public void init() {
		con = this.getContentPane();
		con.setLayout(new GridLayout(4,2));
		LineBorder b1 = new LineBorder(Color.red,5);   //라인 두깨가 일정한거
		jbt1.setBorder(b1); con.add(jbt1);
		MatteBorder b2 = new MatteBorder(10,5,10,5, Color.blue);   //라인 두깨를 일일이 지정
		jbt2.setBorder(b2);con.add(jbt2);
		BevelBorder b3 = new BevelBorder(BevelBorder.LOWERED);  // 밑으로 가라앉은듯한 느낌
		jbt3.setBorder(b3);con.add(jbt3);
		SoftBevelBorder b4 = new SoftBevelBorder(SoftBevelBorder.RAISED);  //소프트  위로 올라온 듯한 느낌
		jbt4.setBorder(b4);con.add(jbt4);
		EmptyBorder b5 = new EmptyBorder(2,2,2,2);   // 경계선이 입력한 숫자 만큼 사자리는 것
		jbt5.setBorder(b5);con.add(jbt5);
		EtchedBorder b6 = new EtchedBorder(EtchedBorder.LOWERED);//테두리가 나온듯한 느낌
		jbt6.setBorder(b6);con.add(jbt6);     
		TitledBorder b7 = new TitledBorder("border");//타이틀 보더  타이틀이나오는 창
		jbt7.setBorder(b7);	con.add(jbt7);
		CompoundBorder b8 = new CompoundBorder(b3, b7); //두개의 컴포넌트가 합쳐진다.
		jbt8.setBorder(b8);	con.add(jbt8);
		con.add(jbt1);
		con.add(jbt2);
		con.add(jbt3);
		con.add(jbt4);
		con.add(jbt5);
		con.add(jbt6);
		con.add(jbt7);
		con.add(jbt8);

		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public MyFrame06(String title) {
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



public class Exam_06 {
	public static void main(String[] args) {
		MyFrame06 mf = new MyFrame06("swing");
		
	}
}

