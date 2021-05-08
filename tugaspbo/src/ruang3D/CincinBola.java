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
public class CincinBola extends Bola
{
    double talibusur;
    double vCincinbola;
    double tinggiCincin;
    Scanner input_data = new Scanner(System.in);
    public void hitungvolume()
    {
        vCincinbola = ((1.0/6.0)*Math.PI*Math.pow(talibusur, 2)*tinggiCincin);
    }
    @Override
    public void setvalue()
    {
        System.out.print("Masukkan Panjang Tali Busur = ");
        talibusur = input_data.nextDouble();
        System.out.print("Masukkan Tinggi Cincin Trapesium = ");
        tinggiCincin = input_data.nextDouble();
        hitungvolume();
    }
    @Override
    public void display()
    {
        System.out.println("Volume Cincin Bola = "+vCincinbola);
    }
}
