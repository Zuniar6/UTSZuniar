package com.example.uts.kategori;

public class Kategori {

    private String judul;
    private String outlet;
    private String deskripsi;
    private String imageURL;

    public Kategori(String judul, String outlet, String deskripsi, String imageURL) {
        this.judul = judul;
        this.outlet = outlet;
        this.deskripsi = deskripsi;
        this.imageURL = imageURL;
    }

    Kategori() {

    }

    String getImageURL() {
        return imageURL;
    }

    void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }

    String getJudul() {
        return judul;
    }

    void setTitle(String judul) {
        this.judul = judul;
    }

    String getOutlet() {
        return outlet;
    }

    void setOutlet(String outlet) {
        this.outlet = outlet;
    }

    String getDeskripsi() {
        return deskripsi;
    }

    void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }
}
