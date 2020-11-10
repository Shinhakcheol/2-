package arrays;

import java.util.Scanner;

public class ArrayTest04 {

	public static void main(String[] args) {
				
		Scanner in=new Scanner(System.in);
		System.out.print("정수입력 ");			
		int m=in.nextInt();
		int[][] arr=new int[m][m];
		//2차워배열선언
		//1차원배열변수
		//arr[0]~[99]
		
		//데이터 입력
		//13 14 15 16
		//9 10 11 12
		//5 6 7 8
		//1 2 3 4
		
		int c=1;
		int max=arr.length;
		
		for (int j = max-1; j >=0 ; j--) {
			for (int i = 0; i < arr[j].length; i++) {
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
