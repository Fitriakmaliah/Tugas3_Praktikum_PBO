/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugas_pertemuan_3;

/**
 *
 * @author ACER i7
 */
public class DemoKonversiSuhu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        KonversiSuhu2 KonversiSuhu2 = new KonversiSuhu2();
        double celsius = 25.0;
        double fahrenheit = KonversiSuhu2.celciusToFahrenheit(celsius);
        double reamur = KonversiSuhu2.celciusToReamur(celsius);
        double fahrenheitToReamur = KonversiSuhu2.fahrenheitToReamur(fahrenheit);

        System.out.println("Celsius ke Fahrenheit : " + fahrenheit);
        System.out.println("Celsius ke Reamur : " + reamur);
        System.out.println("Fahrenheit ke Reamur : " + fahrenheitToReamur);
    }
}

