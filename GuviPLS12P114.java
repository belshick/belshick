package StringWarmup;
import java.util.Scanner;
public class GuviPLS12P114 {

	public static void main(String[] args) {
	Scanner a=new Scanner(System.in);
	String str1=a.next();
	String str2=a.next();
	int len1=str1.length();
	int len2=str2.length();
	if(len1==len2)
	{
		System.out.println(str1+""+str2);
		
	}
	if(len1!=len2)
	{
		System.out.println(str1.substring(len1-len2,len1)+""+str2.substring(0,len2));
	}
	

	}

}
