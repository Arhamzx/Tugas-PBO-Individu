/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.manajemenkost;

import model.Kamar;
import model.KamarBiasa;
import model.KamarPremium;
import model.Penghuni;
import model.Pembayaran;

/**
 *
 * @author LENOVO
 */
public class ManajemenKost {

    public static void main(String[] args) {
        KamarBiasa kamar1 = new KamarBiasa(
                1,
                "A01",
                800000,
                "Kosong",
                "Kasur, Lemari, Meja"
        );
        
        KamarPremium kamar2 = new KamarPremium(
                2,
                "B01",
                1200000,
                "Kosong",
                "AC, TV, WiFi"
        );
        
        Penghuni penghuni1 = new Penghuni(
                1,
                "Arham",
                "08123456789",
                "Sangatta"
        );
        
        penghuni1.setKamar(kamar1);
        
        Pembayaran pembayaran1 = new Pembayaran(
                1,
                800000,
                "17-09-2026",
                "Lunas"
        );
        
        pembayaran1.setPenghuni(penghuni1);
        
        kamar1.tampilkanInfo();
        kamar1.tampilkanFasilitas();

        System.out.println();

        kamar2.tampilkanInfo();
        kamar2.tampilkanFasilitas();

        System.out.println();

        penghuni1.tampilkanInfo();
        System.out.println("Kamar yang ditempati : " + penghuni1.getKamar().getNomorKamar());
        
        System.out.println();

        pembayaran1.tampilkanInfo();
        System.out.println("Nama Penghuni : " + pembayaran1.getPenghuni().getNama());
        
    }
}
