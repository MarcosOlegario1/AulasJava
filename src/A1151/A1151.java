/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package A1151;

import java.util.Scanner;

/**
 *
 * @author Nathan Not
 */
public class A1151 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Digite o numero limite: ");
        int limite = in.nextInt();

        int a = 0, b = 1;

        for (int i = 0; i < limite; i++) {
            System.out.print(a + " ");
            b += a;
            a = b - a;
        }
        
        System.out.println();
    }

}
