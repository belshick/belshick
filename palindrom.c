#include<stdio.h>
int main()
{
int num,rev=0,rem,t;
printf("Enter the number");
scanf("%d",&num);
t=num;
while(t>0)
{
 rem=t%10;
 rev=(rev*10)+rem;
 t=t/10;
 }
 if(num==rev)
 {
      printf("%d is an palindrom number",num);
 }
 else
 {
      printf("%d is an Not palindrom number",num);
 }


 }
