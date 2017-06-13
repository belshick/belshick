package loop;
import java.util.Scanner;
public class SimpleInterest {

	public static void main(String[] args) {
		Scanner a=new Scanner(System.in);
		System.out.println("Enter the principal amount:");
		float p=a.nextFloat();
		System.out.println("Enter the rate of interest:");
		float n=a.nextFloat();
		System.out.println("Enter the period of time:");
		float r=a.nextFloat();
		float ans=p*n*r/100;
		System.out.println("simple interest"+ans);
		

	}

}
