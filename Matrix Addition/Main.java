#include<iostream>
using namespace std;
int main()
{
  int row_size,col_size;
  cin>>row_size>>col_size;
  int a[row_size][col_size],b[row_size][col_size];
  for(int row = 0; row < row_size; row++)
  {
    for(int col = 0; col < col_size; col++)
    {
      cin>>a[row][col];
    }
  }
  for(int row = 0; row < row_size; row++)
  {
    for(int col = 0; col < col_size; col++)
    {
      cin>>b[row][col];
    }
  }
  for(int row = 0; row < row_size; row++)
  {
    for(int col = 0; col < col_size; col++)
    {
      cout<<a[row][col] + b[row][col]<<" ";
    }
    cout<<endl;
  }
}











