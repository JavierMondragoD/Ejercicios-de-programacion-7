/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author JOSE JAVIER
 */
public class ParteDecimal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner ingreso = new Scanner(System.in);
    double real, decimal;
    int realEnt;
   
    System.out.print("Ingresa un nro. real: ");
    real = ingreso.nextDouble();
    realEnt = (int)real;
    decimal = real - realEnt;
   
    System.out.printf("La parte decimal es: %f\n", decimal);
    }
    
}
