package practica2;

public class Practica2 {

    public static void main(String[] args) {
        
        Calculadora opc = new Calculadora();
        int d = 0;
        int m = 0;
        int s = 0;
        int r = 0;
        d = opc.Divicion(20,5);
        m = opc.Multiplicacion(12,4);
        s = opc.suma(4, 21);
        r = opc.resta(25, 7);
        System.out.println("El resultado de la divicion es:" +d);
        System.out.println("El resultado de la multiplicacion es:" +m);
        System.out.println("El resultado de la suma es:" +s);
        System.out.println("El resultado de la resta es:" +r); 
        //System.out.println(opc.suma(12, 43));
        
        //Calculadora lanix = new Calculadora(1, 1);
    }
    
}

//Imprimir todos los resultados con la operacion 