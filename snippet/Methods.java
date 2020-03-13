package snippet;


public class Methods implements HelloInterface{

	
	void m1(long l,float f){
		System.out.println("Hello");
	}
	void m1(int i,double d){
		System.out.println("H11");
	}
	
	public static void main(String[] args){
		Methods m=new Methods();
//		m.m1(1000, 10.0f);
	}
	@Override
	public void m1() {
		// TODO Auto-generated method stub
		
	}
}
