/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bidang2D;
import java.util.Scanner;
/*
Anggota Kelompok:
    Waffiq Aziz (123190070)
    Muhammad Khadafie Satya Sudarto (123190072)
    Shean Michael Aqshafa Ditamaputra (123190096)
*/
public class Lingkaran implements Bidang2D
{
  protected int jarijari = r;
  protected double kelilingLingkaran = keliling;
  protected double luasLingkaran = luas;
  Scanner input1 = new Scanner(System.in);

  @Override
  public void hitungKeliling() 
  {
    kelilingLingkaran  = 2 * Math.PI * jarijari;
  }
  @Override
  public void hitungLuas() 
  {
    luasLingkaran  = Math.PI * jarijari * jarijari;
  }
  public void display()
  {
    System.out.println("Luas Lingkaran = "+luasLingkaran + "\nKeliling Lingkaran = " + kelilingLingkaran);
  }
  public void setvalue()
  {
    System.out.print("Masukan Jari - jari = ");
    jarijari = input1.nextInt();
    hitungLuas();
    hitungKeliling();
  }
}
