package Hunder;
import java.util.*;
public class Set3Pro28 {

	public static void main(String[] args) {
	Scanner a=new Scanner(System.in);
	
	String str=a.next();
	String st="";
	int i,j;
	int n=str.length();
	char[] ch=str.toCharArray();
	for( i=0;i<n;i++){
		for(j=i+1;j<n;j++){
			if(ch[i]==ch[j]){
				ch[j]='\0';
		}
	}
	}
	for(i=0;i<n;i++){
		if(ch[i]!='\0'){
			st=st+ch[i];
		}
	}
		System.out.println(st);
		
	}
	

	}


