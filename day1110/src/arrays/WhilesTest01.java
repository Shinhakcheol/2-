package loops;

public class WhilesTest01 {

	public static void main(String[] args) {
		
		int i=5;//초기값
		
		while(i>0) {//조건문  false일떄 탈출
			
			System.out.println("while");
			
			i--;//증감
			
		}
		
		while(true) {
			System.out.println("반복영역");
			if(true) {
				break;
			}
		}
		
	}

}
