#include<stdio.h>
int main()
{

    int a=0,b=1,c,i,no;
    printf("ENTER THE VALUES\n");
    scanf("%d",&no);
    printf("\t%d\t%d\t",a,b);
    for(i=2;i<no;i++)
    {

        c=a+b;
        printf("%d\t",c);
        a=b;
        b=c;
    }
return 0;
}
