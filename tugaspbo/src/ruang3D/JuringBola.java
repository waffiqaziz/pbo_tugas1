/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ruang3D;

/**
 *
 * @author Waffiq Aziz
 */
public class JuringBola extends Bola{
    float tinggi;
    float ljuringbola;
    float vjuringbola;
  
    void hitungLuas() {
        ljuringbola = (float) (2*Math.PI*jarijari*tinggi);
    }
    void hitungvolume(){
        super.hitungLuas();
        vjuringbola = (float) (lluas*(2/3)*tinggi);
    }
}
