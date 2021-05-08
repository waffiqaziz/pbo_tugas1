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
public class KerucutTerpancung extends Kerucut
{
    double jarijarikecil;
    double vKerucutkecil;
    double lKerucutkecil;
    double tKerucutkecil;
    Scanner input_data = new Scanner(System.in);

    @Override
    public void hitungLuas()
    {
        super.hitungsisimiring(); //tinggi yang dimasukin yang kerucut kecil
        lKerucutkecil = (Math.PI*sisimiring*(jarijari+jarijarikecil)+Math.PI*(Math.pow(jarijari, 2)+Math.pow(jarijarikecil, 2)));
    }
    public void hitungVolume() 
    {
        vKerucutkecil = ((1.0/3.0)*Math.PI*tKerucutkecil*(Math.pow(jarijari, 2)+(jarijari*jarijarikecil)+Math.pow(jarijarikecil, 2)));
    }
    @Override
    public void setvalue() 
    {
        System.out.print("Masukkan Jari - Jari Kerucut Besar = ");
        jarijari = input_data.nextInt();
        System.out.print("Masukkan Jari - Jari Kerucut Kecil = ");
        jarijarikecil = input_data.nextDouble();
        System.out.print("Masukkan Tinggi Kerucut Kecil = ");
        tKerucutkecil = input_data.nextDouble();
        hitungVolume();
        hitungLuas();
    }
    @Override
    public void display() {
        System.out.println("Luas Permukaan Kerucut Terpancung= "+lKerucutkecil+"\nVolume Kerucut Terpancung= "+vKerucutkecil);
    }
}
