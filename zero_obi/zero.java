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
      values.add(in);
      System.out.println(i);

      if (values.contains(0)) {
        System.out.println("caiu");
        var index = values.get(i);
        values.remove(index -= 1);
      }

    }

    int sum = values.stream().mapToInt(Integer::intValue).sum();

    System.out.println(sum);

    scanner.close();

  }
}