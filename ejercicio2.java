
package practica11;

import java.util.Scanner;

public class ejercicio2 {
    // Cálculo del IVA mas descuento con funciones
     public static double iva=0.14;
    public static void main(String[] args) {
        Scanner dato=new Scanner(System.in);
        
        //Creación de variables
        double resultado,costotal,subtotal,desc=0,total;
        int tipo;
        
        //Pedir  variables a usuario por teclado.
        System.out.println("1. Pública ");
        System.out.println("2. Privada");
        System.out.println("3. Persona natural");
        System.out.print("Elija el tipo de empresa: ");
        tipo=dato.nextInt();
        System.out.print("Escriba el costo total: ");
        costotal=dato.nextDouble();
        
        //Llamo a la función IVA
        resultado=IVA(costotal,iva);
        //Elimino decimales
        resultado=resultado-0.000000000000002;
        //calculo el subtotal: costo total + IVA
        subtotal=costotal+resultado;
        //llamo a la función DESCUENTO
        desc=descuento(tipo,subtotal);

       
        //calculo del total a pagar
        total=subtotal-desc;
        
        //Salida de valores
        System.out.println();
        System.out.println("Costo total: "+costotal);
        System.out.println("IVA: "+resultado);
        System.out.println("Subtotal: "+subtotal);
        System.out.println("Descuento: "+desc);
        System.out.println("Total a pagar: "+total);
        

    }   
    public static double IVA(double costotal, double iva){
        double total;
        total=costotal*iva;
        return total;
    }
    public static double descuento(int tipo, double subtotal){
        double desc=0;
        if(tipo==1){
            desc=subtotal*0.06;
        }
        if(tipo==2){
            desc=subtotal*0.02;
        }
        if(tipo==3){
            desc=subtotal*0.08;
        }
        return desc;
    }
}
    

