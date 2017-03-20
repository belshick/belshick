#include<stdio.h>
int main()
{

    int n,i,a;
    printf("Enter the number");
    scanf("%d",&n);
    for(i=0;i<=10;i++)
    {
        a=i*n;
        printf("\n%d*%d=%d\n",i,n,a);
    }

}
