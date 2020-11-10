package object;

public class Point {
	//맴바필드
	int x;
	int y;

	// 생성자 이름은 반드시 클래스이름과 일치
	// 모든클래스에는 생성자가 반드시 존재해야합니다.
	// default생성자는 생략하여 표현할수 있다
	//단 , 오버로딩표현을 적용하면 default무시
	//default 생성자를 사용하려면 반드시 명시해야합니다.
	// 일반적으로 필드의 초기화 당담
	public Point() {
		x = 10;
		y = 10;
	}
	
	//int x
	//생성자를 오버로딩
	//생성자를 중북해서 표현이 가능합니다.
	//파라미터 존재또는 ,개수 , 타입등을 구분이 가능하게 표현햐야한다.

	public Point(int x) {
		this.x=x; // this는 클레스
		y=100;		
	}
	public Point(int x,int y) {
		this.x=x; 
		this.y=y;
	}
}
