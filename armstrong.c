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
        r=r+b*b*b;
        t/=10;
}
if(a==r)
{
     printf("%d is armstrong number",a);
}
else{
     printf("%d is not armstrong number",a);
}
return 0;
}

