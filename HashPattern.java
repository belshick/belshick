package Player;
import java.util.*;
public class HashPattern {

	
	public static void main(String[] args) {
		Scanner a=new Scanner(System.in);
		int num=a.nextInt();
		for(int i=0;i<num;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print("#");
			}
			System.out.println();
		}
	}

}
