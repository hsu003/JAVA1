package day05;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.net.*;

class MyFrame07 extends Frame implements ActionListener, Runnable{
	private TextArea jta = new TextArea();

	private Label jlb = new Label("�޼��� : ", Label.RIGHT);
	private TextField jtf = new TextField();
	private Button jbt = new Button("����");
	private Panel jp = new Panel();
	
	private ServerSocket ss;
	private Socket soc;
	private BufferedReader br;
	private PrintWriter pw;
	
	public void init() {
		this.setLayout(new BorderLayout());
		jta.setEditable(false);
		this.add("Center", jta);
		this.add("South", jp);
		jp.setLayout(new BorderLayout());
		jp.add("West", jlb);
		jp.add("Center", jtf);
		jp.add("East", jbt);	jbt.addActionListener(this);

		WindowAdapter wa = new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		};
		this.addWindowListener(wa);
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
		try {
			ss = new ServerSocket(12345);
			soc = ss.accept();
			jta.append("������ �����Ͽ����ϴ�.\n");
		}catch(IOException e) {}
		Thread th = new Thread(this);
		th.start();
	}
	@Override
	public void run() {								//�޽��� �ޱ�
		try {
			br = new BufferedReader(new InputStreamReader(soc.getInputStream()));
			String clMsg = "";
			while(true) {
				clMsg = br.readLine();
				jta.append("��� : " + clMsg + "\n");
			}
		}catch(IOException e) {}
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {	//�޼��� ������
		// TODO Auto-generated method stub
		if (e.getSource()==jbt) {
			try {
				pw = new PrintWriter(soc.getOutputStream(), true);
				String msg = jtf.getText();
				pw.println(msg);
				pw.flush();
				jta.append("�� : " + msg +"\n");
				jtf.setText("");
			}catch(IOException ee) {}
		}
	}
}
public class Exam_07 {
	public static void main(String[] args) {
		MyFrame07 frame = new MyFrame07("ä�ü���");
	}
}

