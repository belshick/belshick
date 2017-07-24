package Hunder;

import java.util.Scanner;

public class Set6Pro53 {

	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the string");
		String str=s.next();
		int slen=str.length();
		System.out.println("enter the length of the string : ");
		int len=s.nextInt();
		for(int i=0;i<slen-1;i++)
		{
			System.out.println(str.substring(0,len-1)+""+str.charAt(i+1));
		}

	}

}
