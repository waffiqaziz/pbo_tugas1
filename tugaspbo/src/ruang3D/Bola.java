/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ruang3D;
import bidang2D.Lingkaran;
import bidang2D.Bidang2D;
/**
 *
 * @author Waffiq Aziz
 */
public class Bola extends Lingkaran{
    double luasbola;
    double kelilingbola;
    @Override
    public void hitungLuas() {
        super.hitungLuas();
        luasbola =  4*lluas;
    }
    @Override
    public void hitungKeliling() {
        super.hitungKeliling();
        kelilingbola = lkeliling * (2/3) *jarijari;
    }
}
