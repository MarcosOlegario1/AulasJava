/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package A1045;

import java.util.Scanner;

public class A1045 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        float vet[] = new float[3];
        
        for (int i = 0; i < vet.length; i++) {
            System.out.println("Digite o " +(i+1) +"º numero");
            vet[i] = in.nextFloat();
            System.out.println("\n");
        }
        
        for (int i = 0; i < vet.length; i++) {
            for (int j = 0; j < vet.length-1; j++) {
                if(vet[j] < vet[j+1]){
                    float auxx = vet[j];
                    vet[j] = vet[j+1];
                    vet[j+1]=auxx;
                }
            }
        }
        
        for (int i = 0; i < vet.length; i++) {
            System.out.println(vet[i]);
        }
        
        System.out.println();
        
        float a = vet[0];
        float b = vet[1];
        float c = vet[2];
        
        if(a >= b+c){
            System.out.println("NAO FORMA TRIANGULO");
        } else if (a*2 > (b*2 + c*2)){
            System.out.println("TRIANGULO OBTUSANGULO");
        } else if (a*2 < (b*2 + c*2)){
            System.out.println("TRIANGULO ACUTANGULO");
        } else if (a==b && b==c){
            System.out.println("TRIANGULO EQUILATERO");
        } else if ((a*2)==b*2+c*2){
            System.out.println("TRIANGULO RETANGULO");
        } else if (a==b && b != c){
            System.out.println("TRIANGULO ISOSCELES");
        } else if (b==c && b != a){
            System.out.println("TRIANGULO ISOSCELES");
        } else if (a==c && b != a ){
            System.out.println("TRIANGULO ISOSCELES");
        }
        
    }
    
}
