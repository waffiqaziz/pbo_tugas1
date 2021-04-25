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
    @Override
    public void hitungLuas() {
        super.hitungLuas();
        ljuringbola = (float) ((luasbola)/(2*jarijari)*tinggi);
    }
    void hitungvolume(){
        vjuringbola = (float) (lluas*(2f/3)*tinggi);
    }
}
