package proyectocalc;

import java.util.Scanner;


public class Calculadora {

 
    public Calculadora(int a, int b) {
     suma(a, b);
     resta(a, b);
     }
    
    public Calculadora (){
    }
   
    Scanner entrada = new Scanner(System.in);
   
    public void suma (int a,int b){
        int suma;
        System.out.println("Ingrese valor de a:");
        a = entrada.nextInt();
        System.out.println("Ingrese valor de b:");
        b = entrada.nextInt();
        suma = a+b;   
        System.out.println("Resultado:" +suma); 
    }
    
    public int resta(int a, int b){
        int resta;
        System.out.println("Ingrese valor de a:");
        a = entrada.nextInt();
        System.out.println("Ingrese valor de b:");
        b = entrada.nextInt();
        resta = a-b;
        System.out.println("Resultado:" +resta);
        return resta;
    }
}

