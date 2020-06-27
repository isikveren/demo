#include<iostream>
using namespace std;

int main(){
    int a1 = 100,a2 = 200;
    int& b = a1;
    b = a2;
    cout<<b<<","<<a1<<endl;
    return 0;
}