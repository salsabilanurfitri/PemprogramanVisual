/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package no3;

/**
 *
 * @author Labkom_M17
 */
import java.util.Scanner;
public class No3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int angka1, angka2, add, subtract, multiply;
    float devide;
    Scanner scanner = new Scanner(System.in);

    System.out.print("Masukkan 2 Angka : ");
    angka1 = scanner.nextInt();
    angka2 = scanner.nextInt();

    add = angka1 + angka2;
    subtract = angka1 - angka2;
    multiply = angka1 * angka2;
    devide = (float) angka1 / angka2;

    System.out.println("Sum = " + add);
    System.out.println("Difference = " + subtract);
    System.out.println("Multiplication = " + multiply);
    System.out.println("Division = " + devide);
        // TODO code application logic here
    }
    
}
