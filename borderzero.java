package loop;

import java.util.Scanner;

public class borderzero {

	public static void main(String[] args) {
		Scanner a=new Scanner(System.in);
		
		int n=a.nextInt();
		int i,j;
		for(i=1;i<=n;i++)
		{
			for(j=1;j<=n;j++)
			{
				if(i==1 ||i==n ||j==1 ||j==n) 
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
				
			
		}System.out.println("");

	}

}
}
