/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package perpus;

/**
 *
 * @author Zila
 */
public class Buku {
    private int idBuku, stok;
    private String judulBuku;
    
    public Buku(int idBuku, String judulBuku, int stok){
        this.idBuku = idBuku;
        this.stok = stok;
        this.judulBuku = judulBuku;
    }
    
    public int getIdBuku(){
        return idBuku;
    }
    
    public int getStok(){
        return stok;
    }
    
    public String getJudulBuku(){
        return judulBuku;
    }
    
    public void kurangiStok(){
        this.stok--;
    }
}
