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
    int contL = 0;
    int contM = 0;

    if (n >= 2 && n <= Math.pow(10, 4) && n % 2 == 0) {
      for (int i = 0; i < n; i++) {
        int m = scanner.nextInt();

        String l = scanner.nextLine();

        if (values.contains(m)) {
          contM++;
          if (briewes.contains(l)) {
            contL++;
          }
        }

        briewes.add(l);
        values.add(m);

        System.out.println(contL);
        System.out.println(contM);

      }

    }

    scanner.close();
  }
}
