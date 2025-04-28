#include <iostream>
#include <string>
using namespace std;

class MyClass {
    public:
    int salary;
};
void MyClass :: myMethod() {
    cout << "Hello World"
}


int main() {
    MyClass myObj;

    return 0;
}