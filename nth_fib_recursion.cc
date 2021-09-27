/*
   * Program to find the nth fibonacci number using recursion.
   * Author of this crappy code - Rohan Giriraj
*/

#include<iostream>
using namespace std;
int fibo(int);
int main()
{
  int n;
  cout<<"Please enter the nth number."<<endl;
  cin>>n;

  cout<<"The nth fibonacci number is: "<< fibo(n)<<endl;

  return 0;
}


int fibo(int n)
{
  if(n==1 || n==0)
    return n;
  else
    return (fibo(n-1)+fibo(n-2));
}
