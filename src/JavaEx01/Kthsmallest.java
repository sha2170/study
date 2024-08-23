package JavaEx01;

import java.util.Arrays;

public class Kthsmallest {
	// K번째 최소값을 찾는 메서드
	public static int findkthSmallest(int[] arr, int k) {
		//  배열 정렬
		Arrays.sort(arr); // 오름차순 정렬 {2, 3, 4, 5, 6}
		// K번째 최소값 반환
		return arr[k-1];
	}
	
	
	
	
	
	public static void main(String[] args) {
		int[] arr = {3, 5, 2, 6, 4};
		int k = 3;
		
		//  배열 정렬
		Arrays.sort(arr); // 오름차순 정렬 {2, 3, 4, 5, 6}
		// k번째 최소값 출력
		int KthSmallest = findkthSmallest(arr, k);
		System.out.print(k+"번 째 최소값" + arr[k-1]);
		
		

	}

}
