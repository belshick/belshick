#include<stdio.h>
int main(){
  int i=1,fact=1,no;

  printf("Enter a number: ");
  scanf("%d",&no);

  while(i<=no){
      fact =fact*i;
      i++;
  }

  printf("Factorial of %d is: %d",no,fact);
  return 0;
}
