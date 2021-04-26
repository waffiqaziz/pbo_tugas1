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
public class TemberengBola extends Bola{
    float tinggiTembereng;
    float ltembereng;
    float vtembereng;
    @Override
    void hitungLuas() {
        ltembereng = (float) (2*Math.PI*jarijari*tinggiTembereng);
    }
    void hitungVolume(){
        vtembereng = (float) ((1.0/3.0)*Math.PI*Math.pow(tinggiTembereng, 2)*(3*jarijari-tinggiTembereng));
    }
}