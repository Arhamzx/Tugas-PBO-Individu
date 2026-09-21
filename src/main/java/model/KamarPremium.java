/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author LENOVO
 */
public class KamarPremium extends Kamar{
    private String fasilitasTambahan;
    
    public KamarPremium(){
        
    }
    
    public KamarPremium(int idKamar, String nomorKamar, double hargaSewa, String status, String fasilitasTambahan){
        super(idKamar, nomorKamar, hargaSewa, status);
        this.fasilitasTambahan = fasilitasTambahan;
    }
    
    public String getFasilitasTambahan() {
        return fasilitasTambahan;
    }

    public void setFasilitasTambahan(String fasilitasTambahan) {
        this.fasilitasTambahan = fasilitasTambahan;
    }
    public void tampilkanFasilitas() {
    System.out.println("Fasilitas Tambahan : " + fasilitasTambahan);
    }
}
