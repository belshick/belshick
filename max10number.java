package b;

import java.util.Scanner;

public class max10number {

	public static void main(String[] args) {
Scanner a=new Scanner(System.in);
		
		int num=a.nextInt();
		int arr[]=new int[num];
		for(int i=0;i<num;i++)
		{
			arr[i]=a.nextInt();
		}
        int max=arr[0];
        for(int i=0;i<num;i++)
        {
        	if(arr[i]>max)
        	{
        		max=arr[i];
        	}
        }
        System.out.println("maximum value :"+max);
	}

}
