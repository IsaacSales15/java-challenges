package cubopreto_obi;

import java.util.Scanner;
import java.lang.Math;

public class cubo {

  public static void contCubo(double n) {

    int f0 = (int) Math.pow((n - 2), 3.0);
    System.out.println("Zero faces: " + f0);
    int f2 = (int) ((n - 2) * 12);
    System.out.println("Duas faces: " + f2);
    int f3 = 8;
    System.out.println("Três faces: " + f3);
    int f1 = (int) (Math.pow(n, 3.0) - (f2 + f3 + f0));
    System.out.println("Uma face: " + f1);

  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    var n = scanner.nextDouble();

    if (n >= 2 || n <= 100) {
      contCubo(n);
    }

    scanner.close();
  }
}