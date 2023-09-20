/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package no5;

/**
 *
 * @author Labkom_M17
 */
import java.util.Scanner;
public class No5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner masuk = new Scanner(System.in);
        int i, n;
        float jum, x, rata;
        System.out.print ("Banyaknya Data: ");
        n = masuk.nextInt();
        jum=0;
        i=1;
        while (i<=n){
                System.out.print ("Data ke-"+i+": ");
                x=masuk.nextFloat ();
                jum += x;
                i++;
        }
        rata = jum / n;
        System.out.println ("Rata-rata: "+rata);
        System.out.println ("Jumlah: "+jum);
        // TODO code application logic here
    }
    
}
