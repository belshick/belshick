#include<stdio.h>
#include<conio.h>
int main()
{
    char a;
    printf("\n enter the character");
    scanf("%c",&a);
    if(a=='a'||a=='e'||a=='i'||a=='o'||a=='u'||a=='A'||a=='E'||a=='I'||a=='O'||a=='U')
    {

        printf("\n vowel");
    }
    else{
        printf("consonant");
    }
}
