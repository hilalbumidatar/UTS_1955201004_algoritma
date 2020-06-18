/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package input_output;

import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class persegi {
    public static void main(String[] args) {
    int panjang, lebar, luas;
    Scanner scan = new Scanner(System.in);
    System.out.print("Masukkan panjang : ");
    panjang = scan.nextInt();
    System.out.print("Masukkan lebar : ");
    lebar = scan.nextInt();
    luas = panjang * lebar;
    System.out.println("Luas Persegi Panjang adalah " + luas);
  }
}

   
    

