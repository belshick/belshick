package hunter;
import java.util.*;
public class Set4ProNo40 {

	public static void main(String[] args) {
		
    Scanner a =new Scanner(System.in);
    int num=a.nextInt();
    int ans=0,sum=0;
    int num1=num;
    while(num1>0)
    {
    	ans=num1%10;
    	sum+=ans;
    	num1/=10;
    }
   
    if(num==sum)
    {
    	System.out.println("the given number "+num+" is palindrom" );
    }
    else
    {
    	System.out.println("the given number"+num+"is not a aplindrom");
    }
	}

}
