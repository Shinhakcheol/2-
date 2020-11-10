package lotto;

import java.util.Arrays;
import java.util.Random;

public class LottoTest01 {
	// java.lang 패키지에 존재하는 클래스는 그냥 사용하시면됨니다.

	public static void main(String[] args) {

		// 1~45 번호 생성 //생성자호출

		int num[] = new int[6]; // 번호를 저장할 공간

		Random random = new Random();

		for (int i = 0; i < 6; i++) {
			// 번호생성 후 저장
			int temp = random.nextInt(45) + 1;
			// 중복검사

			boolean check = false;
			for (int j = 0; j < i; j++) {
				if (temp == num[j]) {
					//System.out.println("중복발생");
					check = true;
					break;
				}
			}

			if (check == true) {
				i--;
				continue;
			}
			// 번호저장
			num[i] = temp;
		}
		// 번호출력

		for (int i = 0; i < 6; i++) {
			System.out.printf("%2d ", num[i]);
		}
		
		//정렬
		System.out.println();
		System.out.println(Arrays.toString(num));
		
		//Arrays.sort(num);
		//System.out.println(Arrays.toString(num));

	}

}
