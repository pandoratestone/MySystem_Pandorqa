package snippet;

import java.util.Scanner;

public class GivenNumberFactioral {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		long isfactroialNum=sc.nextLong();
		
		long data=1;
		
		for(long j=1;;j++){
			data=data*j;
			if(data==isfactroialNum){
				System.out.println("Provided Number"+isfactroialNum+" is Factiorial of "+j);
				break;
			}
			if(data>isfactroialNum){
				
				System.out.println("Provided number "+isfactroialNum+" is not factiorial "+data+" Current factiorial Number: "+j);
				break;
			}
		}
		
		
	}

}
