package Sobreescritura;

/*Noé Jonatán Gómez Hernández 
CARNE: 7690-20-16812
INGENIERIA EN SISTEMAS
SECCION: " A" */

public class SuperclaseSobreescritura {

    private int x;
    private int y;
    public int z;
    
    public SuperclaseSobreescritura(int x, int y) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public int operar(int x, int y) {
        z = x + y;
        return z;
    }
}
