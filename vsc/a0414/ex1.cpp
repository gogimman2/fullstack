#include <iostream>
#include <string>
using namespace std;

class Book{
    public:
    string title;
    string author;
    int price;
};

int main() {
    Book myBook;
    myBook.title = "bbb";
    myBook.author = "aaa";
    myBook.price = 15000;
    cout << myBook.title << "\n";
    cout << myBook.author << "\n";
    cout << myBook.price << "\n";

    return 0;
}