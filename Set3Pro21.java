package Pro;

public class Set3Pro21 {

	
	public static void main(String[] args) {
		int[] arr=new int[]{1,1,1,1,1};
		int len=arr.length;
		int sum=0,sum1=0;
		int avg=0,avg1=0;
		int ans=(len/2)+1;
		int ans1=(len/2);
		if(len%2!=0)
		{
		  
		   for(int i=0;i<ans;i++)
		   {
			    sum+=arr[i];
			    avg=sum/ans;
		   }
		/*System.out.println("first half sum is"+sum);
		System.out.println("first half average"+avg);
		System.out.println();*/
		
		for(int j=ans;j<len;j++)
		{
			
			sum1+=arr[j];
			int len1=len-ans;
			avg1=sum1/len1;
			
		}
		//System.out.println("second half sum is"+sum1);
		//System.out.println("second half average is"+avg1);
		int result;
		int result1;
		if(avg==avg1)
		{
			for(int i=0;i<ans;i++)
			{
				result=arr[i];
				System.out.print(result);
				
			}System.out.print(" ");
			for(int j=ans;j<len;j++)
			{
				result1=arr[j];
				System.out.print(result1);
				
			}
		}
		else
		{
			System.out.println();
			System.out.println("not posible");
		}
		
		}
		
		
		
		
		
		if(len%2==0)
		{
			 
			   for(int i=0;i<ans1;i++)
			   {
				    sum+=arr[i];
				    avg=sum/ans1;
			   }
			/*System.out.println("first half sum is"+sum);
			System.out.println("first half average"+avg);
			System.out.println();*/
			
			for(int j=ans1;j<len;j++)
			{
				
				sum1+=arr[j];
				int len1=len-ans1;
				avg1=sum1/len1;
		}
			/*System.out.println("second half sum is"+sum1);
			System.out.println("second half average is"+avg1);*/
			int result;
			int result1;
			if(avg==avg1)
			{
				for(int i=0;i<ans;i++)
				{
					result=arr[i];
					System.out.print(result);
					
				}System.out.print(" ");
				for(int j=ans;j<len;j++)
				{
					result1=arr[j];
					System.out.print(result1);
					System.out.println();
				}
			}
			
			else
			{
				System.out.println("not posible");
			}

	}
	}

}
