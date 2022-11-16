/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decision3;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class Decision3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a,perangko;
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan surat");
        a = input.nextInt();
        perangko=a/5;
        if (a % 5 ==0)
        {
            System.out.println(perangko);
        }
        else
        {
            System.out.println();
        }
        // TODO code application logic here
    }
    
}
