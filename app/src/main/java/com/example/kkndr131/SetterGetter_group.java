package com.example.kkndr131;

public class SetterGetter_group {
    String foto,nama,jurusan;

    public SetterGetter_group(String foto, String nama, String jurusan){
        this.foto = foto;
        this.nama = nama;
        this.jurusan = jurusan;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getJurusan() {
        return jurusan;
    }

    public void setJurusan(String jurusan) {
        this.jurusan = jurusan;
    }
}
