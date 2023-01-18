package intcodes;

import java.util.Scanner;
//count the words like " I am happy" --3 words

public class Countword2 {

	public static void main(String[] args) {
		/*System.out.println("Enter the text");
 Scanner sc = new Scanner (System.in);
 String s =sc.nextLine();
 int count = 1;
 for( int i=0;i<s.length()-1;i++)
 {
   if((s.charAt(i)==' ')&& (s.charAt(i+1)!=' '))
     {
		 count++;
     }
 }
	
        System.out.println(count);*/
		
		System.out.println("Enter the text");
		Scanner sc = new Scanner (System.in);
		String s = sc.nextLine();
		int count =1;
		for(int i =0; i<s.length()-1;i++)
		{
		if((s.charAt(i)==' ')&&(s.charAt(i+1)!=' '))
		{
		count++;
		}
		}
		System.out.println(count);
		}
	
	}
	

