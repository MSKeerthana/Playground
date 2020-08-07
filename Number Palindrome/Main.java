#include <iostream>
using namespace std;

int main() 
{
    int n;
    cin>>n;
    int temp = n, sum = 0;
  //input = 123
    while( n != 0)
    {
       sum = sum * 10 + n%10;
       n = n/10;
    }
   if(temp == sum)
     cout<<"Equal";
   else
     cout<<"Not equal";
    return 0;
}