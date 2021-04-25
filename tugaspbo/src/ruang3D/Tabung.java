/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ruang3D;
import java.lang.Math;
import bidang2D.Lingkaran;

/**
 *
 * @author Waffiq Aziz
 */
public class Tabung extends Lingkaran{
  int tinggi;
  float ltabung;
  float vtabung;
  
  public void hitungLuas(){
    ltabung = (float)(2*lluas+(2*Math.PI*jarijari*tinggi));
  }
  
  public void hitungvolume(){
    vtabung = (float) (lluas*tinggi);
  }
}
