package charater;

public class CharTest06 {

	public static void main(String[] args) {
		String str1="abcde";
		String str2="abcde";
		
		//문자열중 힌글자만 추출
		System.out.println(str1.charAt(1));
		
		//같으면 0 다르면 0이 아닌 수(앞글자 - 뒷글자)
		System.out.println(str1.compareTo(str2));
		
		if(0==str1.compareTo(str2)) {
			
		}
		String path="https://www.the.com/cho/aaa/java";
		String[] strs=path.split("/");
		
		//for(int i=0; i<strs.length;i++) {
			//System.out.println(strs[i]);
		//}
			System.out.println("마지막 문자열 : "+ strs[strs.length-1]);
			
			
			String strn="1234";
			int num=Integer.parseInt(strn);
		

	}

}
