/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package petshop;

import javafx.beans.property.SimpleStringProperty;

/**
 *
 * @author Dna
 */
public class Data {
    private SimpleStringProperty namabarang, hargabarang, jumlahbarang, totalhargabarang;

    public Data(String namabarang, String hargabarang, String jumlahbarang, String totalhargabarang) {
        this.namabarang = new SimpleStringProperty(namabarang);
        this.hargabarang = new SimpleStringProperty(hargabarang);
         this.jumlahbarang = new SimpleStringProperty(jumlahbarang);
        this.totalhargabarang = new SimpleStringProperty(totalhargabarang);
    }

    public String getnamabarang() {
        return namabarang.get();
    }

    public void setnamabarang(String namabarang) {
        this.namabarang = new SimpleStringProperty(namabarang);
    }

    public String gethargabarang() {
        return hargabarang.get();
    }

    public void sethargabarang(String hargabarang) {
        this.hargabarang = new SimpleStringProperty(hargabarang);
    }

    public String getjumlahbarang() {
        return jumlahbarang.get();
    }

    public void setjumlahbarang(String jumlahbarang) {
        this.jumlahbarang = new SimpleStringProperty(jumlahbarang);
    }

    public String gettotalhargabarang() {
        return totalhargabarang.get();
    }

    public void settotalhargabarang(String totalhargabarang) {
        this.totalhargabarang = new SimpleStringProperty(totalhargabarang);
    }

}
