package idade_obi;// Questão OBI 2019 fase 1

import java.util.Scanner;

public class Idade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        var M = scanner.nextInt();
        var A = scanner.nextInt();
        var B = scanner.nextInt();

        if((M < 110 || M > 40) && (A >= 1 && A < M) && (B >= 1 && B < M) && (A != B)){
            int C = M - (A + B);
            System.out.printf("%d\n", C);
        } else {
            System.out.println("Erro");
        }
    }
}

// Entrada:
// A primeira linha da entrada contém um inteiro M representando a idade de dona Mônica.
// A segunda linha da entrada contém um inteiro A representando a idade de um dos filhos.
// A terceira linha da entrada contém um inteiro B representando a idade de outro filho.

// Saída:
// Seu programa deve imprimir uma linha, contendo um número inteiro,
// representando a idade do filho mais velho de dona Mônica.

// Restrições:
// 40 ≤ M ≤ 110
// 1 ≤ A < M
// 1 ≤ B < M
// A ≠ B