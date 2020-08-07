#include<iostream>
using namespace std;
int main()
{
   int n;
   cin>>n;
   int f = 0, s = 1, t;
   if(n==1)
     cout<<f;
   else if(n==2)
     cout<<s;
   else
   {
     for(int i = 3; i <= n; i++)
     {
     	t = f+s;
     	f = s;
     	s = t;
     }
     cout<<t;
   } 
}