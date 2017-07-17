package Pro;

public class Set7Pro61 {

	public static void main(String[] args) {
		String a="code";
		String b="kata";
		int len1=a.length();
		int len2=b.length();
		char[] c1=a.toCharArray();
		char[] c2=b.toCharArray();
		for(int i=0;i<len1;i++)
		{
			int ans=(int)(c1[i]);
			c1[i]=(char)(ans+10);
			System.out.print(c1[i]);
			
			
		}
		System.out.print(" ");
		for(int j=0;j<len2;j++)
		{
			if(j==0 || j==len2-1)
			{
				System.out.print(c2[j]);
				
			}
			else if(c2[j]=='t')
			{
				int ans1=(int)(c2[j]);
				c2[j]=(char)(ans1-16);
				
				System.out.print(c2[j]);
			}
			else
			{
				int ans2=(int)(c2[j]);
				c2[j]=(char)(ans2+10);
				System.out.print(c2[j]);
			}
			
			
		}
		

	}

}
