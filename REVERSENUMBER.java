package b;

import java.util.Scanner;

public class REVERSENUMBER {

	public static void main(String[] args) {
		Scanner a=new Scanner(System.in);
        int num,rev=0,rem;
        num=a.nextInt();
        while(num!=0)
        {
        	rem=num%10;
        	rev=rev*10+rem;
        	num/=10;
        }
        System.out.println(rev);

	}

}
