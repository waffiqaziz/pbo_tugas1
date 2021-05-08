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
public class JuringBola extends Bola
{
    double tinggiJuring;
    double ljuringbola;
    double vjuringbola;
    Scanner input_data = new Scanner(System.in);
    @Override
    public void hitungLuas() 
    {
        ljuringbola = (double) (2*Math.PI*jarijari*tinggi);
    }
    @Override
    public void hitungvolume()
    {
        super.hitungLuas();
        vjuringbola = (double) (luasLingkaran*(2.0/3.0)*tinggiJuring);
    }
    @Override
    public void setvalue()
    {
        super.setvalue();
        System.out.print("Masukkan Tinggi Juring = ");
        tinggiJuring = input_data.nextDouble();
        hitungLuas();
        hitungvolume();
    }
    @Override
    public void display()
    {
        System.out.println("Luas Juring Bola = "+ljuringbola+"\nVolume Juring Bola = "+vjuringbola);
    }
}
