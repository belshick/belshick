package Hunder;
import java.util.*;
public class Set2Pro11 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		 String a=sc.nextLine();
		 String arr[]=a.split(" ");
		 for(int i=0;i<arr.length;i++) {
			 StringBuffer sb=new StringBuffer(arr[i]);
			 sb.reverse();
			 arr[i]=sb.toString();
		 }
		 String b=String.join(" ", arr);
		 System.out.println(b);

	}

}
