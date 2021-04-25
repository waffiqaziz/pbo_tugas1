/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ruang3D;
import java.lang.Math;
/**
 *
 * @author Waffiq Aziz
 */
public class Kerucut{
    int tinggi;
    int jarijari;
    float luas;
    float keliling;
    float sisimiring;

    void hitungsisimiring(){
        sisimiring = (float) (Math.sqrt((Math.pow(jarijari, 2)) + (Math.pow(tinggi, 2))));
    }

    void hitungKeliling(){
        keliling = (float) (Math.PI*jarijari*(jarijari+sisimiring));
    }
}
