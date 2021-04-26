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
public class CincinBola extends Bola{
    float talibusur;
    float vCincinbola;
    float tinggiCincin;

    void hitungvolume(){
        vCincinbola = (float) ((1.0/6.0)*Math.PI*Math.pow(talibusur, 2)*tinggiCincin);
    }
}
