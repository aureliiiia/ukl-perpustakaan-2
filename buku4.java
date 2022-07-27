
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DELL
 */
public class buku4 {
  private ArrayList<String> namaBuku = new ArrayList <String>();
    private ArrayList<Integer> stok = new ArrayList <Integer>();
    private ArrayList<Integer> harga = new ArrayList <Integer>();
    
    public buku4 (){
        this.namaBuku.add ("Sastra");
        this.stok.add (10);
        this.harga.add (75000);
        
        this.namaBuku.add ("Romance");
        this.stok.add (20);
        this.harga.add (50000);
        
        this.namaBuku.add ("Cerpen");
        this.stok.add (25);
        this.harga.add (85000);
        
        this.namaBuku.add ("Religi");
        this.stok.add (30);
        this.harga.add (70000);
        
        this.namaBuku.add ("Tafsir");
        this.stok.add (15);
        this.harga.add (65000);
    }

    public int getJmlhBuku(){
        return this.namaBuku.size(); 
    }
    public void setNama(String namaBuku) {
         this.namaBuku.add (namaBuku);
    }
    public void setStok(int stok) {
        this.stok.add (stok);
    }

    public void setHarga(int harga) {
        this.harga.add (harga);
    }

    public String getNama(int idBuku) {
        return this.namaBuku.get(idBuku);
    }
    
    public void editStok(int idBuku,int stok) {
        this.stok.set(idBuku,stok);
    }
    public Integer getHarga(int idBuku) {
        return this.harga.get(idBuku);
}
    public Integer getStok(int idBuku) {
        return this .stok.get(idBuku);
}  
}
