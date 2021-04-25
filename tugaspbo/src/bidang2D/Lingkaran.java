/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bidang2D;

/**
 *
 * @author Waffiq Aziz
 */
public class Lingkaran implements Bidang2D{
  protected int jarijari;
  protected double lkeliling;
  protected double lluas;
  
  @Override
  public void hitungKeliling() {
    lkeliling  = 2 * Math.PI * r;
  }

  @Override
  public void hitungLuas() {
    lluas  = Math.PI * r * r;
  }
  void display(){
    System.out.println("MAS000KKKk");
  }
}
