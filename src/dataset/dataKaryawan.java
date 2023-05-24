/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dataset;
import java.util.ArrayList;

/**
 *
 * @author Administrator 10
 */
public class dataKaryawan {
    
    private ArrayList<String> nip;
    private ArrayList<String> nama;
    private ArrayList<String> golongan;
    private ArrayList<String> status;
    private ArrayList<Integer> jumAnak;
    private ArrayList<Integer> masaKerja;
    
    public dataKaryawan(){
        nip = new ArrayList<String>();
        nama = new ArrayList<String>();
        golongan= new ArrayList<String>();
        status = new ArrayList<String>();
        jumAnak = new ArrayList<Integer>();
        masaKerja = new ArrayList<Integer>();
    }; //konstruktor
    
    public void insertNip(String isi){
        this.nip.add(isi);
    }
    
    public ArrayList<String> getRecordNip(){
        return this.nip;
    }
    
    public void insertMasaKerja(int isi){
        this.masaKerja.add(isi);
    }
    
    public ArrayList<Integer> getRecordMasaKerja(){
        return this.masaKerja;
    }
    
    
}
