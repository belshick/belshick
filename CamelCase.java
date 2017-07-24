package Practice;
import java.util.*;
public class CamelCase {

	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter any String");
		String str=s.nextLine();
		String[] c=str.split("\\s");
		//System.out.println(ch);
		int count=0,count1=0;
		int len = c.length;

		for(String Str1:c)
		{
		      if(Character.isUpperCase(Str1.charAt(0))){
			       count++;
		}
		else
		{
			   count1++;
		}
		      
		if(count==c.length)
			System.out.println("the given string is CamelCase");
		else
		System.out.println("the given string is Not a CamelCase:");
		
	    		

	}

}
}
