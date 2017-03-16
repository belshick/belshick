#include<stdio.h>
int main()
{

    int a,b,c;
    scanf("%d",&a);
    scanf("%d",&b);
    scanf("%d",&c);
    if(a>b&&a>c)
    {

        printf("A is greater");
    }
    else if(b>c&&b>a)
    {

        printf("B is greater");
    }
    else{
        printf("C is greater");
    }
}
