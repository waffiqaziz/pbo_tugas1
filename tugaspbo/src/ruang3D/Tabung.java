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
public class Tabung extends Lingkaran
{
  double tinggiTabung;
  double ltabung;
  double vtabung;
  Scanner input_data = new Scanner(System.in);

  @Override
  public void hitungLuas()
  {
    ltabung = (2*luasLingkaran+(2*Math.PI*jarijari*tinggiTabung));
  }
  public void hitungvolume()
  {
    vtabung = (luasLingkaran*tinggiTabung);
  }
  @Override
  public void setvalue() 
  {
    super.setvalue();
    System.out.print("Masukkan Tinggi Tabung = ");
    tinggiTabung = input_data.nextDouble();
    super.hitungLuas();
    hitungLuas();
    hitungvolume();
  }
  @Override
  public void display()
  {
    System.out.println("Volume Tabung = "+vtabung+"\nLuas Tabung = "+ltabung);
  }
}
