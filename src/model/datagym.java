/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Lab Informatika
 */
public class datagym {
    private String pemilik;
    private String alat;
    private String no;
    private double waktu_sewa;
    private int biaya;

    public String getPemilik() {
        return pemilik;
    }

    public void setPemilik(String pemilik) {
        this.pemilik = pemilik;
    }

    public String getAlat() {
        return alat;
    }

    public void setAlat(String alat) {
        this.alat = alat;
    }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public double getWaktu_sewa() {
        return waktu_sewa;
    }

    public void setWaktu_sewa(double waktu_sewa) {
        this.waktu_sewa = waktu_sewa;
    }

    public int getBiaya() {
        return biaya;
    }

    public void setBiaya(int biaya) {
        this.biaya = biaya;
    }
}
