## Java

# Arrays

```
int[][] days = new int[3][5] // Type[] Variable
```

`static final double PI = 3.14159;` // outside main method

# Printing

`System.out.println("testing");`

# Type conversion

`char ch = (char)65.78;` // ch is 'A'

# Wrapper Classes ?

```
int number = Integer.parseInt(string); // convert "888" to 888
```

# Enum

```
enum Day {Mon, Tue, Wed, Thu, Fri, Sat, Sun};
public static void main(String[] args){
  Day yesterday, today;
  yesterday = Day.Mon; // yesterday.name = Mon
  today = Day.Tue; // today.ordinal = 1
}
```

# Packages

- java.lang // core java classes (automatically imported)
- java.io // input/output
- java.text // manipulating info (decimalformat, datetime, int, char, str)
- java.util // Scanner, date, calendar, locale, vectors, stacks, hashing

```
import java.util.Scanner;
Scanner sc = new Scanner(System.in);
int data = sc.nextInt();
```

```
c:\myjava\programs\test\mypackage
setenv CLASSPATH .:/myjava/programs // set env var

package test.mypackage
public class Class1 {
  public static double method1(){...}
}
```

## Not sure if will even use

# Input Dialogs

```
import javax.swing.JOptionPane;
public class ConsoleDialogInput {
  public static void main(String args[]) {
    String name = JOptionPane.showInputDialog("Enter your name: ");

    String ageString = JOptionPane.showInputDialog("Enter your age: ");
    int age = Integer.parseInt(ageString);

    String gender = JOptionPane.showInputDialog("Enter your gender: ");

    String heightString = JOptionPane.showInputDialog("Enter your height: ");
    double height = Double.parseDouble(heightString);

    String output = "Hello! " + "\nYour name is " + name + "\nYour age is " + age +
    "\nYour gender is " + gender + "\nYour height is " + height;
    JOptionPane.showMessageDialog(null, output, "Message",
    JOptionPane.INFORMATION_MESSAGE);
  }
}
```
