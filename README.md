# SC2002 OOP

## Running java program

`javac -d . tut1/example.java`
`java tut1/example`

## Running java project

`jpcompile` or

```
find . -type f -name "*.java" > sources.txt
javac -d ./out/ @sources.txt
java -cp ./out/ boundaries/MOBLIMA
```

## Running C++ project

[cmake](https://codevion.github.io/#!cpp/cmake.md)

```
cd build
cmake .
make
./lab5

```
