package practica2;

public class Calculadora implements ICalculadora {

    public int a;
    public int b;
    
    @Override
    public int suma(int a, int b) {
    return a+b;   
    }

    @Override
    public int resta(int a, int b) {
    return a-b;
    }
    
    
    public int Multiplicacion(int a, int b){
    
        return a*b;
    }
    
    public int Divicion (int a, int b){
        
        return a/b;
    }

    public Calculadora() {
    }
    
    public Calculadora(int a, int b){
      this.a = a;
      this.b = b;
      
        System.out.println(this.Divicion(a, b));
        System.out.println(this.Multiplicacion(a, b));
        System.out.println(this.suma(a, b));
        System.out.println(this.resta(a, b));
    }
    
}
//this sirve para acceder a los elementos de la misma clase
// super sirve para acceder a los elementos de la clase padre
//como usar el eval 
