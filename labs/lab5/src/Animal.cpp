#include "Animal.h"
#include <iostream>
#include <string>

using namespace std;

// Animal
Animal::Animal() : _name("unknown") {
  cout << "constructing Animal object " << _name << endl;
}

Animal::Animal(string n, COLOR c) : _name(n), _color(c) {
  cout << "constructing Animal object " << _name << ", " << COLOR(_color)
       << endl;
}

// called when program ends. Called if used as abstract class, add virtual
Animal::~Animal() { cout << "destructing Animal object " << _name << endl; }

// if set to virtual, will use the derived class's method
void Animal::speak() const { cout << "Animal speaks " << endl; }

void Animal::move(){}; // is this what they want

// Mammal
Mammal::Mammal() : Animal() {}

Mammal::Mammal(string n, COLOR c) : Animal(n, c) {
  cout << "constructing Mammal object " << endl;
}

Mammal::~Mammal() = default;

void Mammal::eat() const { cout << "Mammal eats " << endl; }

// int main() {
//   Animal a;
//   Animal a("dog", Blue);
//   Mammal a("cat", Black);
//   Dog a("odin", White, "zhao");
//   a.speak();
//   a.move();
//
//   cout << "Program exiting ..." << endl;
//   return 0;
// }
