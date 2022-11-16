/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.quiz_21103072;

/**
 *
 * @author fatur
 * 21103072
 * S1SI05C
 */
public class Dokter_21103072 extends Penduduk_21103072 {
    int jmlPasien;
    int jmlObat;
    double totalPendapatanDokter;
    
    public void DataDokter(){
        System.out.println("Jumlah Pasien : " + jmlPasien);
        System.out.println("Jumlah Obat : " + jmlObat);
    }
    
    public double totalPendapatanDokter (){
        return totalPendapatanDokter = (jmlPasien * 50.000) + (jmlObat * 10.000);
    }
}