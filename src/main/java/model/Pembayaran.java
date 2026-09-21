/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author LENOVO
 */
public class Pembayaran {
    private int idPembayaran;
    private double jumlahBayar;
    private String tanggalPembayaran;
    private String statusPembayaran;
    private Penghuni penghuni;
    
    public Pembayaran(){
        
    }
    
    public Pembayaran(int idPembayaran, double jumlahBayar, String tanggalPembayaran, String statusPembayaran){
        this.idPembayaran = idPembayaran;
        this.jumlahBayar = jumlahBayar;
        this.tanggalPembayaran = tanggalPembayaran;
        this.statusPembayaran = statusPembayaran;
    }
    
     public int getIdPembayaran() {
        return idPembayaran;
    }

    public void setIdPembayaran(int idPembayaran) {
        this.idPembayaran = idPembayaran;
    }

    public double getJumlahBayar() {
        return jumlahBayar;
    }

    public void setJumlahBayar(double jumlahBayar) {
        this.jumlahBayar = jumlahBayar;
    }

    public String getTanggalPembayaran() {
        return tanggalPembayaran;
    }

    public void setTanggalPembayaran(String tanggalPembayaran) {
        this.tanggalPembayaran = tanggalPembayaran;
    }

    public String getStatusPembayaran() {
        return statusPembayaran;
    }

    public void setStatusPembayaran(String statusPembayaran) {
        this.statusPembayaran = statusPembayaran;
    }
    
    public Penghuni getPenghuni() {
        return penghuni;
    }

    public void setPenghuni(Penghuni penghuni) {
            this.penghuni = penghuni;
    }
    public void tampilkanInfo() {
    System.out.println("=== DATA PEMBAYARAN ===");
    System.out.println("Jumlah Bayar       : Rp" + jumlahBayar);
    System.out.println("Tanggal Pembayaran : " + tanggalPembayaran);
    System.out.println("Status Pembayaran  : " + statusPembayaran);
    }
}
