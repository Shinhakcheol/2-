package Arrays;

public class ArraysTest01 {

	public static void main(String[] args) {
		// Arrays(배열)
		//동일한 데이터타입의 집합 : 메모리기준 순차콜렉션
		
		//int [] 배열이름;
		//int 배열이름2[];
		//int 변수이름;
		//배열이름2=new int[10];
		
		
		int arr[]=new int[3]; //heap메모리사용 자동초기화
		//int를 저장할수있는 공간 3개를 만들어주세요..
		//배열은 변수이름을 자동으로 만들어준다.
		//배열이름[인덱스번호] : 인덱스번호는 0 부터 1씩증가
		//변수이름 : arr[0],arr[1],arr[2]
		
		double dArr[]=new double[3];
		
		
		char cArr[];
		cArr=new char[10];
		int num1,num2,num3;
	
		System.out.println(arr[0]); //자동초기화
		System.out.println(arr[1]);
		System.out.println(arr[2]); // '\0'
		String str=null;
		//System.out.println(num1); // local 변수는 초기화해야 사용가능
		//System.out.println(num2);
		//System.out.println(num3);
		
		//stack메모리 = heap메모리
		int arr2[]= {10,20,30};
		
	}

}
