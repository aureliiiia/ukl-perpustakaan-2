/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DELL
 */
public class laporan6 {
   public void laporan(buku4 buku) {
        int x = buku.getJmlhBuku();

     
       System.out.println("\t\t\t** PERPUSTAKAAN SMK TELKOM MALANG **");
        System.out.println("\t\t\t\t* AYO LITERASI*");
         System.out.println();
       System.out.println();
        System.out.println("== DAFTAR BUKU ==");
        System.out.println("Judul Buku \t\tStok Buku \tHarga Buku");
        for (int i = 0; i < x; i++) {
            System.out.println(buku.getNama(i) + "\t" +"\t"+"\t"+ (buku.getStok(i)) +"\t"+  "\t"+ (buku.getHarga(i)));

        }

    }

    public void laporan(siswa2 siswa) {
        int x = siswa.getJmlhsiswa();
         
       System.out.println();
       System.out.println();
             
        System.out.println("== DAFTAR SISWA SMK TELKOM MALANG ==");
        System.out.println("Nama\tAlamat\t\t\tTelepon \tStatus");
        for (int i = 0; i < x; i++) {
            System.out.println(siswa.getNama(i) + "\t"+ siswa.getAlamat(i) + "\t"  + siswa.getTelepon(i) + "\t" +"\t"+ siswa.getStatus(i) );

        }

    }
    
    
    public void laporan(petugas3 petugas) {
        int x = petugas.getJmlhpetugas();

        System.out.println();
        System.out.println("== DAFTAR PETUGAS SMK TELKOM MALANG==");
        System.out.println();
        System.out.println("Nama  \tAlamat \tTelepon ");
        for (int i = 0; i < x; i++) {
            System.out.println(petugas.getNama(i) + "\t"+ petugas.getAlamat(i) + "\t" + petugas.getTelepon(i));

        }

    }

    public void laporan(peminjaman05 peminjaman, buku4 koleksibuku) {
        int x = peminjaman.getJmlhpeminjaman();

        System.out.println();
        System.out.println();
        System.out.println("== DAFTAR HARGA BUKU ==");
     
        System.out.println("Nama Barang\tQty \tHarga \tJumlah");

        int total = 0;
        for (int i = 0; i < x; i++) {
            int jumlah = peminjaman.getBanyaknyaBuku(i) * koleksibuku.getHarga(peminjaman.getIdBuku(i));
            total += jumlah;
            System.out.println(koleksibuku.getNama(peminjaman.getIdBuku(i)) + "\t" +"\t" +peminjaman.getBanyaknyaBuku(i) + "\t" + koleksibuku.getHarga(peminjaman.getIdBuku(i)) + "\t" + jumlah);
        }
        System.out.println("Total Profit : " + total);
    }  
}
