#include <iostream>
#include <list>
using namespace std;

int main() {
    int a, b, c, d, e;
    cin >> a >> b >> c >> d >> e;

    list<int> cars = {a, b, c, d, e};
    
    for(int car : cars){
        cout << car << "\n";
    }

    return 0;
}