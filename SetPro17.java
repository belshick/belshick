package Pro;
import java.util.*;
public class SetPro17 {

	
	public static void main(String[] args) {
	Scanner a=new Scanner(System.in);
	System.out.println("enter the first number : ");
	int num1=a.nextInt();
	int dummy=num1;
	System.out.println("enter the second number : ");
	int num2=a.nextInt();
	int[] arr=new int[10];
	int ans=123;
	while(dummy>0)
	{
		arr[0]=dummy%10;
		ans*=arr[0];
		dummy=dummy/10;
		
	}
	if(num2==ans)
	{
		System.out.println(num1+" is seed to  "+num2);
	}
	else
	{
		System.out.println(num1+" is not seed to "+num2);
	}

	}

}
