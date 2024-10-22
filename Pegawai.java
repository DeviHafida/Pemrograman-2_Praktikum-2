package com.PRAK203_2310817220018_DeviHafidaAriyani;

// Pada kelas ini terjadi ketidaksesuaian nama kelas dengan nama file.
// File dinamai Pegawai.java tetapi kelasnya bernama Employee.
// Perbaikan: Mengubah nama kelas menjadi Pegawai.
public class Pegawai {
    public String nama;
    // Pada baris ini terjadi error karena tipe data 'char' tidak sesuai untuk 'asal'
    // Seharusnya 'asal' adalah 'String' agar dapat menampung nama daerah
    // public char asal;
    public String asal; // Mengubah 'char' menjadi 'String' untuk menyimpan nama daerah.
    public String jabatan;
    public int umur;

    public String getNama() {
        return nama;
    }

    public String getAsal() {
        return asal;
    }

    // Pada metode ini terjadi error karena metode setJabatan tidak menerima parameter
    // Perbaikan: Menambahkan parameter 'String jabatan' pada metode setJabatan.
    public void setJabatan(String jabatan) {
        this.jabatan = jabatan; // Menggunakan parameter 'jabatan' untuk menetapkan nilai.
    }
}
