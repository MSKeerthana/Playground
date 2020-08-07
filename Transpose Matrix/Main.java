#include<iostream>
using namespace std;
int main()
{
  int row,col;
  cin>>row;
  int a[row][row];
  for(int i = 0; i < row; i++)
  {
    for(int j = 0; j < row; j++)
    {
      cin>>a[i][j];
    }
  }
  for(int i = 0; i < row; i++)
  {
    for(int j = 0; j < row; j++)
    {
      cout<<a[i][j]<<" ";
    }
    cout<<endl;
  }
  cout<<"Transpose matrix is:"<<endl;
  for(int i = 0; i < row; i++)
  {
    
    for(int j = 0; j < row; j++)
    {
      cout<<a[j][i]<<" ";
    }
    cout<<endl;
  }
}
