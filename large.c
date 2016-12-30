#include<stdio.h>
#include<conio.h>
int main()
{

    int p,q,r;
    printf("\n enter the three no");
    scanf("%d\t%d\t%d",&p,&q,&r);
    if(p>q&&p>r)
    {
        printf("\n p is large no");
    }
    else if(q>p&&q>r)
    {

        printf("\n q is large no");
    }
    else{
        printf("\n r is large no");
    }
}
