
import java.util.ArrayList;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DELL
 */
public class peminjaman05 {
    public int getJmlhpeminjaman() {
        return this.banyak.size();
    }
    private ArrayList <Integer> idSiswa = new ArrayList<Integer>();
    private ArrayList <Integer> idBuku = new ArrayList<Integer>();
    private ArrayList <Integer> banyak = new ArrayList<Integer>();
    
    public peminjaman05(){
        this.idSiswa.add(0);
        this.idBuku.add(0);
        this.banyak.add(2);
        
        this.idSiswa.add(0);
        this.idBuku.add(1);
        this.banyak.add(3);
        
        this.idSiswa.add(1);
        this.idBuku.add(0);
        this.banyak.add(1);
        
        this.idSiswa.add(1);
        this.idBuku.add(2);
        this.banyak.add(2);
    }
         public void prosesTransaksi (siswa2 siswa, peminjaman05 peminjaman, buku4 buku){
    Scanner scan = new Scanner(System.in);
        System.out.println("AYO LITERASI!");
        System.out.println("Masukkan ID Siswa");

        int idSiswa = scan.nextInt();
        System.out.println("Selamat Datang Di Perpustakaan SMK Telkom Malang " + siswa.getNama(idSiswa));
        ArrayList<Integer> idBuku = new ArrayList<Integer>();
        ArrayList<Integer> banyak = new ArrayList<Integer>();
        int i = 0;
        int temp = 0;
        if (siswa.getStatus(idSiswa) == false) {
            System.out.println("Tidak Bisa Pinjam");
        } else {
            do {
                System.out.print("Masukkan Kode Buku : ");
                temp = scan.nextInt();
                if (temp != 99) {

                    idBuku.add(temp);
                    System.out.print(buku.getNama(idBuku.get(i)) + " Sebanyak : ");
                    banyak.add(scan.nextInt());
                    i++;

                }
            } while (temp != 99);

            System.out.println("Transaksi Peminjaman " + siswa.getNama(idSiswa) + " Sebagai Berikut");
            System.out.println("Nama Barang \tQty \tHarga \tJumlah ");
            int total = 0;
            int x = idBuku.size();
            for (int j = 0; j < x; j++) {
                int jumlah = banyak.get(j) * buku.getHarga(idBuku.get(j));
                total += jumlah;

                System.out.println(buku.getNama(idBuku.get(j)) + "\t"+ banyak.get(j) + "\t" +buku.getHarga(idBuku.get(j)) + "\t"+ jumlah);
                peminjaman.setPinjaman(buku, idSiswa, idBuku.get(j), banyak.get(j));
            }

            System.out.println("Total Belanja : " + total);
            siswa.editStatus(idSiswa, false);
        }
    }

    public void setPinjaman(buku4 buku, int idSiswa, int idBuku, int banyaknya) {

        this.idSiswa.add(idSiswa);
        this.idBuku.add(idBuku);
        this.banyak.add(banyaknya);
        buku.editStok(idBuku, buku.getStok(idBuku) - banyaknya);
    }

    public int getIdBuku(int id) {
        return this.idBuku.get(id);
    }

    public int getBanyaknyaBuku(int id) {
        return this.banyak.get(id);
    }

    public int getIdSiswa(int id) {
        return this.idSiswa.get(id);
    }

    public int getJmlTransaksi() {
        return this.idSiswa.size();
    }

    public int getJmlPeminjaman() {
        return this.idSiswa.size();
    }
 
}
