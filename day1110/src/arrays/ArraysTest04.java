package Arrays;

public class ArraysTest04 {
	// Syring 클레스타입 문자열 배열//배열 이름//
	public static void main(String[] args) {

		// 1.배열변수선언
		int arr[];
		int[] arr1;

		// 2.배열생성
		arr = new int[5];

		double dArr[] = new double[3];
		
		
		//배열변수는 : stack메모리에 4바이트할당 레퍼런스변수
		//생성된 heap메모리의 주소 참조..
		System.out.println(dArr); //해시코드 출력?
		
		//dArr=null;
		
		/*
		 * 배열은 자동으로 변수이름을 만들어준다. 배열이름[인덱스번호] : 인덱스번호는 0~순차적으로만든다.
		 * dArr[0],dArr[1],dArr[2]
		 * 
		 */
		System.out.println(dArr[0]);
		System.out.println(dArr[1]);
		System.out.println(dArr[2]);

	}

}
