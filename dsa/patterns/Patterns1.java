package dsa.patterns;

public class Patterns1 {
  public static void pattern1() {
    for (int i = 1; i <= 4; i++) {
      for (int j = 1; j <= i; j++) {
        System.out.print(i);
      }
      System.out.println();
    }
  }

  public static void pattern2() {
    for (int i = 1; i <= 4; i++) {
      for (int j = 1; j <= i; j++) {
        System.out.print(j);
      }
      System.out.println();
    }
  }

  public static void pattern3() {
    int n = 1;
    for (int i = 1; i <= 4; i++) {
      for (int j = 1; j <= i; j++) {
        System.out.print(n);
        n++;
      }
      System.out.println();
    }
  }

  public static void pattern4() {
    int n = 1;
    for (int i = 1; i <= 4; i++) {
      n = i;
      for (int j = 1; j <= i; j++) {
        System.out.print(n);
        n++;
      }
      System.out.println();
    }
  }

  public static void pattern5() {
    int n = 1;
    int blank = 3;
    int row = 1;
    int col = 1;

    while (row <= 4) {
      for (int j = blank; j >= 0; j--) {
        System.out.print(" ");
      }
      n = row;
      for (int j = 1; j <= col; j++) {
        System.out.print(n + " ");
        n++;
      }
      for (int j = blank; j >= 0; j--) {
        System.out.print(" ");
      }
      blank--;
      row++;
      col++;
      System.out.println();
    }
  }

  public static void pattern6() {
    for (int i = 0; i < 4; i++) {
      for (int j = 0; j < 4; j++) {
        System.out.print((char) ('A' + j));
      }
      System.out.println();
    }
  }

  public static void pattern7() {
    int n = 4;
    int l = 0;
    for (int i = 0; i < n; i++) {
      l = i;
      for (int j = 0; j <= i; j++) {
        System.out.print((char) ('A' + l));
        l++;
      }
      System.out.println();
    }
  }

  public static void pattern8() {
    int n = 7;
    int col = 1;
    int count = n;
    while (n > 0) {
      count = n;
      for (int j = 1; j <= col; j++) {
        System.out.print((char) ('A' + count - 1));
        count++;
      }
      n--;
      col++;
      System.out.println();
    }
  }

  public static void main(String[] args) {
    pattern1();
    pattern2();
    pattern3();
    pattern4();
    pattern5();
    pattern6();
    pattern7();
    pattern8();
  }
}
