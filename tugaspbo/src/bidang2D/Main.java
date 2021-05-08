/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bidang2D;
import java.util.Scanner;

import ruang3D.Bola;
import ruang3D.CincinBola;
import ruang3D.TemberengBola;
import ruang3D.JuringBola;
import ruang3D.KeratanBola;
import ruang3D.Kerucut;
import ruang3D.KerucutTerpancung;
import ruang3D.Tabung;
/*
Anggota Kelompok:
    Waffiq Aziz (123190070)
    Muhammad Khadafie Satya Sudarto (123190072)
    Shean Michael Aqshafa Ditamaputra (123190096)
*/
public class Main{

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    int menu;
      Scanner Input = new Scanner(System.in);
      Lingkaran objLingkaran = new Lingkaran();
      Bola objBola1 = new Bola();
      Bola objBola2 = new TemberengBola();
      Bola objBola3 = new JuringBola();
      Bola objBola4 = new KeratanBola();
      Bola objBola5 = new CincinBola();  
      Kerucut objKerucut1 = new Kerucut();
      Kerucut objKerucut2 = new KerucutTerpancung();
      Tabung objTabung = new Tabung();
      do{
          System.out.println("--INPUT DATA--");
          System.out.println("1. Lingkaran");
          System.out.println("2. Bola");
          System.out.println("3. Tabung");
          System.out.println("4. Kerucut");
          System.out.println("5. Keluar");
          System.out.print("Pilih = ");
          menu=Input.nextInt();
          if(menu==1)
          {
            objLingkaran.setvalue();
            objLingkaran.display();
          }
          else if(menu==2)
          {
            int menuBola;
            System.out.print( "--MENU BOLA--\n"+
                                "1. Luas dan Volume Bola\n"+
                                "2. Tembereng Bola\n"+
                                "3. Juring Bola\n"+
                                "4. Keratan Bola\n"+
                                "5. Cincin Bola\n"+
                                "Pilih = ");
            menuBola = Input.nextInt();
            switch(menuBola){
              case 1 :
                objBola1.setvalue();
                objBola1.display();
                break;
              case 2 :
                objBola2.setvalue();
                objBola2.display();
                break;
              case 3 :
                objBola3.setvalue();
                objBola3.display();
                break;
              case 4 :
                objBola4.setvalue();
                objBola4.display();
                break;
              case 5 :
                objBola5.setvalue();
                objBola5.display();
                break;
              default : System.out.println("Salah input, pilih ulang!");break;
            }
          }
          else if(menu==3)
          {
            objTabung.setvalue();
            objTabung.display();
          }
          else if(menu==4)
          {
            int menuKerucut;

            System.out.print( "Menu Kerucut\n"+
                              "1. Luas dan Keliling Kerucut\n"+
                              "2. Kerucut Terpancung\n"+
                              "Pilih = ");
            menuKerucut = Input.nextInt();
            switch(menuKerucut){
              case 1 :
                objKerucut1.setvalue();
                objKerucut1.display();
                break;
              case 2 :
                objKerucut2.setvalue();
                objKerucut2.display();
                break;
              default : System.out.println("Salah input, pilih ulang!");break;
            }                
          }
          else if(menu==5)
          {
              break;
          }
          else
          {
            System.out.println("Salah input, pilih ulang!");
          }
    }while(true);
  }
}