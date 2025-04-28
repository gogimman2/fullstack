#include <iostream>
#include <map>
using namespace std;

int main() {
    // map 선언
    map <string, int> score;

    // 값 삽입
    score["Alice"] = 95;
    score["Bob"] = 82;
    score["Charlie"] = 88;

    // 출력
    cout << "학생 점수 목록 : " << endl;
    for(auto it = score.begin();it != score.end();++it) {
        cout << it -> first << " : " << it -> second << endl;
    }

    // 특정값 찾기
    string name = "Bob";
    if(score.find(name) != score.end()) {
        cout << name << "의 점수는 " << score[name] << " 점 입니다." << endl;
    }else {
        cout << name << "의 점수가 존재하지 않습니다." << endl;
    }

    // 삭제
    score.erase("Charlie");
    cout << "삭제후 남은 학생 목록 : " << endl;

    for(const auto & pair : score) {
        cout << pair.first << " : " << pair.second << endl;
    }

    return 0;
}