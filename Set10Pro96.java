package hunter;
import java.util.Scanner;
public class Set10Pro96 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String  a=s.next();
		int  len=a.length();
		char[] c=a.toCharArray();
		for(int i=0;i<a.length()-1;i++)
		{
			if(c[i]!='a')
			{
			int as=(int)(c[i]);
			c[i]=(char)(as-1);
			System.out.print(c[i]);
			}
			else
			{
			int ascii=(int)c[i];
			c[i]=(char)(ascii+25);
			System.out.print(c[i]);
			}
			
			
			
		}
		System.out.print(c[len-1]);

	}

	
}
