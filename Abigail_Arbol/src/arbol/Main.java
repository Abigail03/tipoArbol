/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arboles;
/**
 *
 * @author Abigail
 */
public class Main {
 
    
    public static void main(String[] args) {
        java.util.Scanner leer=new java.util.Scanner(System.in);
        arbol x=new arbol();
        int z;
        System.out.print("Ingrese el numero de Datos a capturar: ");
        z=leer.nextInt();
        for(int i=1; i<=z;i++){
        int m;
        System.out.println("Ingrese Dato "+i+":  ");m=leer.nextInt();
        x.alta(m);
        }
        
        System.out.println("Valores Capturados en PreOrden:");
        x.imprimirpreorden();
        int q;
        System.out.println("\nValores Capturados en InOrden:");  
        x.imprimirInorden();
        System.out.println("\nValores Capturados en Postorden:");  
        x.imprimirPostorden();
        
        
     System.out.print("\nIngrese dato a borrar: ");q=leer.nextInt();
     x.baja(q);System.out.println("\nDespues de borrar el dato "+q+" :");
     //x.impririnorden(no);
    }
 
}



    
    

