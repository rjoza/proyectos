/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arreglo;

import java.util.Scanner;

/**
 *
 * @author ronny.joza
 */
public class Arreglo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
     int[][]numeros = new int[3][3];
     Scanner sc = new Scanner(System.in);
     
     for(int i=0;i<3;i++)
     {
         for(int j=0;j<3;j++)
         {
             System.out.println("Ingrese el número para la posicion Fila:"+i+"Columna:"+j);
             numeros[i][j]=sc.nextInt();
         }
     }
     
     for(int i=0;i<3;i++)
     {
         for(int j=0;j<3;j++)
         {
             System.out.print(numeros[i][j]);
             System.out.print("\t");
             
         }
         System.out.print("\n");
     }
     
        
    
}
}