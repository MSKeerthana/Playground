#include<stdio.h>
#include<math.h>
long long dectobin(n);
int main()
{
  int n; // which holds the decimal to be converted to binary
  scanf("%d",&n);
  printf("%lld",dectobin(n));
  return 0;
}
 long long dectobin(int n)
 {
   long long binaryNumber = 0;
   int remainder, i =1;
   while(n!=0)
   {
     remainder = n%2;
     n = n/2;
     binaryNumber = binaryNumber + remainder * i;
     i *= 10;
   }
   // let us assume n = 7;
   return binaryNumber;
 }