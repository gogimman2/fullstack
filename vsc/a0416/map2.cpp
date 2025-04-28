#include <iostream>
#include <map>
using namespace std;

int main() {
    // map 선언
    map <string, int> score;

    // 값 삽입
    score["Kim"] = 4500;
    score["Lee"] = 5200;
    score["Park"] = 4800;
    score["Choi"] = 5500;
    score["Jung"] = 6100;

    // 특정값 찾기
    int money >= 5000;
    if(score.find(money) != score.end()) {
        for(auto it = score.begin();it != score.end();++it) {
            cout << it -> first << " : " << it -> second << endl;
        }
    }else {
        cout << "존재하지 않습니다" << endl;
    }

    return 0;
}