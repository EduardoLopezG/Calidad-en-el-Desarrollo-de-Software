/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.util.Scanner;//Se importa.

/**
 *
 * @author Eduardo
 */
public class MainClass {
    private static int num;
    private static double var;//Varianza.
    private static double desviacion;
    private static double media;
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("¿Cuantos valores Ingresará?");//Mensaje.
        num = scanner.nextInt();
        
        //###############
        double values[] = new double[num];
        for (int i = 0; i < num; i++) {
            System.out.println("Ingrese El Número: "+(i+1)+":");//Mensaje.
            values[i] = scanner.nextDouble();
        }//Fin de For.
        //#################
        double sum = 0;
        for (double i : values) {
            sum = sum+i;
        }
        //################
        media = sum/num;
        double redondear = Math.rint(media*100)/100;
        System.out.println("La Media es :"+redondear);//Se imprime resultado de la Media.
        
        //################
        double rango;
        for (int i = 0; i <num; i++) {
            rango = Math.pow(values[i] - media,2);
            var = var + rango;
        }//Fin de for.
        var = var / (num-1);
        desviacion = Math.sqrt(var);
        double redondear2 = Math.rint(desviacion*100)/100;
        System.out.println("La desviación es: "+redondear2);//Se imprime el resultado de la desviación.
    }
}//Fin de la clase.
