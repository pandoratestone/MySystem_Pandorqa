package collections;

public class CC extends BB{

	@Override
	void m1() {
	System.out.println(" CCCCCCCCCCCCC"+i);
//		super.m1();
	}

	public static void main(String[] args) {

		AA c=new BB();
		c.m1();
	
	}

}
