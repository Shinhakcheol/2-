package Arrays;

import java.util.Arrays;

public class ArraysTest05 {

	public static void main(String[] args) {

		int arr[]=new int[3];
		// arr[0],arr[1],arr[2]
		
		arr[0]=100;
		arr[1]=200;
		arr[2]=300;
		//arr[3]=400; 인덱스 범위를 벗어나면 예외발생
		
		
		
		for(int i=0; i<3; i++) {// i : 0 , 1 , 2
			
		System.out.println(arr[i]);
		}
		//System.out.println(arr[1]);
		//System.out.println(arr[2]);
		
		
		//java 1.5버전
		//foreach
		for(int num : arr) {
			System.out.println(num);
		}
		
		System.out.println( Arrays.toString(arr));
		
		
		
	}

}
