package com.cindodcindy.etherapy.model;

public class Laporan {

    private String dataLaporan;

    private int angkaSatu, angkaDua;

    public Laporan(String dataLaporan) {
        this.dataLaporan = dataLaporan;
    }

    public String getDataLaporan() {
        return dataLaporan;
    }

    public void setDataLaporan(String dataLaporan) {
        this.dataLaporan = dataLaporan;
    }

    public int getAngkaSatu() {
        return angkaSatu;
    }

    public void setAngkaSatu(int angkaSatu) {
        this.angkaSatu = angkaSatu;
    }

    public int getAngkaDua() {
        return angkaDua;
    }

    public void setAngkaDua(int angkaDua) {
        this.angkaDua = angkaDua;
    }

    public Laporan(int angkaSatu, int angkaDua) {
        this.angkaSatu = angkaSatu;
        this.angkaDua = angkaDua;
    }

    public  Laporan(String dataLaporan, int angkaDua){
        this.dataLaporan=dataLaporan;
        this.angkaDua=angkaDua;
    }
}
