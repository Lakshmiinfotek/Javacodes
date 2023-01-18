package intcodes;

public class Primeornot {
public static void main(String[] args) {
	//Natural number >1
	//which has 2 factors
	//example: 19 is having only 1 and 19
	int num=6;
	int count =0;
	if(num>1)//if a numberitself is not greaater than 1 then straightly executes the else not a palindrome.
	{
	for(int i=1;i<=num;i++)//Here checking number is range means 1 to num(3) has 2 multiples only 
	   {
		if (num%i==0)
			count++;
	    }
		
			if(count==2)
	    {
			System.out.println("The number is  prime");
	     }
			else
	    {
			System.out.println("The number is not prime");
	    }
    }
          else
	
	    {
			System.out.println(" this is not a palindromw");
	    }
}
}
