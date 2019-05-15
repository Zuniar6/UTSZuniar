package com.example.uts.restoran;

public class Restoran {

    private String nama_restaurant;
    private String lokasi;
    private String harga;
    private String imageURL;

    public Restoran(String nama_restaurant, String lokasi, String harga, String imageURL) {
        this.nama_restaurant = nama_restaurant;
        this.lokasi = lokasi;
        this.harga = harga;
        this.imageURL = imageURL;
    }

    Restoran(){

    }

    String getNama_restaurant() {
        return nama_restaurant;
    }

    void setNama_restaurant(String nama_restaurant) {
        this.nama_restaurant = nama_restaurant;
    }

    String getLokasi() {
        return lokasi;
    }

    void setLokasi(String lokasi) {
        this.lokasi = lokasi;
    }

    String getHarga() {
        return harga;
    }

    void setHarga(String harga) {
        this.harga = harga;
    }

    String getImageURL() {
        return imageURL;
    }

    void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }
}
