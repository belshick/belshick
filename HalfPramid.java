package loop;
import java.util.Scanner;
public class HalfPramid {

	public static void main(String[] args) {
		Scanner a=new Scanner(System.in);
		
		int n=a.nextInt();
				int i,j;
		for(i=1;i<=n;i++)
		{
			for(j=1;j<=n-i;j++)
			{
				System.out.print(" ");
			}
			for(j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			if(i!=1)
			{
				for(j=1;j<=i-1;j++)
				{
					System.out.print("*");
				}
			}
			System.out.println();
		}

	}

}
