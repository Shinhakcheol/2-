package lotto;

import java.util.Arrays;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;

public class LottoTest02 {
	// java.lang 패키지에 존재하는 클래스는 그냥 사용하시면됨니다.

	public static void main(String[] args) {

		// 1~45 번호 생성 //생성자호출

		int num[] = new int[6]; // 번호를 저장할 공간

		Random random = new Random();

		Scanner sc = new Scanner(System.in);
		System.out.printf("몇줄? ");
		int n = sc.nextInt();
		
		Date date=new Date();
		System.out.println(date.getDate());
		

		for (int l = 0; l < n; l++) {
			for (int i = 0; i < 6; i++) {
				// 번호생성 후 저장
				int temp = random.nextInt(45) + 1;
				// 중복검사

				boolean check = false;
				for (int j = 0; j < i; j++) {
					if (temp == num[j]) {
						// System.out.println("중복발생");
						check = true;
						break;
					}
				} // for j

				if (check == true) {
					i--;
					continue;
				}
					// 번호저장
				num[i] = temp;
			} // for i
				// 번호출력

			// 정렬
			for (int c = 5; c > 0; c--) {

				for (int i = 0; i < c; i++) {
					if (num[i] > num[i + 1]) {
						// 위치변경
						int temp = num[i];
						num[i] = num[i + 1];
						num[i + 1] = temp;
					}
				}
			}

			for (int i = 0; i < 6; i++) {
				System.out.printf("%2d ", num[i]);
			}
			System.out.println();
		}//for l

	}// main()

}
