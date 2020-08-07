#include<stdio.h>
void reverse(char *a)
{
  if(*a)//to traverse till the last char of the string input
  {
    reverse(a+1);// to move to the next character
    printf("%c",*a); // to print from the last.
  }
}
int main()
{
  char a[100]; // an array which can store 100 characters.
  scanf("%[^\n]s",a);//to scan the string with spaces
  reverse(a); // recursive function call
  return 0;
}