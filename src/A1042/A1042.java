/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package A1042;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Nathan Not
 */
public class A1042 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int vet[] = new int[3];

        for (int i = 0; i < vet.length; i++) {
            System.out.println("Digite o " + (i + 1) + "º numero");
            vet[i] = in.nextInt();
        }

        int aux[] = Arrays.copyOf(vet, vet.length);

        for (int i = 0; i < vet.length; i++) {
            for (int j = 0; j < vet.length - 1; j++) {
                if (vet[j] > vet[j + 1]) {
                    int auxx = vet[j];
                    vet[j] = vet[j + 1];
                    vet[j + 1] = auxx;
                }
            }
        }

        System.out.println("\n\n\n");

        for (int i = 0; i < vet.length; i++) {
            System.out.println(vet[i]);
        }

        System.out.println();
        
        for (int i = 0; i < aux.length; i++) {
            System.out.println(aux[i]);
        }
    }

}
