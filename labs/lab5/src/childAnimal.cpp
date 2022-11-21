#include "childAnimal.h"
#include <iostream>
#include <string>

using namespace std;

// Dog
Dog::Dog(string n, COLOR c, string owner) : Mammal(n, c) { owner = _owner; }

Dog::~Dog() = default;

void Dog::speak() const { cout << "Dog Woof" << endl; }
// fix for 4. Pure method. Gotta define abstract method in the derived class
void Dog::move() { cout << "Dog moves" << endl; }

// Cat
Cat::Cat(string n, COLOR c) : Mammal(n, c) {}

Cat::~Cat() = default;

void Cat::speak() const { cout << "Cat Meow" << endl; }

void Cat::move() { cout << "Cat moves" << endl; }

// Lion
Lion::Lion(string n, COLOR c) : Mammal(n, c) {}

Lion::~Lion() = default;

void Lion::speak() const { cout << "Lion Roar" << endl; }

void Lion::move() { cout << "Lion moves" << endl; }

// int main() {
// 3.3 polymorphism
// Animal *animalPtr = new Dog("Lassie", White, "Andy");
// animalPtr->speak();
// animalPtr->move();
// delete animalPtr;
//
// cout << "Program exiting ..." << endl;
//   return 0;
// }
