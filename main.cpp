#include <iostream>
using namespace std;

bool leapYear(int x){
  bool leap= false;
  if(x%4==0){
    if(x%100==0){
      if(x%400==0){
        leap= true;
      }
      leap= false;
    }
    leap= true;
  }
  return leap;
}
int main(){
  int year;
  cout<<"Enter the year you want: ";
  cin>>year;
  cout<<"Is given year a leap year? ";
  if(leapYear(year))
    cout <<"True";
  else
    cout<<"False";
  return 0;
}