/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.util.Scanner;//Se importa

/**
 *
 * @author Eduardo
 */
public class MaiinClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Se declaran variables
        int i; 
        int N;
        int contMas = 0; 
        int contMenos = 0;
        double media = 0;
        
        //Se lee número de personas
        do{
            System.out.print("Número de personas: ");
            N = sc.nextInt();
        }while(N<=0);
                
        //Se crea el array de tamaño N
        double[] alto = new double[N];
        //Leer alturas
        System.out.println("Lectura de la altura de las personas: ");
        for (i = 0; i < N; i++) {
            System.out.print("persona " + (i+1) + " = ");
            alto[i] = sc.nextDouble();
            media = media + alto[i]; //se suma la estatura leída para calcular la media
        }
        
        //Se calcula la media
        media = media / N;
    
        for (i = 0; i < alto.length; i++) {
            if (alto[i] > media){ //si la estatura es mayor que la media
                contMas++;
            } else if (alto[i] < media){ //si es menor
                contMenos++;
            }
        }
        
        
        System.out.println("Estatura media: " + media);
        System.out.println("Personas con estatura mayor a la media: " + contMas);
        System.out.println("Personas con estatura menor a la media: " + contMenos);
    }
}//Fin de la clase.
