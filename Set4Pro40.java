package hunter;
import java.util.*;
public class Set4Pro40 {

	public static void main(String[] args) {
		
    Scanner a =new Scanner(System.in);
    int num=a.nextInt();
    int ans=0,sum=0;
    while(num>0)
    {
    	ans=num%10;
    	sum+=ans;
    	num/=10;
    }
   
    if(num==sum)
    {
    	System.out.println("the given number"+num+"is palindrom" );
    }
    else
    {
    	System.out.println("the given number"+num+"is not a aplindrom");
    }
	}

}
