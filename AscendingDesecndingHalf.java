package belshick;

import java.util.Arrays;
public class AscendingDesecndingHalf {

	public static void main(String[] args) {
		int arr[]=new int[]{4,6,2,3,8,12,14,9};
		int aa=arr.length;
		int c=aa/2;
		int i=0;
		Arrays.sort(arr);
		
		for(int array : arr)
		{
			
		}
		for(i=0;i<c;i++)
		{
			System.out.print(arr[i]+",");
		}
		for(i=aa-1;i>=c;i--)
		{
			
			System.out.print(arr[i]);
			if(i!=c)
			{
				System.out.print(",");
			}
			
		}

	}

}
