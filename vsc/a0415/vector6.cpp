#include <iostream>
#include <vector>
using namespace std;

int main() {
    vector<string> cars = {"Volvo", "BMW", "Ford", "Mazda"};
    auto it = cars.begin() + 2;  // 인덱스 2번 위치(3번째)에 삽입
    cars.insert(it, "Hyundai");

    return 0;
}