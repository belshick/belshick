#include<stdio.h>
#include<conio.h>
int main()
{

    int num,count=0;
    printf("Enter the number:\n");
    scanf("%d",&num);

    while(num>0)
    {

        num/=10;
        count++;
    }
    printf("%d",count);
}
