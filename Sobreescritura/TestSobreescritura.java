package Sobreescritura;

/*Noé Jonatán Gómez Hernández 
CARNE: 7690-20-16812
INGENIERIA EN SISTEMAS
SECCION: " A" */

import java.util.Scanner;

public class TestSobreescritura {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
              
        System.out.println("Por favor Ingrese un numero:");
        int x = in.nextInt();
        
        System.out.println("Ingrese un segundo numero por favor");
        int y = in.nextInt();
        
        SubclaseSobreescritura sc = new SubclaseSobreescritura(x, y);
        
        System.out.println(x + " - " + y + " = " + sc.operar(x, y));
    }   
}
