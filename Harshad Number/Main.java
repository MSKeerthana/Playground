#include<iostream>
using namespace std;
int main()
{
  int n,sum = 0;
  cin>>n;
  int temp = n;
  while(n!=0)
  {
    sum = sum + n%10;
    n = n/10;
  }
  if(temp % sum == 0)
    cout<<"Harshad Number";
  else
    cout<<"Not Harshad Number";
  return 0;
}