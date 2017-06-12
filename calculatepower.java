package loop;
import java.util.Scanner;
public class calculatepower {

	public static void main(String[] args) {
		Scanner a=new Scanner(System.in);
		
		System.out.println("enter the number");
		int n=a.nextInt();
		System.out.println("enter the power");
		int p=a.nextInt();
		a.close();
		int ans=1,i;
		for(i=1;i<=p;i++)
		{
		  	ans*=n;
		  	
		}
		System.out.println("The given"+ n+"^"+p +"is:"+ans);

	}

}
