/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package A1142;

import java.util.Scanner;

/**
 *
 * @author Nathan Not
 */
public class A1142 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Digite o numero de linhas");
        int linhas = in.nextInt();

        for (int i = 0; i < linhas; i++) {
            int n = i * 4;
            for (int j = 0; j < 3; j++, n++) {
                System.out.print((n + 1) + " ");
            }
            System.out.println("PUM");
        }
    }

}
