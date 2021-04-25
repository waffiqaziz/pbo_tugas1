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
public class Bola{
    protected int jarijari;
    protected double lkeliling;
    protected double lluas;
    double luasbola;
    double kelilingbola;

    void hitungLuas() {
        luasbola =  4*(Math.PI*Math.pow(jarijari, 2));
    }
    void hitungKeliling() {
        kelilingbola = (4.0/3.0)*Math.PI*Math.pow(jarijari, 2);
    }
}
