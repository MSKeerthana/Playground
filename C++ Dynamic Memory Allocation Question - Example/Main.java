#include <iostream>
#include <stdlib.h>
using namespace std;

int *rollno;
float *marks;

int main() 
{
   int size,i;
   cin>>size;
  rollno = new int[size];
  marks = new float[size];
  
  if((!rollno) ||(!marks))
  {
    cout<<"Out of Memory..!!..Aborting..!!\n";
    cout<<"Press any key to exit..";
    exit(1);
  }
  //getting inputs from the users
  for(i = 0; i < size; i++)
  {
    cin>>rollno[i]>>marks[i];
  }
  //Displaying the array contents
   for(i = 0; i < size; i++)
  {
    cout<<rollno[i]<<" "<<marks[i]<<"\n";
   }
  delete[] rollno;
  delete[] marks;
  
    return 0;
}