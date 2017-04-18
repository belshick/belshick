package belshick;
import java.util.Scanner;
public class leavernot {

	public static void main(String[] args) {
		Scanner a=new Scanner(System.in);
		String s=a.nextLine();
		if(s.equals("sunday")||s.equals("saterday"))
		{
			System.out.println("false");
		}
		else
		{
			System.out.println("true");
		}


	}

}

