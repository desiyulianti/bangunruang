/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bangunruang;


/**
 *
 * @author MOKLET-2
 */
public class BangunRuang {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
      //membuat objek  Volume
      Volume baru = new Volume();
      
      baru.volume();//memanggil method volume
      baru.luaspermukaan();//memanggil method luas permukaan
      
      //membuat objek kubus
      kubus kubus = new kubus();
     //memanggil method volume dan luas permukaan kubus
      kubus.volume();//menampilkan volume kubus yang pertama
      kubus.volume(8);//menampilkan volume kubus yang kedua
      kubus.luaspermukaan();//menampilkan luaspermukaan kubus yang pertama
      kubus.luaspermukaan(11);//menampilkan luaspermukaan kubus yang kedua
      
     //membuat objek balok
     balok balok = new balok();
     //memanggil method volume dan luas permukaan balok
     balok.volume();//menampilkan volume balok yang pertama
     balok.volume(6, 4, 10);//menampilkan volume balok yang kedua
     balok.luaspermukaan();//menampilkan luaspermukaan balok yang pertama
     balok.luaspermukaan(9, 5, 11);//menampilkan luaspermukaan balok yang kedua
     
     //membuat objek tabung
     tabung tabung = new tabung();
     //memanggil method volume dan luas permukaan tabung
     tabung.volume();//menampilkan volume tabung yang pertama
     tabung.volume(14, 20);//menampilkan volume tabung yang kedua
     tabung.luaspermukaan();//menampilkan luaspermukaan tabung yang pertama
     tabung.luaspermukaan(7, 25);//menampilkan luaspermukaan tabung yang kedua
     
     //membuat objek bola
     bola bola = new bola();
     //memanggil method volume dan luas permukaan bola
     bola.volume();//menampilkan volume bola yang pertama
     bola.volume(28);//menampilkan volume bola yang kedua
     bola.luaspermukaan();//menampilkan luaspermukaan bola yang pertama
     bola.luaspermukaan(30);//menampilkan luaspermukaan bola yang kedua
 }
}
