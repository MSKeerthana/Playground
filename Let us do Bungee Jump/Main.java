#include <iostream>
using namespace std;

int main() 
{
    int age,weight;
    cin>>age>>weight;
    if(age>=12)
    {
        if(weight > 40)
        {
          if(weight <= 110)
          	cout<<"He can Jump";
          else
          	cout<<"Extra ropes will be added";
        }
        else
          cout<<"He can't Jump";
    }
    else
      cout<<"He can't Jump";
  
      
    return 0;
}