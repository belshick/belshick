#include<stdio.h>
int main()
{
int n,i,j,ab=1;
printf("enter the number");
scanf("%d",&n);
for(i=1;i<=n;i++)
		{
			for(j=1;j<=i;j++)
			{
				printf("%d",ab);
				ab++;
			}
			printf("\n");
		}
}
