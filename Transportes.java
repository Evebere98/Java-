package transportes;

import java.util.Scanner;

public class Transportes {

    
public static void main(String[] args) {
         String msg;
        int combustible;
        Scanner leer = new Scanner(System.in);
        
        
        System.out.println("\n\n Instancia de Automovil");
        Automovil tsuru = new Automovil(20);
        
        msg = tsuru.SistemaElectrico();
        System.out.println(msg);
        msg = tsuru.SistemaFrenos();
        System.out.println(msg);
        msg = tsuru.Manejo();
        System.out.println(msg);
        msg = tsuru.Apagar();
        System.out.println(msg);
        
        System.out.println("\n\n Segunda instancia de Automovil");
        Automovil carrito = new Automovil();
        
        
        System.out.println("\n\n Instancia de Autobus");
        Autobus camion1 = new Autobus();
        
        System.out.println("Para agregar gasolina presione '1': ");
        combustible = leer.nextInt();
        camion1.setCombustible(combustible);
        msg = camion1.EncenderMotor(combustible);
        System.out.println(msg);
        msg = camion1.SistemaElectrico();
        System.out.println(msg);
        msg = camion1.Acelerar(combustible);
        System.out.println(msg);
        msg = camion1.SistemaFrenos();
        System.out.println(msg);
        msg = camion1.Manejo();
        System.out.println(msg);
        msg = camion1.Apagar();
        System.out.println(msg);
        
        
        
        
        
        
    }
    }
    

