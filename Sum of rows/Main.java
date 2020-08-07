#include<iostream>
using namespace std;
int main()
{
  int row,col;
  cin>>row>>col;
  int a[row][col],sum = 0;
  for(int i = 0; i < row; i++)
  {
    for(int j = 0; j < col; j++)
    {
      cin>>a[i][j];
    }
  }
  for(int i = 0; i < row; i++)
  {
    for(int j = 0; j < col; j++)
    {
       sum += a[i][j];
    }
    cout<<sum<<endl;
    sum = 0;
  }
}