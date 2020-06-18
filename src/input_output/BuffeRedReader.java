/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package input_output;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Asus
 */
public class  BuffeRedReader{
    public static void main(String[] args) {
     // Buat BuffeRedReader
BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
// br1 adalah variabel yang terbuat dari class buffered
try {
// Ambil data nama dari keyboard
System.out.print("Nama = ");
String nama = br1.readLine();
//Ambil data umur dari keyboard
System.out.print("Umur = ");
int umur = Integer.parseInt(br1.readLine());
// Print
System.out.println("nama " + nama + ". umur " + umur + " tahun.");
} catch (IOException ex) {
System.out.println("Error pada saat input data");
}
}
}
    
    

