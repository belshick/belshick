package Hunder;
import java.util.*;
public class Set5Pro48 {

	
	public static void main(String[] args) {
		Scanner a=new  Scanner(System.in);
		System.out.println("enter the first string:");
		String str1=a.next();
		System.out.println("enter the second string:");
		String str2=a.next();
		int ans=0;
		if(str1.contains(str2))
		{
			ans=str1.indexOf(str2);
			System.out.println(ans);
		}
		else
		{
			ans=-1;
			System.out.println(ans);
		}

	}

}
