/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examenfinal;

import java.util.Scanner;

/**
 *
 * @author jaret
 */
public class ExamenFinal {
 Scanner leer = new Scanner(System.in);
static  int opcion;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner leer = new Scanner(System.in);
        // TODO code application logic here
        System.out.println("ingrese una opcion");
        System.out.println("1 primer ejercicio");
        System.out.println("2 segundo ejercicio");
        System.out.println("3 tercer ejercicio");
        opcion = leer.nextInt();
        
        switch(opcion){
            case 1:
                primero();
                break;
            case 2:
                piramide();
                    break;
            case 3:
                vacauno();
                vacasdos();
                    break;
        }
       
    }
    public static void piramide(){
        Scanner leer = new Scanner(System.in);
        int numeros;
        System.out.println("ingrese un numero ");
        numeros = leer.nextInt();
       if(numeros %2 == 0){
           System.out.println("el numero ingresado es par");
       }else{
           System.out.println("");
           for(int altura = 1; altura <= numeros; altura++){
               for(int blancos = 1; blancos <= numeros - altura; blancos++){
                   System.out.print(" ");
               }
               for(int asteriscos = 1; asteriscos <= altura; asteriscos++){
                   System.out.print(" *");
               }
               System.out.println("");
           }
       }
    
    
    }

    
    public static void  primero(){
        Scanner leer = new Scanner(System.in);
    int a,b;
        System.out.println("ingrese el primer numero");
       a = leer.nextInt();
        System.out.println("ingrese el numero dos");
        b = leer.nextInt();
        System.out.println("el numero mayor es el siguiente ");
        if(a>b){
            System.out.println(a);
        }else{
            System.out.println(b);
    }
}
    
    public static void vacauno(){
    int numvacas = 8;
    int pesoMax = 1000;
     int[ ] pesoVacas =  {223,243,100,200,200,155,300,150};
     int[] produccion = {30,34,28,45,21,50,29,1};
        for (int i = 0; i < produccion.length; i++) {
            for (int j = 0; j < produccion.length-1; j++) {
                    if(produccion[j]>produccion[j+1]){
                        int temp = produccion[j];
                        produccion[j] = produccion[j+1];
                        produccion[j+1]= temp;
                        int temporalito = pesoVacas[j];
                        pesoVacas[j]= pesoVacas[j+1];
                        pesoVacas[j+1] = temporalito;
                    
                    }
            }
         
            }
       
        int sumaPeso=0;
        int sumalitros = 0;
       for (int j = produccion.length-1; j>=0; j--) {
               sumaPeso = sumaPeso + pesoVacas[j];
               sumalitros = sumalitros +produccion[j];
               if(sumaPeso > pesoMax){
                   sumaPeso = sumaPeso - pesoVacas[j];
                   sumalitros = sumalitros -produccion[j];
                   break;
               }
    }
        System.out.println("litros "+sumalitros);
        }
        
    public static  void vacasdos(){
      int numvacas = 10;
    int pesoMax = 2000;
     int[ ] pesoVacas =  {340,355,223,243,130,240,260,155,302,130};
     int[] produccion = {45,50,34,39,29,40,30,52,31,1};
        for (int i = 0; i < produccion.length; i++) {
            for (int j = 0; j < produccion.length-1; j++) {
                    if(produccion[j]>produccion[j+1]){
                        int temp = produccion[j];
                        produccion[j] = produccion[j+1];
                        produccion[j+1]= temp;
                        int temporalito = pesoVacas[j];
                        pesoVacas[j]= pesoVacas[j+1];
                        pesoVacas[j+1] = temporalito;
                    
                    }
            }
            
            }
    
        int sumaPeso=0;
        int sumalitros = 0;
       for (int j = produccion.length-1; j>=0; j--) {
               sumaPeso = sumaPeso + pesoVacas[j];
               sumalitros = sumalitros +produccion[j];
               if(sumaPeso > pesoMax){
                   sumaPeso = sumaPeso - pesoVacas[j];
                   sumalitros = sumalitros -produccion[j];
                   break;
               }
    }
        System.out.println("litros "+sumalitros);
        }
        
    }
        
    
