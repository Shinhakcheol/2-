package arrays;

import java.util.Scanner;

public class ArrayTest06 {

	public static void main(String[] args) {
				
		Scanner in=new Scanner(System.in);
		System.out.print("정수입력 ");			
		int m=in.nextInt();
		int[][] arr=new int[m][m];
		//2차워배열선언
		//1차원배열변수
		//arr[0]~[99]
		
		//데이터 입력
		//16 15 14 13
		//12 11 10 9
		//8 7 6 5
		//4 3 2 4
		int c=1;
		
		for (int j = arr.length - 1; j >= 0; j--) {// 행 length -1~0 감소패턴
			for (int i = arr[j].length - 1; i >= 0; i--) {// 열 length -1~0 감소패턴
				arr[j][i] = c++;
			}
		}
		
		
			
		//출력
		
		for(int i=0; i<arr.length ;i++) {// 행 2차원뱌열사이즈
			for(int j=0; j<arr[i].length ;j++) {//열 1차원배열사이즈
				
				System.out.printf("%2d " ,arr[i][j]);
				
			}
			System.out.println();
			
		}
	}

}
