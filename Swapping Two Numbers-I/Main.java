#include<stdio.h>
int main()
{
  int x,y;
  scanf("%d%d",&x,&y);
  printf("x = %d\ny = %d\n",x,y);//x = 7, x = 2
  // ^ - exclusive OR.
  x = x ^ y;
  y = x ^ y;
  x = x ^ y;
  printf("x = %d\ny = %d\n",x,y);
  return 0;
}