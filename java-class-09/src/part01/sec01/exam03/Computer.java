package part01.sec01.exam03;

public class Computer {
	
	int sum1(int[] values) {   //�Ű������� ������ �˼� ���� ��� �迭�θ��� ó���Ѵ�.
		int sum=0;
		for(int i=0;i<values.length;i++) {
			sum+=values[i];
		}
		return sum;
	}
	
	int sum2(int ... values) {   //�Ѱ��� ���� ���� ���� �ڵ����� �迭 ����
		int sum=0;
		for(int i=0;i<values.length;i++) {
			sum+=values[i];
		}
		return sum;
	}

}
