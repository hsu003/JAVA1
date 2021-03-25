package day06;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.net.*;

class MyFrame03 extends Frame implements ActionListener, Runnable{
	private TextArea jta = new TextArea();

	private Label jlb = new Label("메세지 : ", Label.RIGHT);
	private TextField jtf = new TextField();
	private Button jbt = new Button("전송");
	private Panel jp = new Panel();
	
	private DatagramPacket send, receive;
	private DatagramSocket ds;
	private InetAddress ia;
	
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
	
	public MyFrame03(String title) {
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
			ia = InetAddress.getByName("localhost");
			ds = new DatagramSocket(12345);
			jta.append("상대방이 입장하였습니다.\n");
		}catch(IOException e) {}
		Thread th = new Thread(this);
		th.start();
	}
	@Override
	public void run() {								//메시지 받기
		try {
			while(true) {
				receive = new DatagramPacket(new byte[65508], 65508);
				ds.receive(receive);
				String clMsg = new String(receive.getData()).trim();
				jta.append("상대 : " + clMsg + "\n");
			}
		}catch(IOException e) {}
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {	//메세지 보내기
		// TODO Auto-generated method stub
		if (e.getSource()==jbt) {
			try {
				byte[] by = jtf.getText().getBytes();
				send = new DatagramPacket(by, by.length, ia, 12346);
				ds.send(send);
				jta.append("나 : " + jtf.getText() +"\n");
				jtf.setText("");
			}catch(IOException ee) {}
		}
	}
}
public class Exam_03 {
	public static void main(String[] args) {
		MyFrame03 frame = new MyFrame03("채팅서버");
	}
}