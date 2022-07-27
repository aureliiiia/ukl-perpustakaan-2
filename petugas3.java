
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
public class petugas3 implements User1 {
    public int getJmlhpetugas() {
        return this.telepon.size();
    }
    private ArrayList<String> namaKaryawan= new ArrayList<String>();
    private ArrayList<String> alamat = new ArrayList<String>();
    private ArrayList<String> telepon= new ArrayList<String>();
    
    public petugas3(){
        this.namaKaryawan.add ("Belv");
        this.alamat.add ("Malang");
        this.telepon.add ("55678");
        
        this.namaKaryawan.add ("Rio");
        this.alamat.add ("Kediri");
        this.telepon.add ("56678");
        
        this.namaKaryawan.add ("Sasa");
        this.alamat.add ("Blitar");
        this.telepon.add ("56778");
        
        this.namaKaryawan.add ("Galuh");
        this.alamat.add ("Jakarta");
        this.telepon.add ("56788");
    }

    @Override
    public void setNama(String namaKaryawan) {
        this.namaKaryawan.add (namaKaryawan);
    }

    @Override
    public void setAlamat(String alamat) {
        this.namaKaryawan.add (alamat);
    }

    @Override
    public void setTelepon(String telepon) {
        this.namaKaryawan.add (telepon);
    }
    

    @Override
    public String getNama(int id) {
        return this.namaKaryawan.get(id);
    }

    @Override
    public String getAlamat(int id) {
        return this.alamat.get(id);
    }

    @Override
    public String getTelepon(int id) {
        return this.telepon.get (id);
    }
    
    
}
