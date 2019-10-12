package transportes;

public class Automovil extends Atransporte implements itransporte {
    private int combustible;
    

    public Automovil(int combustible){
        //this.combustible = combustible;    
        System.out.println(EncenderMotor(combustible));
    }
    
    public Automovil(){
       System.out.println(EncenderMotor()); 
    }
    
    @Override
    public String Apagar() {
        return"Apagar automovil";
    }

    @Override
    public String SistemaFrenos() {
        return"Activar sistema de frenos";
    }

    @Override
    public String SistemaElectrico() {
        return"Encender sistema electrico";
    }
    
    @Override
    public String Manejo(){
        return"Mover a la derecha";
    }
    
    public String Acelerar(int combustible){
        return"Acelera";    
    }
    
    private String  EncenderMotor(int combustible){
        return"Enciende motor";    
    }
    
    private String  EncenderMotor(){
        return"Enciende motor";    
    }

}
