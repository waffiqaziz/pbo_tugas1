/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ruang3D;
import java.lang.Math;
import bidang2D.Lingkaran;
import java.util.Scanner;
/*
Anggota Kelompok:
    Waffiq Aziz (123190070)
    Muhammad Khadafie Satya Sudarto (123190072)
    Shean Michael Aqshafa Ditamaputra (123190096)
*/
public class Kerucut extends Lingkaran
{
    double luasKerucut = luas;
    double kelilingKerucut;
    double sisimiring;
    double tinggiKerucut = tinggi;
    Scanner input_data = new Scanner(System.in);

    void hitungsisimiring()
    {
        sisimiring = (Math.sqrt((Math.pow(jarijari, 2)) + (Math.pow(tinggiKerucut, 2))));
    }
    @Override
    public void hitungKeliling()
    {
        kelilingKerucut = (Math.PI*jarijari*(jarijari+sisimiring));
    }
    @Override
    public void hitungLuas()
    {
        luasKerucut = ((1.0/3.0)*Math.PI *jarijari *tinggiKerucut);
    }
    @Override
    public void setvalue() 
    {
        super.setvalue();
        System.out.print("Masukkan Tinggi Kerucut = ");
        tinggiKerucut = input_data.nextDouble();
        hitungsisimiring();
        hitungLuas();
        hitungKeliling();
    }
    @Override
    public void display()
    {
        System.out.println("Luas Kerucut = "+luasKerucut+"\nKeliling Kerucut = "+kelilingKerucut);
    }
}
