package loop;

public class printStar {

	public static void main(String[] args) {
		int n=5,i,j,c=0;
		int b=n;
		for(i=1;i<=n;i++)
		{
			for(j=b;j>0;j--)
			{
				System.out.print("*");
			
				
			}
			b--;
		
		System.out.print(" ");
		for(j=1;j<=n-i;j++)
		{
			System.out.print("*");
		}
		System.out.print("*");
		
			System.out.println();
		}	
		

	}

}
