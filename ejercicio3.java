
package practica11;

import java.util.Scanner;

public class ejercicio3 {
    //Costo de matricula en la UTPL
     public static double iva=0.12;
    public static void main(String[] args) {
        Scanner dato=new Scanner(System.in);
        //Creación de variables
        int mat1,mat2,beca1,eleccion,costo1,costo2,costotal;
        double IVA,subtotal,descuento,totalpagar;
        
        //Variables desde teclado
      
        System.out.println("Matriculas UTPL ");
       
        
        //Presentación de las opciones disponibles
        System.out.println();
        System.out.println("CICLOS");
        System.out.println();
        System.out.println("1. Primer ciclo ");
        System.out.println("3. Tercer ciclo");
        System.out.println("5. Quinto ciclo");
        System.out.println("7. Séptimo ciclo");
        System.out.println("9. Noveno ciclo");
        System.out.print("Elija el ciclo al que va a ingresar: ");
        eleccion=dato.nextInt();
        
        //MATERIAS
        System.out.println();
        System.out.println("MATERIAS");
        System.out.println();
        System.out.print("Número de materias Troncales: ");
        mat1=dato.nextInt();
        System.out.print("Número de materias Genéricas: ");
        mat2=dato.nextInt();
        
        //BECAS
        System.out.println();
        System.out.println("BECAS");
        System.out.println();
        System.out.println("1. Méritos");
        System.out.println("2. Familiar");
        System.out.println("3. Ninguna");
        System.out.print("Elija el tipo de beca que posee: ");
        beca1=dato.nextInt();
        
        //Procesos
        costo1=eleccion(eleccion);
        costo2=materia(mat1,mat2);
        
        //Costo total
        costotal=costo1+costo2;
        
        //IVA
        IVA=IVA(costotal,iva);
        
        //Subtotal
        subtotal=costotal+IVA;
        
       //BECAS
       descuento=becas(beca1,subtotal);
       
       //TOTAL A PAGAR+
       totalpagar=subtotal-descuento;
       
       //Salida en pantalla
       System.out.println();
       System.out.println("Factura");
       System.out.println();
       System.out.println("Costo total: $"+costotal);
       System.out.println("IVA: $"+IVA);
       System.out.println("Subtotal: $"+subtotal);
       System.out.println("Descuento: $"+descuento);
       System.out.println("Total a pagar: $"+totalpagar);
        
    }
    public static int eleccion (int eleccion){
        int pago=0;
        if(eleccion==1){
            pago=700;
        }
         if(eleccion==3){
            pago=720;
        }
          if(eleccion==5){
            pago=740;
        }
         if(eleccion==7){
            pago=760;
        }
         if(eleccion==9){
            pago=780;
        }
       return pago;
    }
    public static int materia(int mat1,int mat2){
            int credi1, credi2,tota1,tota2,total;
            
            //Calculo de creditos materias troncales
            credi1=mat1*4;
            //Calculo de matricula por materias troncales
            tota1=credi1*35;
            //Calculo de creditos materias genéricas
            credi2=mat2*3;
            //Calculo de matricula por materias genéricas
            tota2=credi2*35;
            //Calculo del total a pagar por materias
            total=tota1+tota2;
            return total;           
    }
    public static double IVA(double costotal, double iva){
        double total;
        total=costotal*iva;
        return total;
    }
    public static double becas(int beca1, double subtotal){
        double desc=0;
        if(beca1==1){
            desc=subtotal*0.15;
        }
        if(beca1==2){
            desc=subtotal*0.08;
        }
        return desc;
    }
}
    

