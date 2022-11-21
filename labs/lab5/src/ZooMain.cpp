#include "../src/Animal.h"
#include "../src/childAnimal.h"
#include <iostream>
#include <string>

using namespace std;

void program() {
  // array of mammal objects
  Mammal *array[10];
  // Animal *array[10]; //cannot, no member named eat() in Animal

  int choice, size = 0;
  bool end = false;

  while (!end) {
    cout << "(1) Dog (2) Cat (3) Lion (4) Move all animals (5) Quit" << endl;
    cout << "Select the animal to send to Zoo:" << endl;

    cin >> choice;

    switch (choice) {
    case 1:
      array[size] = new Dog("Fido", Green, "Bob");
      size++;
      break;
    case 2:
      array[size] = new Cat("Fluffy", Blue);
      size++;
      break;
    case 3:
      array[size] = new Lion("Simba", White);
      size++;
      break;
    case 4:
      for (int i = 0; i < size; i++) {
        array[i]->move();
        array[i]->speak();
        array[i]->eat();
      }
      end = true;
      break;
    case 5:
      cout << "Quitting" << endl;
      end = true;
      break;
    default:
      cout << "Invalid choice" << endl;
      break;
    }
  }
}

int main() {
  program();

  cout << "Program exiting …. " << endl;
  return 0;
}
