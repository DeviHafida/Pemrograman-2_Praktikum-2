package com.PRAK203_2310817220018_DeviHafidaAriyani;

public class Soal3Main {
    public static void main(String[] args) {
        // Pada baris ini terjadi error karena kurangnya titik koma (;)
        // Pegawai p1 = new Pegawai();
        // Perbaikan: Menambahkan titik koma di akhir baris.
        Pegawai p1 = new Pegawai(); // Menggunakan kelas Pegawai untuk membuat objek p1.

        // Pada baris ini terjadi error karena kurangnya titik koma (;)
        // p1.nama = "Roi"
        // Perbaikan: Menambahkan titik koma di akhir baris.
        p1.nama = "Roi"; // Menetapkan nama pegawai.

        // Pada baris ini terjadi error karena variabel asal seharusnya String
        // dan seharusnya menyimpan String, tetapi karakter tidak bisa digunakan untuk nama daerah.
        // p1.asal = 'Kingdom of Orvel'; 
        // Perbaikan: Mengganti tanda petik tunggal (' ') dengan tanda petik ganda (" ") untuk menetapkan String.
        p1.asal = "Kingdom of Orvel"; // Menetapkan asal pegawai.

        // Pada baris ini terjadi error karena metode setJabatan tidak dipanggil dengan parameter yang sesuai
        // p1.setJabatan();
        // Perbaikan: Menambahkan parameter "Assasin" untuk metode setJabatan.
        p1.setJabatan("Assasin"); // Menetapkan jabatan pegawai.

        // Output informasi pegawai
        System.out.println("Nama Pegawai: " + p1.getNama());
        System.out.println("Asal: " + p1.getAsal());
        System.out.println("Jabatan: " + p1.jabatan);
        System.out.println("Umur: " + p1.umur + " tahun"); // Menambahkan "tahun" untuk konteks umur.
    }
}