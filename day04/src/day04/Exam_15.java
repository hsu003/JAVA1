package day04;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

@SuppressWarnings("serial")
class MyFrame15 extends JFrame implements ActionListener{
	private JTextField jtf = new JTextField();
	private JPanel jp = new JPanel();
	private JButton[] jbt = new JButton[16];
	private String[] str = new String[] 
		{"7","8","9","+","4","5","6","-","1","2","3","*","0","=","%","/"};
	
	private int firstSu = 0;
	private char op = 0;
	private boolean isCheck = false;
	
	public void init() {
		Container con = this.getContentPane();
		con.setLayout(new BorderLayout());
		jtf.setFont(new Font("", Font.PLAIN, 30));//Font.BOLD, Font.ITALIC
		jtf.setEditable(false);
		con.add("North", jtf);
		con.add("Center", jp);
		jp.setLayout(new GridLayout(4,4));
		for(int i=0; i<jbt.length; ++i) {
			jbt[i] = new JButton(str[i]);
			jbt[i].setFont(new Font("", Font.PLAIN, 25));
			jbt[i].addActionListener(this);
			jp.add(jbt[i]);
		}
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public MyFrame15(String title) {
		super(title);
		init();
		super.setSize(400, 300);
		Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
		int x = (int)(screen.getWidth()/2 - this.getWidth()/2);
		int y = (int)(screen.getHeight()/2 - this.getHeight()/2);
		super.setLocation(x, y);
		super.setResizable(false);
		
		super.setVisible(true);
	}
	
	public void calculator() {
		isCheck = true;
		if (op == 0) {
			firstSu = Integer.parseInt(jtf.getText());
			return;
		}
		switch(op) {
		case '+' : firstSu += Integer.parseInt(jtf.getText()); break;
		case '-' : firstSu -= Integer.parseInt(jtf.getText()); break;
		case '*' : firstSu *= Integer.parseInt(jtf.getText()); break;
		case '/' : firstSu /= Integer.parseInt(jtf.getText()); break;
		case '%' : firstSu %= Integer.parseInt(jtf.getText()); 
		}
		jtf.setText(String.valueOf(firstSu));
		
	}
	
	/*@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource()==jbt[3]) {
			calculator();
			op = '+';
		}else if (e.getSource()==jbt[7]) {
			calculator();
			op = '-';
		}else if (e.getSource()==jbt[11]) {
			calculator();
			op = '*';
		}else if (e.getSource()==jbt[14]) {
			calculator();
			op = '%';
		}else if (e.getSource()==jbt[15]) {
			calculator();
			op = '/';
		}else if (e.getSource()==jbt[13]) {
			calculator();
			op = 0;
			firstSu = 0;
		}else {
			String a = e.getActionCommand();
			if (isCheck) {
				jtf.setText(a);
				isCheck = false;
			}else {
				jtf.setText(jtf.getText()+a);
			}
		}
		
	}
}
*/
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource()==jbt[3] || e.getSource()==jbt[7] 
				|| e.getSource()==jbt[11] || e.getSource()==jbt[14] 
				|| e.getSource()==jbt[15]) {
			calculator();
			String a = e.getActionCommand();
			op = a.charAt(0);
		}else if (e.getSource()==jbt[13]) {
			calculator();
			op = 0;
			firstSu = 0;
		}else {
			String a = e.getActionCommand();
			if (isCheck) {
				jtf.setText(a);
				isCheck = false;
			}else {
				jtf.setText(jtf.getText()+a);
			}
		}
		
	}
}
	
public class Exam_15 {
	public static void main(String[] args) {
		new MyFrame15("계산기예제");
	}
}


