package Sobreescritura;

/*No� Jonat�n G�mez Hern�ndez 
CARNE: 7690-20-16812
INGENIERIA EN SISTEMAS
SECCION: " A" */

public class SubclaseSobreescritura extends SuperclaseSobreescritura {
    
    public static final long serialVersionUID = 700L;

    public SubclaseSobreescritura(int x, int y) {
        super(x, y);
    }
    
    @Override
    public int operar(int x, int y){
        z=x-y;
        return z;
    }
    
}