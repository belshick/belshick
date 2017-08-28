package Pro;

public class Set4Pro37 {
	public int howManyPrimeNumsWillGet(int input1){
		// Write code here...
		if(input1>0){
		int k[]=new int[]{1,3,5};
		int tmp=0,n=0;
		for(int i=k.length-1;i>=0;i--){
			for(int j=1;k[i]*j<=input1;j++){
				if((n=howManyPrimeNumsWillGet(input1-k[i]*j))!=-1||(input1-k[i]*j)==0){  
					if(n==-1)
					  	tmp=j;
					  else
						tmp=tmp+j+n; 
						i=0;
						break;
					}
			}
		}
		if(tmp!=0)
			return tmp;
		}
		return -1;
	}
	
	public static void main(String[] args) {
		Set4Pro37 obj=new Set4Pro37();
    	System.out.println(obj.howManyPrimeNumsWillGet(11));
	}

}
