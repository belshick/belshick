package loop;
import java.util.Scanner;
public class workingrnot {

	public static void main(String[] args) {
		Scanner a=new Scanner(System.in);
		System.out.println("Enter the day");
		String d=a.next();
		if(d.equals("sunday")||d.equals("saterday"))
		{
			System.out.println("false");
		}
		else
		{
			System.out.println("true");
		}
		
	}

}
