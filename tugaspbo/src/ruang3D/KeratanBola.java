/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ruang3D;
import java.util.Scanner;
/*
Anggota Kelompok:
    Waffiq Aziz (123190070)
    Muhammad Khadafie Satya Sudarto (123190072)
    Shean Michael Aqshafa Ditamaputra (123190096)
*/
public class KeratanBola extends Bola
{
    double lkeratanbola;
    double vkeratanbola;
    private double jarijariA;
    private double jarijariB;
    private double tinggiAB;
    Scanner input_data = new Scanner(System.in);
    @Override
    public void hitungLuas()
    {
        lkeratanbola = (0.5*Math.PI*Math.pow(jarijariA, 2)*tinggiAB + 0.5*Math.PI*Math.pow(jarijariB, 2)*tinggiAB + (1.0/6.0)*Math.pow(tinggiAB, 6));
    }
    public void hitungvolume()
    {
        vkeratanbola = (0.5*Math.PI*Math.pow(jarijariA, 2)*tinggiAB + 0.5*Math.PI*Math.pow(jarijariB, 2)*tinggiAB + (1.0/6.0)*Math.pow(tinggiAB, 6));
    }
    @Override
    public void setvalue() 
    {
        System.out.print("Masukkan Tinggi Antara 2 Bidang = ");
        tinggiAB = input_data.nextDouble();
        System.out.print("Masukkan Jari - Jari Bidang A = ");
        jarijariA = input_data.nextDouble();
        System.out.print("Masukkan Jari - Jari Bidang B = ");
        jarijariB = input_data.nextDouble();
        hitungLuas();
        hitungvolume();
    }
    @Override
    public void display() {
        System.out.println("Luas Keratan Bola = "+lkeratanbola+"\nVolume Keratan Bola = "+vkeratanbola);
    }
}
