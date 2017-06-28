package guvi;
import java.util.Scanner;
public class HunterS6P55 {

	public static void main(String[] args) {
		Scanner a=new Scanner(System.in);
		System.out.println("enter the size of an array:");
		int n=a.nextInt();
		int arr[]=new int[n];
		System.out.println("enter the D element:");
		int d=a.nextInt();
		for(int i=0;i<n;i++)
		{
			arr[i]=a.nextInt();
		}
		for(int i=d;i<n;i++)
		{
			System.out.print(arr[i]);
		}
		for(int i=0;i<d;i++)
		{
			System.out.print(arr[i]);
		}

	}

}
