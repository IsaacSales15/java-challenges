package botas_obi;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.lang.Math;

public class botas {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    List<Integer> values = new ArrayList<>();
    List<String> briewes = new ArrayList<>();

    int n = scanner.nextInt();
    int contD = 0;
    int contE = 0;
    int contM = 0;

    if (n >= 2 && n <= Math.pow(10, 4) && n % 2 == 0) {
      for (int i = 0; i < n; i++) {
        int m = scanner.nextInt();

        String l = scanner.nextLine();

        if (values.contains(m)) {
          contM++;
          if (l.equalsIgnoreCase("d")) {
            contD++;
            System.out.println(contD);
          }
          if (l.equalsIgnoreCase("e")) {
            contE++;
            System.out.println(contE);
          }
        }

        values.add(m);

        if (contD == contE && contM % 2 == 0) {
          System.out.println((contD + contE) / 4);
        }

      }

    }

    scanner.close();
  }
}
