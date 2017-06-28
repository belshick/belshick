#include<stdio.h>
#include<conio.h>
int main()
{
  int arr[100];
  int n,i;
  int max=arr[0];
  int min=arr[0];
  printf("enter the number");
  scanf("%d",&n);
  for(i=0;i<n;i++)
  {
  scanf("%d",&arr[i]);
  }
   for(i=0;i<n;i++)
   {
   if(arr[i]>max)
   {
   arr[i]=max;
   }
   }
   printf("Maximun No:%d",max);
for(i=0;i<n;i++)
   {
   if(arr[i]<min)
   {
   arr[i]=max;
   }
   }
   printf("Minimun No:%d",min);


}
