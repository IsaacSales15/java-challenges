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

//OBI 2021 - Fase 1

//Entrada
//A primeira linha da entrada contém um inteiro N, 
//a quantidade de números inteiros (incluindo os "zeros") que o seu chefe falou ao telefone. 
//Cada uma das N linhas seguintes contém um número inteiro Xi.

//Saída
//Seu programa deve produzir uma única linha na saída, 
//contendo um único inteiro, a soma correta dos números, 
//levando em conta que o valor 0 significa erro, conforme descrito.