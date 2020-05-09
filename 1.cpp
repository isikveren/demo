#include<iostream>
using namespace std;

void func(int){                                       
    cout << "111"<<endl; 
}
void func(int,int){
    cout << "222"<<endl;
}

int main(){
    func(1,1);

return 0;

}