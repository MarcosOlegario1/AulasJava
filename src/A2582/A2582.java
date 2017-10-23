/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package A2582;

import java.util.Scanner;

/**
 *
 * @author Marcos.Olegario
 */
public class A2582 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String Scasos = in.next();
        int casos = Integer.parseInt(Scasos); // buga o next (pula)
        
        String musicas[] = new String[casos];

        for (int i = 0; i < casos; i++) {
            String var = in.next();

            String tal[] = var.split(" "); // N TA FUNCIONANDO, N SEI PQ

            int total = 0;
            for (String tal1 : tal) {
                total += Integer.parseInt(tal1);
            }

            musicas[i] = musica(total);
        }
        
        System.out.println();
        
        for (String musica : musicas) {
            System.out.println(musica);
        }
    }

    public static String musica(int n) {
        switch (n) {
            case 0:
                return "PROXYCITY";
            case 1:
                return "P.Y.N.G.";
            case 2:
                return "DNSUEY!";
            case 3:
                return "SERVERS";
            case 4:
                return "HOST!";
            case 5:
                return "CRIPTONIZE";
            case 6:
                return "OFFLINE DAY";
            case 7:
                return "SALT";
            case 8:
                return "ANSWER!";
            case 9:
                return "RAR?";
            case 10:
                return "WIFI ANTENNAS";
            default:
                return "Musica Invalida";
        }
    }

}
