package loop;
import java.util.Scanner;
public class Stringcompare {

	public static void main(String[] args) {
	Scanner a=new Scanner(System.in);
	String s1=a.next();
	String s2=a.next();
	char c1[]=s1.toCharArray();
	char c2[]=s2.toCharArray();
	int l1=s1.length();
	int l2=s2.length();
	int  t=0;
	if(l1==l2)
	{
		for(int i=0;i<l1;i++)
		{
			if(c1[i]==c2[i])
			{
				 t=1;
			}
			
		}
		if(t==1)
		{
			System.out.println(s1+" equal to "+s2);
			
		}
		else
		{
			System.out.println(s1+" not equal  to "+s2);
		}
		
	}
	

	}

}
