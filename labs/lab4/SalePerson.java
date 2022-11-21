public class SalePerson implements Comparable<SalePerson> {
  String firstName;
  String lastName;
  int totalSales;

  public SalePerson(String last, String first, int sales) {
    this.lastName = last;
    this.firstName = first;
    this.totalSales = sales;
  }

  public String toString() {
    return this.lastName + ", " + this.firstName + ": " + this.totalSales;
  }

  public boolean equals(SalePerson o) {
    if ((o.firstName == this.firstName) && (o.lastName == this.lastName)) {
      return true;
    } else {
      return false;
    }
  }

  public String getFirstName() {
    return this.firstName;
  }

  public String getLastName() {
    return this.lastName;
  }

  public int getTotalSales() {
    return this.totalSales;
  }

  public int compareTo(SalePerson s) {
    if (this.getTotalSales() == s.getTotalSales()) {
      // use last name to tiebreak
      if (this.equals(s)) {
        return 0;
      }
      char arr1[] = this.getLastName().toCharArray();
      char arr2[] = s.getLastName().toCharArray();
      int length;
      if (arr1.length <= arr2.length) {
        length = arr1.length;
      } else {
        length = arr2.length;
      }
      int i = 0;
      while (i != length) {
        if (arr1[i] == arr2[i]) {
          i++;
          continue;
        } else {
          if (arr1[i] > arr2[i]) {
            return 1;
          } else {
            return -1;
          }
        }
      }
      return 0; // exactly same last name but shouldn't reach here
    } else {
      return this.totalSales - s.totalSales;
    }
  }
}
