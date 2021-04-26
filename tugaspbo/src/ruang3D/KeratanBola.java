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
public class KeratanBola extends Bola{
    float lkeratanbola;
    float vkeratanbola;
    private float jarijariA;
    private float jarijariB;
    private float tinggiAB;
    //ini harusnya ada 2 jari2 bidang atas sama bidang bawah.
    void hitungluas(){
        lkeratanbola = (float) (0.5*Math.PI*Math.pow(jarijariA, 2)*tinggiAB + 0.5*Math.PI*Math.pow(jarijariB, 2)*tinggiAB + (1.0/6.0)*Math.pow(tinggiAB, 6));
    }
    void hitungvolume(){
        vkeratanbola = (float) (0.5*Math.PI*Math.pow(jarijariA, 2)*tinggiAB + 0.5*Math.PI*Math.pow(jarijariB, 2)*tinggiAB + (1.0/6.0)*Math.pow(tinggiAB, 6));
    }
}
