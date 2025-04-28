#include <iostream>
using namespace std;

int main() {
    string name;
    int age;
    cout << "이름을 입력해 주세요 : ";
    cin >> name;
    cout << "나이를 입력해 주세요 : ";
    cin >> age;
    cout << name << "님은 " << age << "세입니다.";

    return 0;
}