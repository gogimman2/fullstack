#include <iostream>
using namespace std;

class Car{
    public:
    int speed;
    string color;
};

int main() {
    Car c;
    c.speed = 100;
    c.color = "yellow";

    cout << c.speed << endl;
    cout << c.color;

    return 0;
}