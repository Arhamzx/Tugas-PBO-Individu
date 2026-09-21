/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author LENOVO
 */
public class Penghuni {
    private int idPenghuni;
    private String nama;
    private String noHp;
    private String alamat;
    private Kamar kamar;
    
    public Penghuni(){
        
    }
    
    public Penghuni(int idPenghuni, String nama, String noHp, String alamat){
        this.idPenghuni = idPenghuni;
        this.nama = nama;
        this.noHp = noHp;
        this.alamat = alamat;
    }
    
    
    public Kamar getKamar() {
    return kamar;
    }

    public void setKamar(Kamar kamar) {
        this.kamar = kamar;
    }
    
    public int getIdPenghuni() {
    return idPenghuni;
    }

    public void setIdPenghuni(int idPenghuni) {
        this.idPenghuni = idPenghuni;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNoHp() {
        return noHp;
    }

    public void setNoHp(String noHp) {
        this.noHp = noHp;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
    public void tampilkanInfo() {
    System.out.println("=== DATA PENGHUNI ===");
    System.out.println("Nama    : " + nama);
    System.out.println("No. HP  : " + noHp);
    System.out.println("Alamat  : " + alamat);
    }
    
}
