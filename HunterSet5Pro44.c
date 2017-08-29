#include<stdio.h>
int main()
{
int m,n,a=1,b=0;
int c[500]={0,1};
c[0]=3;
c[1]=4;
for(m=0;m<500;m+1)
{
c[++b]=(c[m]*10)+3;
c[++b]=(a*10)+4;
}
scanf("%d",&n);
printf("%d",c[n-1]);
return 0;
}