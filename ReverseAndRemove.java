package StringWarmup;
import java.util.Scanner;
public class ReverseAndRemove {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String a=s.next();
		StringBuffer b=new StringBuffer(a);
		String c=b.reverse().toString();
		System.out.println(c.replaceAll("[aeiouAEIOU]",""));

	}

}
