package Hunter;
import java.util.Scanner;
public class Set11Pro103 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int num=s.nextInt();
		int rem=0;
		int n=0;
		while(num>0)
		{
		     n=num%10;
			 rem=rem+(n*n*n*n);
			 num=num/10;
		}
		System.out.println(rem);
	}

	}


