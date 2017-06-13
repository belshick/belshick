package loop;
public class countvowels {

	public static void main(String[] args) {
		String a="Newyork";
		char c[]=a.toCharArray();
		int l=a.length();
		int count=0;
		for(int i=0;i<l;i++)
		{
			if(c[i]=='a'||c[i]=='e'||c[i]=='i'||c[i]=='o'||c[i]=='u'||c[i]=='A'||c[i]=='E'||c[i]=='I'||c[i]=='O'||c[i]=='u')
			{
				count++;
			}
		}
		System.out.println(count);

	}

}
