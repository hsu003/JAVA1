package day04;

import java.net.*;
import java.io.*;

public class Exam_05 {

	public static void main(String[] args) {
		ServerSocket ss = null;
		for(int i=0;i<65535;i++) {
			try {
				ss = new ServerSocket(i);
				ss.close();
			}catch(IOException e) {
				System.err.println(i+"번은 현재 사용중인 포트 번호 입니다.");
			}
		}
	}

}
