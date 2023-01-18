package intcodes;
//all characters printing
public class allcharacters2 {
public static void main(String[] args) {
	String str = "Hellothisismypractice";
	int strl=str.length();
	System.out.println("The length of a string is:"+strl);
	//System.out.println("The first character in the string:"+ str.charAt(0));
	//System.out.println("The last character in the string:"+ str.charAt(strl-1));
	for(int i=0;i<str.length();i++)
	{
		if(str.charAt(i)!=0)
	
	System.out.println("The index number is:"+ i);
	System.out.println("The string at this position is:"+ str.charAt(i));
}
}

}



