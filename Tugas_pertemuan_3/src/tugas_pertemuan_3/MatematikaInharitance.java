/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugas_pertemuan_3;

/**
 *
 * @author ACER i7
 */
public class MatematikaInharitance {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Matematika matematika = new Matematika();
        Matematika2 matematika2 = new Matematika2();
        int a = 20;
        int b = 10;

        System.out.println("Penambahan a=20, b=10 : " + matematika.tambah(a, b));
        System.out.println("Pengurangan a=10, b=5 : " + matematika.kurang(a, b));
        System.out.println("Perkalian a=10, b=3 : " + matematika.kali(a, b));
        System.out.println("Pembagian a=21, b=2 : " + matematika.bagi(21, 2));
        System.out.println("Modulus dari angka pertambahan a=20, b=10 : " + matematika2.modulus(20, 10));
        System.out.println("Modulus dari angka pengurangan a=10, b=5 : " + matematika2.modulus(10, 5));
        System.out.println("Modulus dari angka perkalian a=10, b=3 : " + matematika2.modulus(10, 3));
        System.out.println("Modulus dari angka pembagian a=21, b=2 : " + matematika2.modulus(21, 2));
    }
}

