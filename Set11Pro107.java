package Player;
import java.util.Scanner;
public class Set11Pro107 {

	public static void main(String[] args) {
	Scanner a=new Scanner(System.in);
	String str=a.next();
	if(str.charAt(0)=='-'){
		System.out.println(str.substring(1,str.length()));
	}
	else
	{
		System.out.println("-1");
	}
     
	}

}
