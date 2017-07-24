package Player;
import java.util.*;
public class Set2Pro12 {

	
	public static void main(String[] args) {
		Scanner a=new Scanner(System.in);
		int num=a.nextInt();
		int[] arr=new int[num];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=a.nextInt();
		}
		System.out.println("enter the key value");
		int k=a.nextInt();
		for(int i=arr.length-k;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		for(int i=0;i<=k;i++)
		{
			System.out.println(arr[i]);
		}
	}

}
