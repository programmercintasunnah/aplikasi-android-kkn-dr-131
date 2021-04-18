package com.example.kkndr131;

public class SetterGetter_dakwah {
    String gambar,judul,pemateri,tgl;

    public SetterGetter_dakwah(String gambar, String judul, String pemateri, String tgl) {
        this.gambar = gambar;
        this.judul = judul;
        this.pemateri = pemateri;
        this.tgl = tgl;
    }

    public String getGambar() {
        return gambar;
    }

    public void setGambar(String gambar) {
        this.gambar = gambar;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getPemateri() {
        return pemateri;
    }

    public void setPemateri(String pemateri) {
        this.pemateri = pemateri;
    }

    public String getTgl() {
        return tgl;
    }

    public void setTgl(String tgl) {
        this.tgl = tgl;
    }
}
