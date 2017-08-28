package Pro;

import java.util.Arrays;
import java.util.Scanner;

public class Set1Pro2 {

	public static void tointegerarray(int data,int numodigit)
	{
	String arrayt =Integer.toString(data);
	int[] intar=new int[arrayt.length()];
	for(int i=0;i<arrayt.length();i++)
	{
		intar[i]=arrayt.charAt(i)-'0';
	}
	Arrays.sort(intar);
	for(int j=0;j<arrayt.length()-numodigit;j++)
	{
		System.out.println(intar[j]);
	}
	}
	public static void main(String[] args) throws java.lang.Exception
	{
		Scanner obj= new Scanner(System.in);
		int data=obj.nextInt();
		int digitstoberemoved = obj.nextInt();
		if(data>0&&digitstoberemoved>0)
		tointegerarray(data,digitstoberemoved);
		else 
		System.out.println("give correct input");
		
		
	}

}
