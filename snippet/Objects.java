package snippet;

class A{
	
	void m1(){
		System.out.println("class A.....");
	}
	
}


class B extends A{
	
	void m1(){
		System.out.println("class B.....");
	}
	
}



public class Objects {

	public static void main(String[] args) {
		
		A a=new A();
		a.m1();
		A a1=new B();
		a1.m1();
		
		B b=new B();
		b.m1();
		
	}

}
