package Arrays;

public class ArraysTest03 {

	public static void main(String[] args) {

		int jumsu[] = { 11, 20, 30 };

		int tot = 0;

		for (int i = 0; i < 3; i++) {
			tot = tot + jumsu[i];
		}
		
		
		System.out.println("총점 : " + tot);
		System.out.printf("평균 : %.2f",tot / 3.0);

	}

}
