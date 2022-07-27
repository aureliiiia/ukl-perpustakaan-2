/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DELL
 */
public class Hasil7 {
 public static void main(String[] args) {
        siswa2 s = new siswa2();
        petugas3 p = new petugas3();
        buku4 b = new buku4();
        peminjaman05 P = new peminjaman05();
        laporan6 l = new laporan6();
        l.laporan(b);
        l.laporan(s);
        l.laporan(P, b);
        P.prosesTransaksi(s, P, b);
        l.laporan(P, b);
        l.laporan(b);
        l.laporan(s);
}   
}
