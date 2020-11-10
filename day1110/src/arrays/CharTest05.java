package charater;

public class CharTest05 {

	public static void main(String[] args) {
		//문자열른 문자열1.equals(문자열2)
		
		
		String str1="안녕하세요";//문자열 상수
		String str2="안녕하세요";
		String str3="안녕하세요";
		String str4=new String("안녕하세요");
		
		if(str1==str2) {
			System.out.println("같습니다.");
		} else {
			System.out.println("다름니다.");
		}
		
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		System.out.println(str3.hashCode());
		System.out.println(str4.hashCode());
		
		
		
		
	}

}
