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
public class KerucutTerpancung extends Kerucut{
    float jarijarikecil;
    float vKerucutkecil;
    float kKerucutkecil;
    float tKerucutkecil;

    @Override
    void hitungKeliling() {
        super.hitungsisimiring(); //tinggi yang dimasukin yang kerucut kecil
        kKerucutkecil = (float) (Math.PI*sisimiring*(jarijari+jarijarikecil)+Math.PI*(Math.pow(jarijari, 2)+Math.pow(jarijarikecil, 2)));
    }
    @Override
    void hitungLuas() {
        vKerucutkecil = (float) ((1.0/3.0)*Math.PI*tKerucutkecil*(Math.pow(jarijari, 2)+(jarijari*jarijarikecil)+Math.pow(jarijarikecil, 2)));
    }
}
