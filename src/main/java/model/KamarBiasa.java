/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author LENOVO
 */
public class KamarBiasa extends Kamar{
    private String fasilitasDasar;
    
    public KamarBiasa(){
        
    }
    
    public KamarBiasa(int idKamar, String nomorKamar, double hargaSewa, String status, String fasilitasDasar){
        super(idKamar, nomorKamar, hargaSewa, status);
        this.fasilitasDasar = fasilitasDasar;
    }
    
    public String getFasilitasDasar() {
        return fasilitasDasar;
    }

    public void setFasilitasDasar(String fasilitasDasar) {
        this.fasilitasDasar = fasilitasDasar;
    }
    
    public void tampilkanFasilitas() {
    System.out.println("Fasilitas Dasar : " + fasilitasDasar);
    }
}
