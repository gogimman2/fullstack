#include <iostream>
using namespace std;

class Animal{
    public:
    void sound(){}
};

class Dog : public Animal{
    public:
    void sound(){
        cout << "멍멍!";
    }
};

int main() {
    Dog dog;
    dog.sound();

    return 0;
}