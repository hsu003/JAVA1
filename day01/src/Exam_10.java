import java.util.Arrays;

@SuppressWarnings("unused")
interface A10 {
	public abstract void disp();
}

public class Exam_10 {
	public static void main(String[] args) {
		int arr[] = new int[] { 10, 6, 45, 88, 1000, 234, 75, 5, 23, 70 };
		// select sort
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					int imsi = arr[i];
					arr[i] = arr[j];
					arr[j] = imsi;
				}
			}
		}
		// bubble sort
		for (int i = arr.length - 2; i >= 0; --i) {
			for (int j = 0; j <= i; ++j) {
				if (arr[j] > arr[j + 1]) {
					int imsi = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = imsi;
				}
			}
		}
		// insert sort
		for (int i = 1; i < arr.length; i++) {
			int t = arr[i];
			int j = i - 1;
			while (true) {
				if (arr[j] > t) {
					arr[j + 1] = arr[j];
					j--;
				} else {
					arr[j + 1] = t;
					break;
				}
				if (j < 0) {
					arr[0] = t;
					break;
				}
			}
		}
		// Äü(2Áø0 sort
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}
