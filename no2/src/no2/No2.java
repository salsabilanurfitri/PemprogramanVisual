/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package no2;

/**
 *
 * @author Labkom_M17
 */
import java.util.Scanner;
import java.util.Locale;
public class No2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       
    System.out.println("##  Program Java Biodata ##");
    System.out.println("=================================");
    System.out.println();
     
    String nama; 
    int usia;
    double tinggi_badan;
  
    System.out.print("Nama : ");
    nama = input.nextLine();
     
    System.out.print("Usia: ");
    usia = input.nextInt();
     
    System.out.print("Tinggi Badan: ");
    tinggi_badan = input.nextDouble();
     
    System.out.println();
     
    System.out.println("==================");
    System.out.println("Nama: "      + nama);
    System.out.println("Usia: "       + usia);
    System.out.println("Tinggi Badan: "  + tinggi_badan);
        // TODO code application logic here
    }
    
}
