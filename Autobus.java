public class Autobus extends Atransporte implements itransporte{
     private int combustible = 0;
    
    
    public String  EncenderMotor(int combustible){
        String msg;
        if (combustible == 1){
             msg = "Enciende motor";   
        }else{
            msg= "No hay gasolina";
        }       
    return msg;
    }
    public String Acelerar(int combustible){
        if(combustible == 1){
            return"Aumentando velocidad";
        }else{
            return "Sin gasolina no se puede acelerar";
        }
    }
            
        //Metodos heredados
    @Override
    public String Apagar(){
        return "Apagando motor";
    }
    @Override
    public String Manejo(){
        return "Girando a la derecha";
    }
    @Override
    public String SistemaFrenos(){
        return "Activando el sistema de frenado";
    }
    @Override
    public String SistemaElectrico(){
        return "Activando el sistema electrico";
    }
    
    
        //Metodos set 
    public void setCombustible(int combustible){
        this.combustible = combustible;
    }
    
}
