package p1;

import java.io.FileNotFoundException;

import accessModifiers.Types;

public class Fibonacci_String {
	
	void m1(){
		Types tp=new Types();
		tp.setA(20);
		System.out.println("Finalize......"+tp.getA());
		
	}
	
	public static void main(String[] args) {
		
		
		
		
		
		String strInput="HelloIJKLGHOLsbvdrfdsds vdfgh";
		int a=0;
		int b=1;
		int sum=0;
		for(int i=0;;i++){	
			sum=a+b;
			if(sum>=strInput.length()){
				break;
			}
			a=b;
			b=sum;
			System.out.println(sum+" "+ strInput.charAt(sum));
		}
		Fibonacci_String f1=new Fibonacci_String();
				f1.m1();
//		Fibonacci_String f2=new Fibonacci_String();
		
	}

}
