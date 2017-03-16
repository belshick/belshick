#include<stdio.h>
int gcd(int n1,int n2);
int main()
{
   int n1,n2;
   printf("Enter teo positive integer\n");
   scanf("%d\n%d",&n1,&n2);
   printf("GCD OF %d and %d=%d",n1,n2,gcd(n1,n2));
   return 0;
}
int gcd(int a,int b)
{
  int c;
  c=a%b;
  if(c==0)
        return b;
  else
    return gcd(b,c);
}

