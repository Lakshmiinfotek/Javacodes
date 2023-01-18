package intcodes;

public class Fibseries {

	public static void main(String[] args) {
		int n1=0;
		int n2=1;
		int sum=0;
		System.out.println("The sequence of numbers:"+ n1+" "+n2);
		
			for (int i=2;i<15;i++)
			{
			sum=n1+n2;
			System.out.println("The sum of the number is:"+ sum);
			n1=n2;
			n2=sum;
			
			}
		
		

	}

}
