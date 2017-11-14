/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if11_10116465_latihanuts5;

/**
 *
 * @author shorfana
 */
public class Segitiga implements BangunDatar{
    int luas;
    int keliling;
    final int sisiAb;
    final int sisiBc;
    final int sisiCa;
    final int alas;
    final int tinggi;

    public Segitiga(int ab,int bc,int ca,int alas,int tinggi) {
        this.sisiAb = ab;
        this.sisiBc = bc;
        this.sisiCa = ca;
        this.alas = alas;
        this.tinggi = tinggi;
    }
    
    
    
    public void hitungLuas() {
        luas  = (int) (0.5 * alas * tinggi);
        System.out.println("Luas Segitiga : "+luas);
    }

    
    public void hitungKeliling() {
        keliling = sisiAb+sisiBc+sisiCa;
        System.out.println("Keliling Segitiga : "+keliling);
    }
    
}
