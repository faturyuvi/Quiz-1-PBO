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
public class Nelayan_21103072 extends Penduduk_21103072 {
    int jmlBeratIkan;
    int jmlSolar;
    double totalPendapatNelayan;

    public double totalPendapatNelayan() {
        return totalPendapatNelayan = (jmlBeratIkan * 8.000) + (jmlSolar + 10.000);
    }
    
    public void DataNelayan(){
        System.out.println("Jumlah Berat Ikan : " + jmlBeratIkan);
        System.out.println("Jumlah Pakai Solar : " + jmlSolar);
    }
}
