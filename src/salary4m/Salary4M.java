/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package salary4m;
import penggajian.*;
import java.util.ArrayList;

/**
 *
 * @author Administrator 10
 */
public class Salary4M {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String [] nama1 = {"A", "B"};
        String nama2 [] = {"C", "D"};
        String nama3 [] = new String[5];
        
        nama3[0] = "A";
        nama3[1]="B";
        nama3[2]="B";
        nama3[3]="Anam3";
        nama3[4]="B";
        
        int tahun [] = new int[5];
        tahun[0]=2021;
        tahun[1]=2022;
        tahun[2]=2023;
        tahun[3]=2024;
        tahun[4]=2025;
        
        System.out.println(nama3.length);
        System.out.println(tahun[4]);
        
        ArrayList <Integer> umur = new ArrayList <Integer>();
        umur.add(30);
        umur.add(40);
        umur.add(20);
        umur.add(10);
        System.out.println(String.valueOf(umur.size()));
        System.out.println(umur.get(3));
        
        ArrayList <String> kota = new ArrayList <String>();
        kota.add("Banjarmasin");
        kota.add("Banjarbaru");
        kota.add("Gambut");
        System.out.println(kota);
        // TODO code application logic here
        //karyawan myobj = new karyawan();
        //myobj.setGolongan("Golongan 3");
        //myobj.setMasaKerja(7);
        //myobj.setStatus("Menikah");
        //myobj.setTunjAnak(2);
        
        //System.out.println("Gaji Total "+ myobj.GajiTotal("Golongan 1", "Menikah", 3, 2));
     
    }
    
}
