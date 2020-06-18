/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package percabangan;

/**
 *
 * @author Asus
 */
public class ifelse {
        public static void main(String[] args) {
        int nilai = 80;
        char grade = 0;

        if(nilai >= 90){
            System.out.println("grade = A");
        } else if (nilai <= 89 && nilai >=80) {
            System.out.println("grade = B");
        } else if (nilai <= 79 && nilai >=70) {
            System.out.println("grade = C");
        } else if (nilai <= 69 && nilai >=60) {
            System.out.println("grade = D");
        } else if (nilai <= 59 && nilai >=50) {
            System.out.println("grade = E");
        } else{
            System.out.println("grade = F");
        }

        System.out.println("Selamat Dan Terus Semangat Belajar");
    }
}    


