package com.PRAK201_2310817220018_DeviHafidaAriyani;

class Buah {
	 String nama;
	 double beratPerUnit;
	 double hargaPerUnit;

	    public void tampilkanInformasi(double jumlahBerat) {
	        double hargaSebelumDiskon = (jumlahBerat / beratPerUnit) * hargaPerUnit;
	        int jumlahKelipatanDiskon = (int) (jumlahBerat / 4);
	        double diskon = jumlahKelipatanDiskon * (0.02 * 4 * hargaPerUnit);
	        double hargaSetelahDiskon = hargaSebelumDiskon - diskon;

	        System.out.println("Nama Buah: " + nama);
	        System.out.println("Berat: " + beratPerUnit + "kg");
	        System.out.println("Harga: Rp" + hargaPerUnit);
	        System.out.println("Jumlah Beli: " + jumlahBerat + "kg");
	        System.out.printf("Harga Sebelum Diskon: Rp%.2f\n", hargaSebelumDiskon);
	        System.out.printf("Total Diskon: Rp%.2f\n", diskon);
	        System.out.printf("Harga Setelah Diskon: Rp%.2f\n", hargaSetelahDiskon);
	        System.out.println();
	    }
}