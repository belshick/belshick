#include<stdio.h>
#include<conio.h>
int main()
{

    int y;
    printf("\n enter the year");
    scanf("%d",&y);
    if(y%4==0&&y%100!=0||y%400==0)
    {

        printf("\n leap year");
    }
    else
    {

        printf("\n not leap year");
    }
}
