#include<stdio.h>
#include<conio.h>
 main()
{

    int n,i,sum=0,average;
    int arr[100];
    printf("Enter the number");
    scanf("%d",&n);
    for(i=0;i<n;i++)
    {

        scanf("%d",&arr[i]);
    }
    for(i=0;i<n;i++)
    {

        sum+=arr[i];
        average=sum/n;
    }printf("Average is:%d ",average);
//    return 0;

}
