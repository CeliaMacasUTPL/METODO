
package practica11;

public class ejercicio1 {
public static double iva=0.14;
    public static void main(String[] args) {
        double resultado;
        
        mensaje();
        resultado=IVA(524,iva);
        System.out.println("El calculo del IVA es: "+resultado);
    }   
    public static void mensaje(){
        System.out.println("Mensaje de la función mensaje");
    }
    public static double IVA(double costotal, double iva){
        double total;
        total=costotal*iva;
        return total;
    }
}

        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    
    

