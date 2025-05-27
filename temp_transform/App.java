package temp_transform;

import temp_transform.Transform;
import java.util.Scanner;

class App {
    public static void main(String args[]) {
        Scanner read = new Scanner(System.in);

        System.out.println("Insert a temperature value: ");
        int temp = read.nextInt();

        System.out.println("Insert a type for transformation (1 or 2): ");
        int type = read.nextInt();

        Transform transform = new Transform(type, String.valueOf(temp));
        transform.getResult();

        read.close();

    }
}