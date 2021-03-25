package day05;
import java.awt.*;
import java.awt.event.*;

@SuppressWarnings("serial")
class MyFrame06 extends Frame implements ActionListener, Runnable{
	private Button[] bt = new Button[9];
	private Label time_lb = new Label("시간 : 10초", Label.CENTER);
	private Label score_lb = new Label("점수 : 0점", Label.CENTER);
	private Button start_bt = new Button("시작");
	
	private Panel center_p = new Panel();
	private Panel east_p = new Panel();
	
	private int co = 0;
	private int arr[] = new int[9];
	private int po = 1;
	
	
	public void init() {
		this.setLayout(new BorderLayout());
		this.add("Center", center_p);
		center_p.setLayout(new GridLayout(3,3));
		for(int i=0; i<bt.length; ++i) {
			bt[i] = new Button("");
			bt[i].setEnabled(false);
			bt[i].setFont(new Font("", Font.PLAIN, 25));
			center_p.add(bt[i]);
			bt[i].addActionListener(this);
		}
		this.add("East", east_p);
		east_p.setLayout(new GridLayout(3,1));
		east_p.add(time_lb);
		east_p.add(score_lb);
		east_p.add(start_bt);
		start_bt.addActionListener(this);
	}

	public MyFrame06(String title) {
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
	
	public void actionPerformed(ActionEvent e) {
		if (e.getSource()==start_bt) {
			co = 0;
			po = 1;
			score_lb.setText("점수 : "+co+"점");
			start_bt.setEnabled(false);
			Thread th = new Thread(this);
			th.start();
			this.gameStart();
		}
		for (int i=0; i<bt.length; ++i) {
			if (e.getSource() == bt[i]) {
				if (po == arr[i]) {
					co++;
					po++;
					bt[i].setEnabled(false);
					if (po>9) {
						co += 5;
						po = 1;
						gameStart();
					}
					score_lb.setText("점수 : "+co+"점");
				}
			}
		}
		
	}
	
	protected void gameStart() {
		buttonSetting();
		for(int i=0; i<arr.length; ++i) {
			bt[i].setLabel(String.valueOf(arr[i]));
			bt[i].setEnabled(true);
		}
	}
	
	protected void buttonSetting() {
		for(int i=0; i<arr.length; ++i) {
			arr[i] = (int)(Math.random()*9) + 1;
			for(int j=0; j<i; ++j) {
				if (arr[i] == arr[j]) {
					i--;
					break;
				}
			}
		}
	}
	
	
	public void run() {
		int time = 10;
		time_lb.setText("시간 : "+time+"초");
		while(time>0) {
			try {
				Thread.sleep(1000);
				time--;
				time_lb.setText("시간 : "+time+"초");
			}catch(InterruptedException e) {}
		}
		for(int i=0; i<bt.length; ++i) {
			bt[i].setEnabled(false);
		}
		start_bt.setEnabled(true);
	}
}
public class Exam_06 {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		MyFrame06 mf = new MyFrame06("숫자게임");
	}
}

