package loop;

public class splitword {

	public static void main(String[] args) {
		String a="hello world";
		int in=a.indexOf(" ");
		int len=a.length();
		System.out.print(a.substring(in+1,len)+" "+a.substring(0,in));
		
		
	}

}
