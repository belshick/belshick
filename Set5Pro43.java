package Hunder;
import java.util.*;
public class Set5Pro43 {

	
	public static void main(String[] args) {
		Scanner a=new Scanner(System.in);
		System.out.println("Enter string");
		String str=a.next();
		String s=new String();
		int len=str.length();
		int sum=0;
		int index=0;
		for(int i=0;i<len;i++)
		{
			if(Character.isDigit(str.charAt(i)))
			{
				s=str.substring(i,i+1);
				sum=sum*10+Integer.parseInt(s);
			}
			else if(sum>0)
			{
				if(sum<100)
				{
				for(int j=0;j<sum;j++)
				{
					System.out.print(str.substring(index,index+1));
				}
				}
				index=i;
				sum=0;
			}
			if(i==len-1&&sum<=99)
			{
				for(int j=0;j<sum;j++)
				{
					System.out.print(str.substring(index,index+1));
				}
			}
		}
		a.close();
	}

}
