#include<stdio.h>
#include<conio.h>
int main()
{
   int a[100],i,num,max=a[0],min=a[0],ans;
   printf("Enter the number");
   scanf("%d",&num);
   for(i=0;i<num;i++)
   {

       scanf("%d",&a[i]);
   }
   max=a[0];
   for(i=0;i<num;i++)
   {

       if(a[i]>max)
       {

           max=a[i];
       }
   }
   printf("%d\n",max);
   min=a[0];
   for(i=0;i<num;i++)
   {

       if(a[i]<min)
       {

           min=a[i];
       }
   }
   printf("%d\n",min);
 ans=max+min;
 printf("%d",ans);
    return 0;
}
