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
public class TemberengBola extends Bola
{
    double tinggiTembereng;
    double ltembereng;
    double vtembereng;
    Scanner input_data = new Scanner(System.in);

    @Override
    public void hitungLuas()
    {
        ltembereng = (2*Math.PI*jarijari*tinggiTembereng);
    }
    @Override
    public void hitungvolume()
    {
        vtembereng = ((1.0/3.0)*Math.PI*Math.pow(tinggiTembereng, 2)*(3*jarijari-tinggiTembereng));
    }
    @Override
    public void setvalue()
    {
        super.setvalue();
        System.out.print("Masukkan Tinggi Tembereng = ");
        tinggiTembereng = input_data.nextDouble();
        hitungLuas();
        hitungvolume();
    }
    @Override
    public void display()
    {
        System.out.println("Luas Tembereng Bola = "+ltembereng+"\nVolume Tembereng Bola = "+vtembereng);
    }
}