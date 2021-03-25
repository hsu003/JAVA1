package day06;

import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;

//awt에서 상속 : Frame -> swing에서는 j를 붙혀 JFrame을 상속받는다
class MyFrame05 extends JFrame {
	private Container con;

	public void init() {
		con = this.getContentPane();
		Color color = JColorChooser.showDialog(this, "바탕색선택", Color.red);//초기 보여줄 바탕 색상 
		con.setBackground(color);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JFileChooser jfc = new JFileChooser(".");//.하나는 자기 자신  ..이면 부모 클래스
		int res = jfc.showOpenDialog(this);  //파일 열기
		if(res == 0) {
			File file = jfc.getSelectedFile();
			System.out.println("filename = "+ file.getName());
		}
		//jfc.showSaveDialog(this);//파일 저장하기

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

		// JOptionPane.showMessageDialog(this, "자동으로 나오는 메세지창",
		// "경고", JOptionPane.WARNING_MESSAGE);
		// String name = JOptionPane.showInputDialog
		// (this, "메세지를 입력 받는창", "질문", JOptionPane.QUESTION_MESSAGE);
		// JOptionPane.showMessageDialog(this, name+"입력받는 창",
		// "알림", JOptionPane.INFORMATION_MESSAGE);
		int res = JOptionPane.showConfirmDialog(this, "옵션을 정하는 메세지", "질문", JOptionPane.YES_NO_OPTION,
				JOptionPane.QUESTION_MESSAGE);
		if (res == 0) {
			JOptionPane.showMessageDialog(this, "예스 선택자", "알림", JOptionPane.INFORMATION_MESSAGE);
		} else {
			JOptionPane.showMessageDialog(this, "노 선택자", "알림", JOptionPane.INFORMATION_MESSAGE);
		}
	}

}

public class Exam_05 {
	public static void main(String[] args) {
		MyFrame05 mf = new MyFrame05("swing");

	}
}
