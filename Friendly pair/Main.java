#include<iostream>
using namespace std;
int main()
{
  int n1,n2;
  cin>>n1>>n2;
  int sum1 = 0, sum2 = 0;
  for(int i = 1; i <= n1; i++)
  {
    if(n1%i == 0)
      {
      	sum1 = sum1 + i;
      }
    }
  for(int i = 1; i <= n2; i++)
  {
    if(n2%i == 0)
    {
      sum2 = sum2 + i;
    }
  }
  if(sum1/n1 == sum2/n2)
    cout<<"Friendly Pair";
  else
    cout<<"Not Friendly Pair";
  return 0;
}