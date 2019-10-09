/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo10118045latihan20targetsaldotabungan;

import java.text.DecimalFormat;

/**
 *
 * @author 
 * Nama     :   Muhammad Ilham Apriyadi
 * Kelas    :   IF 2
 * NIM      :   10118045
 * Deskripsi Program : Program Target Saldo Tabungan
 */
public class PBO10118045Latihan20TargetSaldoTabungan {

    /**
     * @param args the command line arguments
     */
    
     private static DecimalFormat df2 = new DecimalFormat("#.##");
     
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        int i;
        i = 1;
        double saldo = 3500000;
        
        while(saldo<6000000){
            saldo=saldo+(saldo*0.08);
            System.out.println("Saldo di bulan ke-"+i+" Rp. "+df2.format(saldo));
            i++;
        }
            
        
            
    }
    
}
