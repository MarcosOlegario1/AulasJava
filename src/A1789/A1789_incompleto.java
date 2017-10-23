/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package A1789;

import java.util.Scanner;

/**
 *
 * @author altieri_dalagnollo
 */
public class A1789_incompleto {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int lesmas;

        boolean veloInv = false;

        System.out.println("Quantas lesmas tem no grupo?");
        lesmas = in.nextInt();
        if (lesmas >= 1 && lesmas <= 500) {

            int qtdLesmas[] = new int[lesmas];

            for (int i = 0; i < qtdLesmas.length; i++) {
                System.out.println("Qual a velocidade da " + (i + 1) + "ª lesma");
                qtdLesmas[i] = in.nextInt();
            }

            int veloLesmas[] = new int[lesmas];

            for (int i = 0; i < qtdLesmas.length; i++) {
                System.out.println("Qual a velocidade da " + (i + 1) + "ª lesma em cm/h");
                veloLesmas[i] = in.nextInt();
                if (veloLesmas[i] >= 1 && veloLesmas[i] <= 50) {

                    System.out.println("");

                    for (int j = 0; j < veloLesmas.length; j++) {
                        for (int k = 0; k < veloLesmas.length - 1; k++) {
                            if (veloLesmas[k] < veloLesmas[k + 1]) {
                                int auxx = veloLesmas[k];
                                veloLesmas[k] = veloLesmas[k + 1];
                                veloLesmas[k + 1] = auxx;
                            }
                        }
                        
                    }

                } else {
                    System.out.println("A velocidade deve estar entre 1 cm/h e 50 cm/h!");
                    System.exit(0);
                    break;
                }
                System.out.println("Lesma mais rápida: " +veloLesmas[veloLesmas.length]);
            }

        } else {
            System.out.println("Deve haver pelo menos uma lesma, sendo o máximo 500!");
        }
    }
}
