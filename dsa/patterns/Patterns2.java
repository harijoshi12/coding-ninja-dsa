package dsa.patterns;

public class Patterns2 {
  public static void pattern1(int n) {
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n - i; j++) {
        System.out.print(" ");
      }
      for (int j = 0; j < i; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }

  public static void pattern2(int n) {
    int i = 1;
    while (i <= n) {
      int space = 1;
      while (space <= n - i) {
        System.out.print(" ");
        space++;
      }
      int stars = 1;
      while (stars <= i) {
        System.out.print("+");
        stars++;
      }
      System.out.println();
      i++;
    }
  }

  public static void pattern3(int n) {
    int i = 1;
    while (i <= n) {
      int space = 1;
      while (space <= n - i) {
        System.out.print(" ");
        space++;
      }
      int num = 1;
      while (num <= i) {
        System.out.print(num);
        num++;
      }
      System.out.println();
      i++;
    }
  }

  public static void pattern4(int n) {
    int i = n;
    while (i > 0) {

      int num = 1;
      while (num <= i) {
        System.out.print(i);
        num++;
      }
      int space = 0;
      while (space <= n - i) {
        System.out.print(" ");
        space++;
      }
      System.out.println();
      i--;
    }
  }

  public static void pattern5(int n) {
    System.out.println();
    System.out.println("pattern 5");
    int i = 1;

    while (i <= n) {
      int space1 = 1;
      while (space1 <= n - i) {
        System.out.print("-");
        space1++;
      }
      int num = 1;
      while (num <= i) {
        System.out.print("*" + "");
        num++;
      }
      int num2 = 2;
      while (num2 <= i) {
        System.out.print("*" + "");
        num2++;
      }
      int space2 = 1;
      while (space2 <= n - i) {
        System.out.print("-");
        space2++;
      }
      System.out.println();
      i++;
    }
  }

  public static void pattern5_1(int n) {
    System.out.println();
    System.out.println("pattern 5_1");
    int i = 1;

    while (i <= n) {
      int space1 = 1;
      while (space1 <= n - i) {
        System.out.print("-");
        space1++;
      }
      int stars = 1;
      while (stars <= (2 * i - 1)) {
        System.out.print("*" + "");
        stars++;
      }

      System.out.println();
      i++;
    }
  }

  public static void pattern5_2(int n) {
    System.out.println();
    System.out.println("pattern 5_2");
    int i = 1;

    while (i <= n) {
      int space1 = 1;
      while (space1 <= n - i) {
        System.out.print("-");
        space1++;
      }
      int stars = 1;
      while (stars <= (i)) {
        if (stars == i) {
          System.out.print("*");
        } else {
          System.out.print("*" + "-");

        }
        stars++;
      }

      System.out.println();
      i++;
    }
  }

  public static void pattern6(int n) {
    System.out.println();
    System.out.println("pattern 6");
    int i = n;
    while (i >= 1) {
      int space1 = 1;
      while (space1 <= n - i) {
        System.out.print("-");
        space1++;
      }
      int num = 1;
      while (num <= i) {
        System.out.print("*" + "");
        num++;
      }
      int num2 = 2;
      while (num2 <= i) {
        System.out.print("*" + "");
        num2++;
      }
      int space2 = 1;
      while (space2 <= n - i) {
        System.out.print("-");
        space2++;
      }
      System.out.println();
      i--;
    }
  }

  public static void pattern6_1(int n) {
    System.out.println();
    System.out.println("pattern 6_1");
    int i = n;
    while (i >= 1) {
      int space1 = 1;
      while (space1 <= n - i) {
        System.out.print("-");
        space1++;
      }
      int stars = 1;
      while (stars <= (2 * i - 1)) {
        System.out.print("*");
        stars++;
      }

      System.out.println();
      i--;
    }
  }

  public static void pattern7(int n) {
    System.out.println();
    System.out.println("pattern 7");
    int i = 1;
    while (i <= n) {
      int space = n - i;
      while (space >= 1) {
        System.out.print(" ");
        space--;
      }
      int num = i;
      int inloop1 = 1;
      while (inloop1 <= i) {
        System.out.print(num);
        num++;
        inloop1++;
      }
      int num2 = 1 * (2 * i - 2);
      int inloop2 = 1;
      while (inloop2 < i) {
        System.out.print(num2);
        num2--;
        inloop2++;
      }
      System.out.println();
      i++;
    }
  }

  public static void pattern7_1(int n) {
    System.out.println();
    System.out.println("pattern 7_1");
    int r = 1;
    while (r <= n) {
      int num = r;
      int c = 1;
      while (c <= (n + r - 1)) {
        if (c <= n - r) {
          System.out.print("-");
        } else if (c < n) {
          System.out.print(num);
          num++;
        } else {
          System.out.print(num);
          num--;
        }
        c++;
      }
      r++;
      System.out.println();
    }
  }

  public static void pattern7_2(int n) {
    System.out.println();
    System.out.println("pattern 7_2");
    int i = 1;
    while (i <= n) {
      int space = 1;
      while (space <= (n - i)) {
        System.out.print("`");
        space++;
      }
      int num1 = 1;
      int j = 1;
      while (j <= i) {
        System.out.print(num1);
        num1++;
        j++;
      }
      int k = 1;
      num1--;
      while (k < i) {
        num1--;
        System.out.print(num1);
        k++;
      }
      i++;
      System.out.println();
    }
  }

  public static void pattern8(int n) {
    System.out.println();
    System.out.println("pattern 8");
    int n1, n2;
    n1 = (n + 1) / 2;
    n2 = n / 2;

    System.out.println("n1 = " + n1);
    System.out.println("n2 = " + n2);
    int r1 = 1;
    while (r1 <= n1) {
      int space = 1;
      while (space <= n1 - r1) {
        System.out.print("-");
        space++;
      }
      int star = 1;
      while (star <= (2 * r1 - 1)) {
        System.out.print("*");
        star++;
      }
      System.out.println();
      r1++;
    }
    int r2 = n2;
    while (r2 >= 1) {
      int space = 1;
      while (space <= (n2 - r2 + 1)) {
        System.out.print("+");
        space++;
      }
      int star = 1;
      while (star <= (2 * r2 - 1)) {
        System.out.print("*");
        star++;
      }
      System.out.println();
      r2--;
    }

  }

  public static void pattern9(int n) {
    System.out.println();
    System.out.println("pattern 9");
    int i = 1;
    while (i <= n + 1) {
      int col = 1;
      int num = 1;
      while (col <= 2 * i - 1) {
        if (col == 1 || col == (2 * i - 1)) {
          System.out.print("*");
        } else if (col <= i - 1) {
          System.out.print(num);
          num++;
        } else {
          System.out.print(num);
          num--;
        }
        col++;
      }
      System.out.println();
      i++;
    }
    int j = n;
    if (n == 0) {
      System.out.println("*");
    }
    while (j >= 1) {
      int col = 1;
      int num = 1;
      while (col <= 2 * j - 1) {
        if (col == 1 || col == (2 * j - 1)) {
          System.out.print("+");
        } else if (col <= j - 1) {
          System.out.print(num);
          num++;
        } else {
          System.out.print(num);
          num--;
        }
        col++;
      }
      System.out.println();
      j--;
    }
  }

  public static void main(String[] args) {
    pattern1(5);
    pattern2(6);
    pattern3(5);
    pattern4(5);
    pattern5(5);
    pattern5_1(5);
    pattern5_2(5);
    pattern6(5);
    pattern6_1(5);
    pattern7(5);
    pattern7_1(5);
    pattern7_2(5);
    pattern8(5);
    pattern9(5);
  }
}
