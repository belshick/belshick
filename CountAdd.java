package loop;
import java.util.Scanner;
public class CountAdd {

	public static void main(String[] args) {
	Scanner a=new Scanner(System.in);
	int n=a.nextInt();
	int count=0;
	for(int i=1;i<=n;i++)
	{
		if(i%2!=0)
		{
			count+=i;
		}
	}
	System.out.println(count);

	}

}
