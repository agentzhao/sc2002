#ifndef CHILD_ANIMAL_H
#define CHILD_ANIMAL_H
#include "Animal.h"

#include <iostream>
#include <string>

using namespace std;

class Dog : public Mammal {
public:
  Dog(string n, COLOR c, string owner);
  ~Dog();

  void speak() const;
  void move();

private:
  string _owner;
};

class Cat : public Mammal {
public:
  Cat(string n, COLOR c);
  ~Cat();

  void speak() const;
  void move();
};

class Lion : public Mammal {
public:
  Lion(string n, COLOR c);

  ~Lion();

  void speak() const;
  void move();
};

// int main();

#endif
