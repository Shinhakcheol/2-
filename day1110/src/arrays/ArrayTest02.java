package arrays;

public class ArrayTest02 {

	public static void main(String[] args) {
		
		
		//영어 수학 컴퓨터
		//총점 , 평균 , 반석차
		String[] subjecName= {"국어","수학","컴퓨터"};
		//국 ,수 ,컴 , 총점 , 석차
		
		int recode[][]= {
				{80,90,100,0,1},
				{70,90,90,0,1},
				{88,99,100,0,1},
				{75,85,95,0,1},
		};
		double avg[]=new double[4];
		
		for(int i=0;i<recode.length;i++) {
			//총점 계산
			for(int j=0;j<3;j++) {
				recode[i][3] += recode[i][j];
				//rank[i][4]=1;
			}
			//평균계산
			avg[i] = recode[i][3] / 3.0;		
		}
		
		
		
		
		//출력
		
		for(int i=0;i<recode.length;i++) {
			for(int j=0;j<5;j++) {
				System.out.print(" "+recode[i][j]);	
			}
			System.out.println(avg[i]);
		}
	
		
	}
}
