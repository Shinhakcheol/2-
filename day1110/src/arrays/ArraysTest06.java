package Arrays;

import java.util.Scanner;

public class ArraysTest06 {

	public static void main(String[] args) {
		
		int score[]=new int[3];
		
		Scanner scanner=new Scanner(System.in);
					
		//System.out.print("국어: ");
		//score[0]=scanner.nextInt();
		//System.out.print("영어: ");
		//score[1]=scanner.nextInt();
		//System.out.print("수학: ");
		//score[2]=scanner.nextInt();
		
		
		String s[]= {"국어","영어","수학"};
		for(int i=0;i<3;i++) {
			System.out.print(s[i]+" : ");
			score[i]=scanner.nextInt();	
		}
		
		//출력
		//System.out.println(s[0]+" : "+score[0]);
		//System.out.println(s[1]+" : "+score[1]);
		//System.out.println(s[2]+" : "+score[2]);
		
		for(int i=0;i<3;i++) {
			System.out.println(s[i]+" : "+score[i]);
			
		}
	
	
	}

}
