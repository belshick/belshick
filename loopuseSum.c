#include<stdio.h>
#include<conio.h>
int main()
{

    int num,sum=0,i;
    printf("Enter the number:\n");
    scanf("%d",&num);
    for(i=1;i<=num;i++)
    {

        sum+=i;
    }
    printf("The sum is:%d",sum);
}
