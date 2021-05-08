/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ruang3D;

import bidang2D.Lingkaran;
/*
Anggota Kelompok:
    Waffiq Aziz (123190070)
    Muhammad Khadafie Satya Sudarto (123190072)
    Shean Michael Aqshafa Ditamaputra (123190096)
*/
public class Bola extends Lingkaran
{
    double luasbola;
    double volumebola;
    @Override
    public void hitungLuas() 
    {
        super.hitungLuas();
        luasbola = 4*luasLingkaran;
    }
    public void hitungvolume() 
    {
        volumebola = (4.0/3.0)*luasLingkaran*jarijari;
    }
    @Override
    public void setvalue()
    {
        super.setvalue();
        hitungLuas();
        hitungvolume();
    }
    @Override
    public void display()
    {
        System.out.println("Luas Bola = "+luasbola + "\nVolume Bola = "+ volumebola);
    }
}
