package camisetas_obi;

import java.util.ArrayList;
import java.util.Scanner;

public class camisetas {

    public static void Calc(int num, int x, int y, int contX, int contY){
        if (num >= (contX + contY)) {
            if (x <= contX && y <= contY) {
                System.out.println("S");
        } else {
            System.out.println("N");
        }
        } else {
            System.out.println("N");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        
        ArrayList<Integer> t = new ArrayList<>();

        if (n >= 1 && n <= 1000) {
            for(int i = 0; i < n; i++){
                int value = scanner.nextInt();

                if(value == 1 || value == 2 ){
                t.add(value);
                }
            }

            int p = scanner.nextInt();
            int m = scanner.nextInt();
             
            int contP = 0;
            int contM = 0;

            for (int z = 0; z < n; z++){
                if(t.get(z) == 1){
                    contP++;

                } else if (t.get(z) == 2) {
                    contM++;
                }
            }

            Calc(n, p, m, contP, contM);
        }

        scanner.close();
    }    
}
