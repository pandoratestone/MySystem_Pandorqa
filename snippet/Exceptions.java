package snippet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Exceptions {

	public static void main(String[] args)  {
		
		try {
			FileInputStream fis=new FileInputStream("");
			Thread.sleep(2000);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("File not found...........");
			e.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		String s1=new String ("hello");
		String s2=new String ("hello");
		System.out.println("Result: "+(s1==s2));
		System.out.println("Result: "+(s1.equals(s2)));
		
		String str="abc";
		System.out.println("Current mii: "+System.currentTimeMillis());
		str=str+"Def....";
		System.out.println("After  Current mii: "+System.currentTimeMillis());
		StringBuffer strb=new StringBuffer("abc");
		System.out.println("StringBuffer : "+System.currentTimeMillis());
		strb.append(" Hello");
		System.out.println("StringBuffer After: "+System.currentTimeMillis());
		System.out.println(strb);
		
		
		
	}

}
