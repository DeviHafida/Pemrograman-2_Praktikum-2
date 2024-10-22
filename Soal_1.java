package com.PRAK201_2310817220018_DeviHafidaAriyani;

public class Soal_1 {
	public static void main(String[] args) {
        Buah apel = new Buah();
        apel.nama = "Apel";
        apel.beratPerUnit = 0.4;
        apel.hargaPerUnit = 7000;
        apel.tampilkanInformasi(40);

        Buah mangga = new Buah();
        mangga.nama = "Mangga";
        mangga.beratPerUnit = 0.2;
        mangga.hargaPerUnit = 3500;
        mangga.tampilkanInformasi(15);

        Buah alpukat = new Buah();
        alpukat.nama = "Alpukat";
        alpukat.beratPerUnit = 0.25;
        alpukat.hargaPerUnit = 10000;
        alpukat.tampilkanInformasi(12);
    }
}