/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author LENOVO
 */
public class Kamar {
    private int idKamar;
    private String nomorKamar;
    private double hargaSewa;
    private String status;
    
    public Kamar(){
        
    }
    public Kamar(int idKamar, String nomorKamar, double hargaSewa, String status){
        this.idKamar = idKamar;
        this.nomorKamar = nomorKamar;
        this.hargaSewa = hargaSewa;
        this.status = status;
    }
    
    public int getIdKamar(){
        return idKamar;
    }
    
    public void setIdKamar(int idKamar){
        this.idKamar = idKamar;
    }
    
    public String getNomorKamar(){
        return nomorKamar;
    }
    
    public void setNomorKamar(String nomorKamar){
        this.nomorKamar = nomorKamar;
    }
    
    public double getHargaSewa(){
        return hargaSewa;
    }
    
    public void setHargaSewa(double hargaSewa){
        this.hargaSewa = hargaSewa;
    }
    
    public String getStatus(){
        return status;
    }
    
    public void setStatus(String status){
        this.status = status;
    }
    
    public void tampilkanInfo() {
    System.out.println("Nomor Kamar : " + nomorKamar);
    System.out.println("Harga Sewa  : Rp" + hargaSewa);
    System.out.println("Status      : " + status);
    }
}
