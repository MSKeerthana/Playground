#include<stdio.h>
int factorial(int n)
{
 return (n == 1 || n == 0)? 1 : n * factorial(n - 1);
  //assume n = 3,
  /* n != 0, return 3 * 2 = return 6
    n = 2, n != 0, return 2 * 1 = return 2
    n = 1, n != 0, return 1 * factorial(0) -> return 1 * 1 = return 1*/
}
int main()
{
  int n;// factorial of n to be found
  scanf("%d",&n);
  printf("%d",factorial(n));
  return 0;
}
  