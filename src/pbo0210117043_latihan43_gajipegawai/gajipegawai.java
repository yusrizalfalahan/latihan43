/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo0210117043_latihan43_gajipegawai;

/**
 *
 * @author Acer
 */
public class gajipegawai {
    private String nama;
     private String alamat;
     private int uangtransport;
     private int uangtunjangan;
     private int gajipokok;
     private int totalGaji;

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public int getUangtransport() {
        return uangtransport;
    }

    public void setUangtransport(int uangtransport) {
        this.uangtransport = uangtransport;
    }

    public int getUangtunjangan() {
        return uangtunjangan;
    }

    public void setUangtunjangan(int uangtunjangan) {
        this.uangtunjangan = uangtunjangan;
    }

    public int getGajipokok() {
        return gajipokok;
    }

    public void setGajipokok(int gajipokok) {
        this.gajipokok = gajipokok;
    }

    public int getTotalGaji() {
        return totalGaji;
    }

    public void setTotalGaji(int totalGaji) {
        this.totalGaji = totalGaji;
    }
     
     public int totalgaji(int uangtunjangan, int uangtransport, int gajipokok){
        return totalGaji= gajipokok +uangtunjangan+uangtransport;
         
     }
     public int Tampildata(String nama, String alamat, int uangtunjangan,
             int uangtransport, int gajipokok, int totalGaji){
         return totalGaji = uangtunjangan + uangtransport + gajipokok;
         
         
        
         
         
        }
      
    
}
