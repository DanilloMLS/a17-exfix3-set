package application;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class App {
    public static void main(String[] args) throws Exception {
        Set<Integer> estudantes = new HashSet<>();
        int a, b, c;
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos estudante no curso A?");
        a = sc.nextInt();
        for (int i = 0; i < a; i++) {
            estudantes.add(sc.nextInt());
        }

        System.out.println("Quantos estudantes no curso B?");
        b = sc.nextInt();
        for (int i = 0; i < b; i++) {
            estudantes.add(sc.nextInt());
        }

        System.out.println("Quantos estudantes no curso C?");
        c = sc.nextInt();
        for (int i = 0; i < c; i++) {
            estudantes.add(sc.nextInt());
        }

        System.out.println("Total de estudantes:");
        System.out.println(estudantes.size());
        
        sc.close();
    }
}
