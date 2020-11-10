package object;

public class Test02 {

	public static void main(String[] args) {

		Point p=new Point();
		p.x=10;
		p.y=20;
		
		System.out.printf("[ x , y ] : [ %d , %d ]\n",p.x,p.y );
		
		Point p2=new Point();
		p2.x=100;
		p2.y=200;
		System.out.printf("[ x , y ] : [ %d , %d ]\n",p2.x,p2.y );
		
		Point p3=new Point();
		System.out.printf("[ x , y ] : [ %d , %d ]\n",p3.x,p3.y );
		
		Point p4=new Point(1000);
		System.out.printf("[ x , y ] : [ %d , %d ]\n",p4.x,p4.y );
		
		
	}

}
