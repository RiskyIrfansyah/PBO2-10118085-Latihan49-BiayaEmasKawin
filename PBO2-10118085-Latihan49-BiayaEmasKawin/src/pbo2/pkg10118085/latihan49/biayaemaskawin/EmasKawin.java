/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118085.latihan49.biayaemaskawin;

/**
 *
 * @author
 * NAMA     : Risky Irfansyah
 * KELAS    : IF-2
 * NIM      : 10118085
 * Deskripsi Program : Membuat program berbasis object untuk menghitung harga
 * emas kawin
 */
public class EmasKawin {
    private double berat, hargaPerGram;

    public void setBerat(double berat) {
        this.berat = berat;
    }

    public void setHargaPerGram(double hargaPerGram) {
        this.hargaPerGram = hargaPerGram;
    }
    
    public double hitungTotalHarga() {
        return berat * hargaPerGram;
    }
}