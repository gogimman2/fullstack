#include <iostream>
using namespace std;

class Calculator{
    public:
    int plus;
    int minus;
    int multiply;
    int divide;
};

int main() {
    Calculator c;
    int a, b;
    c.plus = a + b;
    c.minus = a - b;
    c.multiply = a * b;
    c.divide = a / b;

    cout << "두 개의 정수를 입력해주세요 : ";
    cin >> a;
    cin >> b;

    int choice;
    cout << "원하시는 번호를 선택해주세요" << endl;
    cout << "1. 더하기" << endl;
    cout << "2. 빼기" << endl;
    cout << "3. 곱하기" << endl;
    cout << "4. 나누기" << endl;
    cin >> choice;

    if (choice == 1) {
        cout << c.plus;
    } else if (choice == 2) {
        cout << c.minus;
    } else if (choice == 3) {
        cout << c.multiply;
    } else if (choice == 4) {
        cout << c.divide;
    } else {
        cout << "잘못 입력하였습니다.";
    }
    
    return 0;
}