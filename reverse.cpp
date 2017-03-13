#include<stdio.h>
#include<conio.h>
int main()
{
	int n,rem,reverse=0;
	scanf("%d",&n);
	while(n)
	{
		rem=n%10;
		reverse=reverse*10+rem;
		n=n/10;
	}
	printf("the reverse no:%d",reverse);
	return 0;
}
