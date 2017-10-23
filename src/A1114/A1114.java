/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package A1114;

import java.util.Scanner;

/**
 *
 * @author Marcos.Olegario
 */
public class A1114 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int senha = 2002;
        int digitado;

        do {
            System.out.print("Digite a senha: ");
            digitado = in.nextInt();
            if (digitado != senha) {
                System.out.println("Senha Invalida\n\n\n\n\n\n");
            }
        } while (digitado != senha);

        System.out.println("Acesso Permitido");
    }

}
