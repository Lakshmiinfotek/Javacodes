package intcodes;

public class Primenumberornot {

	public static void main(String[] args) {
		int num =50;
		int count =0;
		if(num>1)
		{
			for(int i=1;i<=num;i++)
			{
				if(num%i==0)
					count++;
			}
							
			if(count==2)
			{
				System.out.println("the number is prime");
			}
			else
			{
				System.out.println("The number is not a primenumber");
			}
		 }
		
	else
{
	System.out.println("The number is not a palindrome");
}
	}
}