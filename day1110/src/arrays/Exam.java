package object;

public class Exam {
	
	String name="aaa";
	
	int kor;
	int eng;
	int mat;
	int tot;
	double avg;
	int rank;
	
	
	
	
	//기능을 추가: 메서드
	
	
	//생성자 :일반적으로 멤버필드 초기화
	public Exam() {
		name="aaa";
		kor=100;
		eng=90;
		mat=80;
		tot=kor+eng+mat;
		avg=tot/3.0;
		rank=1;	
	}
	public void calcTot() {
		tot=kor+eng+mat;
	}
	
	public Exam(String name, int kor, int eng, int mat) {
		super();
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
		calcTot();
		
		
		//tot=kor+eng+mat;
		avg=tot/3.0;
		rank=1;	
		
		
	}




	@Override
	public String toString() {
		return "Exam [name=" + name + ", kor=" + kor + ", eng=" + eng + ", mat=" + mat + ", tot=" + tot + ", avg=" + avg
				+ ", rank=" + rank + "]";
	}
	

}
