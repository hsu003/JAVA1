package day06;
import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;

class MyFrame06 extends JFrame{
	private Container con;
	private JButton jbt1 = new JButton("��ư1");
	private JButton jbt2 = new JButton("��ư2");
	private JButton jbt3 = new JButton("��ư3");
	private JButton jbt4 = new JButton("��ư4");
	private JButton jbt5 = new JButton("��ư5");
	private JButton jbt6 = new JButton("��ư6");
	private JButton jbt7 = new JButton("��ư7");
	private JButton jbt8 = new JButton("��ư8");
	
	public void init() {
		con = this.getContentPane();
		con.setLayout(new GridLayout(4,2));
		LineBorder b1 = new LineBorder(Color.red,5);   //���� �α��� �����Ѱ�
		jbt1.setBorder(b1); con.add(jbt1);
		MatteBorder b2 = new MatteBorder(10,5,10,5, Color.blue);   //���� �α��� ������ ����
		jbt2.setBorder(b2);con.add(jbt2);
		BevelBorder b3 = new BevelBorder(BevelBorder.LOWERED);  // ������ ����������� ����
		jbt3.setBorder(b3);con.add(jbt3);
		SoftBevelBorder b4 = new SoftBevelBorder(SoftBevelBorder.RAISED);  //����Ʈ  ���� �ö�� ���� ����
		jbt4.setBorder(b4);con.add(jbt4);
		EmptyBorder b5 = new EmptyBorder(2,2,2,2);   // ��輱�� �Է��� ���� ��ŭ ���ڸ��� ��
		jbt5.setBorder(b5);con.add(jbt5);
		EtchedBorder b6 = new EtchedBorder(EtchedBorder.LOWERED);//�׵θ��� ���µ��� ����
		jbt6.setBorder(b6);con.add(jbt6);     
		TitledBorder b7 = new TitledBorder("border");//Ÿ��Ʋ ����  Ÿ��Ʋ�̳����� â
		jbt7.setBorder(b7);	con.add(jbt7);
		CompoundBorder b8 = new CompoundBorder(b3, b7); //�ΰ��� ������Ʈ�� ��������.
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

