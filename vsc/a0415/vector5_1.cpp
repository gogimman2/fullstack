#include <iostream>
#include <vector>
using namespace std;

int main() {
    vector<string> cars = {"Volvo", "BMW", "Ford", "Mazda"};
    
    cars.pop_back();  // 벡텅요소의 제거

    for(string car : cars){
        cout << car << "\n";
    }
    cout << cars.size() << "\n";  // vector의 크기
    cout << cars.empty();  // 비어있으면 1 데이터가 있으면 0

    return 0;
}