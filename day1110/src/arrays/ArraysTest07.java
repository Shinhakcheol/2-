package Arrays;

public class ArraysTest07 {

	public static void main(String[] args) {
		//구구단 %d서식문자
		
		for(int i=1;i<=9;i++) {
			
			for(int j=2; j<=9; j++) {
			
			System.out.printf(" %d*%d=%2d ",j,i,i*j);
			}
			System.out.println();
		}
	}

}
