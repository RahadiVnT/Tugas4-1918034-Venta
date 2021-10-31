package com.ventapratama.recycleview;
public class Mobil {
    private String nama,status,harga;
    private int img;

    public Mobil(int img, String nama, String status, String harga){
        this.img=img;
        this.nama = nama;
        this.status = status;
        this.harga = harga;

    }
    public void setImg(){
        this.img=img;
    }
    public int getImg(){
        return img;
    }

    public String getNama(){
        return nama;
    }
    public void setNama(String nama){
        this.nama = nama;
    }
    public String getStatus(){
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    public String getHarga(){return harga; }
}
