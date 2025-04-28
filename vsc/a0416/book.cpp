#include <iostream>
#include <vector>
using namespace std;

class Book {
    public:
    string title;
    bool isBorrowed;

    Book(string t) {
        title = t;
        isBorrowed = false;
    }
};

int main() {
    vector<Book> library;

    library.push_back(Book("C++ 입문서"));
    library.push_back(Book("자료구조론"));
    library.push_back(Book("알고리즘 기초"));

    int choice;

    while (true) {
        cout << "=== 도서 대출 프로그램 ===\n";
        cout << "1. 도서 목록 확인\n";
        cout << "2. 도서 대출\n";
        cout << "3. 도서 반납\n";
        cout << "4. 프로그램 종료\n";
        cin >> choice;
        if (choice == 1) {
            cout << "\n도서목록\n";
            for (int i = 0; i < library.size(); i++) {
                cout << i + 1 << ". " << library[i].title;
                if (library[i].isBorrowed){
                    cout << "(대출중)";
                } else {
                    cout << "(대출가능)";
                }
                cout << endl;
            }
        } else if (choice == 2) {
            int bookNum;
            cout << "대출할 도서 번호";
            cin >> bookNum;

            if (bookNum >= 1 && bookNum <= library.size()) {
                if (!library[bookNum - 1].isBorrowed) {
                    library[bookNum - 1].isBorrowed = true;
                    cout << library[bookNum - 1].title << "도서를 대출하였습니다.\n";
                } else {
                    cout << "이미 대출중인 도서입니다.";
                }
            }else {
                cout << "잘못 입력하셨습니다.";
            }
        }else if (choice == 3) {
            int bookNum;
            cout << "반납할 도서 번호";
            cin >> bookNum;
            if (bookNum >= 1 && bookNum <= library.size()) {
                if (library[bookNum - 1].isBorrowed) {
                    library[bookNum - 1].isBorrowed = false;
                    cout << library[bookNum - 1].title << "도서를 반납하였습니다.\n";
                } else {
                    cout << "잘못 입력하셨습니다.";
                }
            }
        } else if (choice == 4) {
            cout << "프로그램을 종료합니다.";
            break;   
        }else {
            cout << "잘못 입력하셨습니다.";
        }
    }

    return 0;
}