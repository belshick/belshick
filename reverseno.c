#include<stdio.h>
int main()
{

    int a,t,b,r=0;
    printf("Enter the number:");
    scanf("%d",&a);
    t=a;
    while(t>0)
    {

        b=t%10;
        r=r*10+b;
        t/=10;
}
printf("The reverse number of %d",r);
return 0;
}
