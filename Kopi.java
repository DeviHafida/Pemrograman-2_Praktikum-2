package com.PRAK202_2310817220018_DeviHafidaAriyani;

public class Kopi {
	String namaKopi;
	String ukuran;
	double harga;
	private String pembeli;
	
	// Method untuk menampilkan informasi kopi
    public void info() {
        System.out.println("Nama Kopi: " + namaKopi);
        System.out.println("Ukuran: " + ukuran);
        System.out.println("Harga: Rp. " + harga);
    }
    
    // Method untuk mengatur nama pembeli
    public void setPembeli(String pembeli) {
        this.pembeli = pembeli;
    }
    
    // Method untuk mendapatkan nama pembeli
    public String getPembeli() {
        return this.pembeli;
    }
    
    // Method untuk menghitung pajak 11%
    public double getPajak() {
        return harga * 0.11;
    }
}