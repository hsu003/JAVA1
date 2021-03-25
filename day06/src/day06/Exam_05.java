package day06;

import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;

//awt���� ��� : Frame -> swing������ j�� ���� JFrame�� ��ӹ޴´�
class MyFrame05 extends JFrame {
	private Container con;

	public void init() {
		con = this.getContentPane();
		Color color = JColorChooser.showDialog(this, "����������", Color.red);//�ʱ� ������ ���� ���� 
		con.setBackground(color);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JFileChooser jfc = new JFileChooser(".");//.�ϳ��� �ڱ� �ڽ�  ..�̸� �θ� Ŭ����
		int res = jfc.showOpenDialog(this);  //���� ����
		if(res == 0) {
			File file = jfc.getSelectedFile();
			System.out.println("filename = "+ file.getName());
		}
		//jfc.showSaveDialog(this);//���� �����ϱ�

	}

	public MyFrame05(String title) {
		super(title);
		this.init();
		this.setSize(400, 300);
		Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
		int xpos = (int) (screen.getWidth() / 2) - this.getWidth() / 2;
		int ypos = (int) (screen.getHeight() / 2) - this.getHeight() / 2;
		this.setLocation(xpos, ypos);
		this.setResizable(false);
		this.setVisible(true);
		try {
			Thread.sleep(3000);
		} catch (Exception e) {
		}

		// JOptionPane.showMessageDialog(this, "�ڵ����� ������ �޼���â",
		// "���", JOptionPane.WARNING_MESSAGE);
		// String name = JOptionPane.showInputDialog
		// (this, "�޼����� �Է� �޴�â", "����", JOptionPane.QUESTION_MESSAGE);
		// JOptionPane.showMessageDialog(this, name+"�Է¹޴� â",
		// "�˸�", JOptionPane.INFORMATION_MESSAGE);
		int res = JOptionPane.showConfirmDialog(this, "�ɼ��� ���ϴ� �޼���", "����", JOptionPane.YES_NO_OPTION,
				JOptionPane.QUESTION_MESSAGE);
		if (res == 0) {
			JOptionPane.showMessageDialog(this, "���� ������", "�˸�", JOptionPane.INFORMATION_MESSAGE);
		} else {
			JOptionPane.showMessageDialog(this, "�� ������", "�˸�", JOptionPane.INFORMATION_MESSAGE);
		}
	}

}

public class Exam_05 {
	public static void main(String[] args) {
		MyFrame05 mf = new MyFrame05("swing");

	}
}
