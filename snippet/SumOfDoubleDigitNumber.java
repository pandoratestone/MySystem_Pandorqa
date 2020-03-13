package snippet;

import java.util.Scanner;

public class SumOfDoubleDigitNumber {
	public int sum;
	
	public void sum(String input){
		sum=0;
		
		String[] str=input.replaceAll("[a-zA-Z]", "").split("");
		for(int i=0;i<str.length;i++){
			int j=Integer.parseInt(str[i]);
			sum=sum+j;
		}
		String outputSum=String.valueOf(sum);
		System.out.println("Provided Number: "+input+" Sum of that number: "+sum+" outputSum.length(): "+outputSum.length());
		if(outputSum.length()==1){
			System.out.println("Fianl Output :**Provided Number: "+input+" Sum of that number: "+sum);
		}
		else{
			sum(outputSum);
		}
		
		
	}

	public static void main(String[] args) {
		
		System.out.println("Please provide the Number");
		Scanner sc=new Scanner(System.in);
		String strInput=sc.next();
		SumOfDoubleDigitNumber obj=new SumOfDoubleDigitNumber();
		obj.sum(strInput);
		System.out.println(obj.sum);

	}

}
