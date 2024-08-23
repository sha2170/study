package Mission;

import java.lang.reflect.Array;

public class mission3_0823 {
	public static double calAvg(int[] arr) {
		int sum = 0;
		for (int num : arr) {
			sum += num;
		}
		return (double) sum / arr.length;
	}
	
	public static void modifyArray(int[] arr) {
		arr[4] = 150;
		System.out.println("변경한 배열 요소: " + arr[4]);
	}
	
	
	public static void main(String[] args) {
		int[] arr = {10, 20, 30, 40, 50};
		
		double average = calAvg(arr);
		System.out.println("배열의 평균: " + average);
		
		modifyArray(arr);
		System.out.println("변경 후 배열의 평균: " + average);		
		
		
		
	

	}

}
