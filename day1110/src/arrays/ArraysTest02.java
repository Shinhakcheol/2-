package Arrays;

public class ArraysTest02 {

	public static void main(String[] args) {
		
		//1.배열변수 선언
		//2.메모리공간 생성
		
		int arr[]=new int[10];
		// arr[0],arr[1],arr[2]
		
		//System.out.println(arr[3]);  x
		
		/*
		 * System.out.println(arr[0]); 
		 * System.out.println(arr[1]);
		 * System.out.println(arr[2]);
		 */
		
		for(int i=0;i<arr.length;i++) {
			arr[i] = 1+i;
		} 
		for(int i=0;i<arr.length;i++){// i : 0,1,2
			
			System.out.println(arr[i]);
			
		}
		//foreach : 집합의 모든데이터에 접근..
		for(int x : arr ) {
			System.out.println(x);
		}
		
	}	


}
