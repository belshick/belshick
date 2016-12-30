#include<stdio.h>
#include<conio.h>
int main()
{
    char a;
    printf("\n enter the character:");
    scanf("%c",&a);
    if((a>='a'&&a<='z')||(a>='A'&&a<='Z'))
    {
        printf("\n alphabet");
    }
    else{
        printf("\n digit");
    }
}
