
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
public class siswa2 implements User1 {
  public int getJmlhsiswa() {
        return this.status.size();
    }
    private ArrayList<String> namaSiswa= new ArrayList<String>();
    private ArrayList<String> alamat = new ArrayList<String>();
    private ArrayList<String> telepon= new ArrayList<String>();
    private ArrayList<Boolean> status= new ArrayList<Boolean>();

    
    public siswa2(){
        this.namaSiswa.add ("aurel");
        this.alamat.add ("Kediri");
        this.telepon.add("                11234");
        this.status.add (Boolean.TRUE);
        
        this.namaSiswa.add ("uwen");
        this.alamat.add ("Blitar");
        this.telepon.add("                12234");
        this.status.add (Boolean.TRUE);
        
        this.namaSiswa.add ("rani");
        this.alamat.add ("Malang");
        this.telepon.add("                12334");
        this.status.add (Boolean.FALSE);
        
        this.namaSiswa.add ("orin");
        this.alamat.add ("Jogja");
        this.telepon.add("                12344");
        this.status.add (Boolean.FALSE);
        
    }
    // set get boolean 
    
    
    @Override
    public void setNama(String namaSiswa) {
        this.namaSiswa.add(namaSiswa);
    }

    @Override
    public void setAlamat(String alamat) {
        this.alamat.add(alamat);
    }

    @Override
    public void setTelepon(String telepon) {
        this.telepon.add (telepon);
    }

    public void setStatus (boolean status){
        this.status.add (status);
    }
    
    @Override
    public String getNama(int idSiswa) {
        return this.namaSiswa.get(idSiswa);
    }

    @Override
    public String getAlamat(int idSiswa) {
        return this.alamat.get(idSiswa);
    }

    @Override
    public String getTelepon(int idSiswa) {
        return this.telepon.get (idSiswa);
    }
    
    public Boolean getStatus (boolean status, int idSiswa) {
        return this.status.get (idSiswa);
    }
    public void editStatus(int idSiswa , boolean Status){
        this.status.set (idSiswa, Status);
    }

    boolean getStatus(int idSiswa) {
       return this.status.get(idSiswa);
    }
  
}
