#include <iostream>
int main()
{
  using namespace std;
  int a,b;

  cout.setf(ios_base::fixed, ios_base::floatfield); // fixed-point
  cout << "";
  cin >> a;
  cout << "";
  cin >> b;

  cout << "a+b=" << a+b << endl;
  cout << "a-b=" << a-b<< endl;
  cout << "a*b=" << a*b<< endl;
  cout << "a/b=" << a/b<< endl;
   cout << "a%b=" << a%b << endl;
  return 0;
}