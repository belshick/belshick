#include<stdio.h>
#include<conio.h>
int main()
{

    int a,b,i;
    printf("\n enter the 2 number a to b");
    scanf("%d%d",&a,&b);
    for(i=a;i<=b;i++)
    {

        if(i%2==0)
        {

            printf("\t%d",i);
        }
    }
}
