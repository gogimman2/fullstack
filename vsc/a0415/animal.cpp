#include <iostream>
#include <string>
using namespace std;

class Animal {
    public:
    void animalSound(){
        cout << "The animal makes a sound\n";
    }
};
class Bird : public Animal{
    public:
    void animalSound(){
        cout << "The pig says : 짹짹\n";
    }
};
class Cat : public Animal{
    public:
    void animalSound(){
        cout << "The dog says : 냐옹\n";
    }
};

int main(){
    Animal myAnimal;
    Bird myBird;
    Cat myCat;

    myAnimal.animalSound();
    myBird.animalSound();
    myCat.animalSound();

    return 0;
}