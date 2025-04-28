#include <iostream>
#include <stack>
using namespace std;

int main() {
    stack<int> s;
    // 스텍을 값을 넣기(oush
    s.push(10);
    s.push(20);
    s.push(30);
    cout << "현재 스택의 맨 위 값 : " << s.top() << endl;

    if (!s.empty())
    {
        cout << "스텍은 비어있지 않습니다." << endl;
    }
    cout << "현재 스택의 크기 : " << s.size() << endl;
    
    while (!s.empty())
    {
        cout << "스택에서 꺼낸 값 : " << s.top() << endl;
    }
    

    return 0;
}