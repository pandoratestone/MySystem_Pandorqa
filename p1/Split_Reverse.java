package p1;

import java.net.StandardProtocolFamily;
import java.util.Scanner;

import javax.swing.plaf.synth.SynthSeparatorUI;


public class Split_Reverse {
	

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		String strInput=sc.nextLine();
		String strOutputString="";
		String[] strSplit=strInput.split(" ");
		for(int i=0;i<strSplit.length;i++){
			
			String strArrayvalue=strSplit[i];
			
			for(int j=strArrayvalue.length()-1;j>=0;j--){
			
				char c=strArrayvalue.charAt(j);
				strOutputString=strOutputString+(Character.toString(c));
			}
			strOutputString=strOutputString+" ";
		}
		System.out.println("Output String : : "+strOutputString);
		
	}
	

	
}