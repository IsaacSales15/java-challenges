package zero_obi;

import java.util.ArrayList;
import java.util.Scanner;

class zero {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    var n = scanner.nextInt();

    ArrayList<Integer> values = new ArrayList<>();

    for (int i = 0; i < n; i++) {
      var in = scanner.nextInt();

      if (in == 0 && !values.isEmpty()) {
        values.remove(values.size() - 1);
      } else {
        values.add(in);
      }
    }

    int sum = values.stream().mapToInt(Integer::intValue).sum();
    System.out.println(sum);

    scanner.close();

  }
}