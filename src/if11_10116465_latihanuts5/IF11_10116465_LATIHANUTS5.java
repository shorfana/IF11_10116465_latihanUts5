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
public class IF11_10116465_LATIHANUTS5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        JajarGenjang JG = new JajarGenjang(50, 60, 70, 80, 100, 120);
        JG.hitungKeliling();
        JG.hitungLuas();
        System.out.println("\n");
        Segitiga SG = new Segitiga(50, 60, 70, 100, 120);
        SG.hitungKeliling();
        SG.hitungLuas();
        
    }
    
}
