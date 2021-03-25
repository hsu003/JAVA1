package day06;

import java.awt.*;
import java.awt.event.*;

import javax.swing.JOptionPane;

class MyFrame10 extends Frame implements MouseListener, ActionListener{
	
	private Button[][] bt = new Button[9][9];
	private Panel p = new Panel();
	
	int boomb[][] = new int[9][9];
	boolean boombCheck[][] = new boolean[9][9];
	
	public void init() {
		this.setLayout(new BorderLayout());
		this.add("Center", p);
		p.setLayout(new GridLayout(9,9));
		for(int i=0; i<9; ++i) {
			for (int j=0; j<9; ++j) {
				bt[i][j] = new Button("");
				p.add(bt[i][j]);
				bt[i][j].addMouseListener(this);
			}
		}
	}
	
	protected void boomSetting() {
		for(int i=0; i<10; ++i) {
			int x = (int)(Math.random()*9);
			int y = (int)(Math.random()*9);
			
			if (boomb[x][y] != 0) {
				i--;
				continue;
			}
			
			boomb[x][y] = 10;
			boomCount(x, y);
		}
	}
	
	protected void boomCount(int x, int y) {
		int minI = x-1; if (minI<0) minI = 0;
		int maxI = x+1; if (maxI>8) maxI = 8;
		int minJ = y-1; if (minJ<0) minJ = 0;
		int maxJ = y+1; if (maxJ>8) maxJ = 8;
		for(int i=minI; i<=maxI; ++i) {
			for(int j=minJ; j<=maxJ; ++j) {
				if (boomb[i][j] == 10) continue;
				boomb[i][j]++;
			}
		}
	}
	
	public MyFrame10(String title) {
		super(title);
		this.init();
		this.boomSetting();
		this.setSize(800, 800);
		Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
		int xpos = (int)(screen.getWidth()/2) - this.getWidth()/2;
		int ypos = (int)(screen.getHeight()/2) - this.getHeight()/2;
		this.setLocation(xpos, ypos);
		this.setResizable(false);
		this.setVisible(true);
	}
	
	public void zeroCheck(int a, int b) {
		bt[a][b].setBackground(Color.red);
		int minI = a - 1; if (minI<0) minI = 0;
		int maxI = a + 1; if (maxI>8) maxI = 8;
		int minJ = b - 1; if (minJ<0) minJ = 0;
		int maxJ = b + 1; if (maxJ>8) maxJ = 8;
		for(int i=minI; i<=maxI; ++i) {
			for(int j=minJ; j<=maxJ; ++j) {
				if (boombCheck[i][j]) continue;
				boombCheck[i][j] = true;
				if (boomb[i][j] == 0) {
					zeroCheck(i, j);
				}else {
					bt[i][j].setLabel(String.valueOf(boomb[i][j]));
				}
			}
		}
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		for(int i=0; i<9; ++i) {
			for(int j=0; j<9; ++j) {
				if (e.getSource()==bt[i][j]) {
					if (boomb[i][j] == 10) {
						if (e.getButton() == MouseEvent.BUTTON3) {
							boombCheck[i][j] = true;
							bt[i][j].setLabel("ÆøÅº");
						}else {
							JOptionPane.showMessageDialog
							(this, "ÆøÅºÀ» ´­·¯¼­ °ÔÀÓÀÌ ³¡³µ½À´Ï´Ù.");
						}
					}else if (boomb[i][j] == 0){
						zeroCheck(i, j);
					}else {
						bt[i][j].setLabel(String.valueOf(boomb[i][j]));
						boombCheck[i][j] = true;
					}
				}
			}
		}
		gameCheck();
	}
	
	protected void gameCheck() {
		for(int i=0; i<9; ++i) {
			for(int j=0; j<9; ++j) {
				if (!boombCheck[i][j]) return;
			}
		}
		JOptionPane.showMessageDialog
			(this, "ÆøÅºÀ» ¸ðµÎ Á¦°ÅÇÏ¿´½À´Ï´Ù.");
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	
}
public class Exam_10 {
	public static void main(String[] args) {
		new MyFrame10("Áö·Ú°ÔÀÓ");
	}
}
